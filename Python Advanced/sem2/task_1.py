data = [True, 2, 3.4, 'пять']

for i in range(len(data)):
    res = str(i + 1) + ' ' +\
        str(data[i]) + ' ' +\
        str(id(data[i])) + ' ' +\
        str(data[i].__sizeof__()) + ' ' +\
        str(hash(data[i])) + ' ' +\
          ('Это число' if isinstance(data[i], int | float) else '') + ' ' +\
          ('Это строка' if isinstance(data[i], str) else '')
    print(res)