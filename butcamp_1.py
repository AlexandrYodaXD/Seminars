import matplotlib.pyplot as plt
import numpy as np

from sympy import *
from sympy.plotting import plot

from scipy.optimize import fsolve

init_printing()
x = Symbol('x')
f = -12*x**4*sin(cos(x)) - 18*x**3+5*x**2 + 10*x - 30
x_left, x_right = -8, 8.5
# plot(f, (x, x_left, x_right))

# x_arange = np.arange(x_left, x_right, 0.01)

root_1 = fsolve(f, x_left)