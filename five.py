import math
def x(z):
   return z** 2 + 3
def y():
    return math.sin(4)
def f(x, y):
    return x + y

print("Введите значение z: ")
try:
    print(f(x(int(input())), y()))
except: ValueError
