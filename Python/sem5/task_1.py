# В файле находится N натуральных чисел, записанных через пробел. 
# # Среди чисел не хватает одного, чтобы выполнялось условие 
# # A[i] - 1 = A[i-1]. Найдите это число.

data = '1 2 3 4 5 6 8 9 11'
data = [int(x) for x in data.split()]
data = list(map(int, data.split()))

for i in range(len(data) - 1):
    if not data[i] + 1 == data[i + 1]:
        print(data[i] + 1)


# my_func = list(filter(lambda i: not data[i] + 1 == data[i + 1], range(len(data) - 1)))
# foo = lambda data: ([data[i]-1 for i in range(0,len(data)) if data[i]-data[i-1] == 2]).pop()

# for item in my_func:
#     print(data[item] + 1)

