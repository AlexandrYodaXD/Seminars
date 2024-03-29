# На семинаре спрашивали можно ли сделать .split по нескольким значениям (например, по запятым и пробелам)
# Допустим у нас есть строка my_string
my_str = 'Не мёртво то, что в вечности живёт, Со смертью времени и смерть умрёт.'
# Можно предварительно заменить все запятые на пробелы:
my_str = my_str.replace(',', ' ')
# После этого уже можем разделять
my_list = my_str.split(' ') # пробел указывать не обязательно, он по-умолчанию

# можно записать в одну строку так:
my_list = my_str.my_str.replace(',', ' ').split(' ')

# если нужно разделить еще и по букве "о", то выглядеть будет так:
my_list = my_str.my_str.replace(',', ' ').replace('о', ' ').split(' ')
