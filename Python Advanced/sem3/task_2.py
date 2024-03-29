# ✔ Напишите функцию, которая принимает строку текста.
# ✔ Сформируйте список с уникальными кодами Unicode каждого
# символа введённой строки отсортированный по убыванию.


my_str = "Напишите функцию, которая принимает строку текста. Сформируйте список с уникальными кодами Unicode каждого символа введённой строки отсортированный по убыванию."


def my_func(data: str):
    my_lst = []
    for item in set(data):
        my_lst.append(ord(item))
    my_lst.sort(reverse=True)
    return my_lst


print(my_func(my_str))
