# 1. Напишите программу, которая будет на вход принимать число N и выводить числа от -N до N
    
#     *Примеры:* 
    
#     при 5 -> -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5

n = int(input('Input a number: '))
sign = n // abs(n)

my_list = []

for i in range(-n, n + sign, sign):
    my_list.append(i)

print(*my_list, sep=', ')