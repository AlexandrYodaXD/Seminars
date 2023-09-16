# ✔ Функция получает на вход строку из двух чисел через пробел.
# ✔ Сформируйте словарь, где ключом будет
# символ из Unicode, а значением — целое число.
# ✔ Диапазон пар ключ-значение от наименьшего из введённых
# пользователем чисел до наибольшего включительно.
from pprint import pprint

my_data = '12 23'


def my_func(data: str) -> dict:
    my_dict = dict()
    lower, upper = sorted(map(int, data.split()))
    for i in range(lower, upper + 1):
        my_dict[chr(i)] = i

    return my_dict


def my_func_2(data: str) -> dict:
    lower, upper = sorted(map(int, data.split()))
    return {chr(i): i for i in range(lower, upper + 1)}


pprint(my_func(my_data))
