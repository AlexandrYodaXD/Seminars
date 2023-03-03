my_list = ['барабан', '17896', 'картошка', 'диалог']

num = 89

#1
for i in range(len(my_list)):
    idx = my_list[i].find(str(num))
    if (idx != -1):
        print(f'{num} присуствует в {i+1} элементе спика')
        break
else:
    print(f'{num} отсутствует в элементах списка')

#2
for i in range(len(my_list)):
    if str(num) in my_list[i]:
        print(f'{num} присуствует в {i+1} элементе спика')
        break
else:
    print(f'{num} отсутствует в элементах списка')
