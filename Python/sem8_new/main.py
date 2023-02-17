from aiogram import Bot, Dispatcher, executor, types

bot = Bot('5805631611:AAF09WnkJcP_cTUdok1zTv3cb3bU4e1KrFw')
dp = Dispatcher(bot)

total = 150

async def on_start(_):
    print('Бот запущен.')


@dp.message_handler(commands=['start'])
async def mes_start(message: types.Message):
    await message.answer('Привет тебе')


@dp.message_handler(commands=['set'])
async def mes_set(message: types.Message):
    global total
    count = int(message.text.split()[1])
    total = count
    await message.answer(f'На стол положили {total} конфет')

@dp.message_handler()
async def mes_all(message: types.Message):
    global total
    if message.text.isdigit():
        total -= int(message.text)
    await message.answer(f'На столе осталось {total} конфет.')


executor.start_polling(dp, skip_updates=True, on_startup=on_start)
