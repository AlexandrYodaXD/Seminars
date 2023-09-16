import decimal
from decimal import *
from math import pi

decimal.getcontext().prec = 42

d = 24
r = Decimal(d/2)

s = Decimal(pi) * r**2

print(s)