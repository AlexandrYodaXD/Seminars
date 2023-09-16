# ✔ Продолжаем развивать задачу 2.
# ✔ Возьмите словарь, который вы получили.
# Сохраните его итераторатор.
# ✔ Далее выведите первые 5 пар ключ-значение,
# обращаясь к итератору, а не к словарю.

data = 'some string'

res = {x: ord(x) for x in data}

print(res)



iterator = iter(res.items())

for i in range(5):
    print(next(iterator))
    print(iterator.__next__())