# Дана последовательность чисел. Получить список уникальных элементов заданной последовательности.

# *Пример:* 

# [1, 2, 3, 5, 1, 5, 3, 10] => [2, 10]

data = [1, 2, 3, 5, 1, 5, 3, 10]

'''
def proverka(x: int) -> bool:
    return data.count(x) == 1
'''

proverka = lambda x: data.count(x) == 1
new_data = filter(proverka, data)
new_data = list(new_data)
print(new_data)