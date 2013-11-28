from math import *

def convolve(array1, window):
    array2 = []

    for i in range (0, len(array1)):
        low = max(i-len(window)/2, 0)
        high = min(i+len(window)/2, len(array1))
        total = sum(array1[low:high])
        array2.append(total)
    return array2
    
def divide(array1, x):
    array2 = []

    for i in range (0, len(array1)):
        array2.append(array1[i]/x)

    return array2

def multiply(array1, x):
    array2 = []

    for i in range (0, len(array1)):
        array2.append(array1[i]*x)

    return array2

def absolute(array1):
    array2 = []
    for i in range(0, len(array1)):
        if (array1[i] >= 0):
            array2.append(array1[i])
        else:
            array2.append(array1[i] * -1)
    return array2

def square(array1):
    array2 = []

    for i in range (0, len(array1)):
        array2.append(array1[i]*array1[i])

    return array2

def mean(array):
    mean = 0

    for i in range (0, len(array)):
        mean += array[i]
    mean = mean/len(array)
    return mean
    #return np.mean(array)

def logBase(x, base):
    return log(x,base)


def sign(value):
   
    if (value < 0):
        x = -1
    if (value == 0):
        x = 0
    if (value > 0):
        x = 1
    return x

def linSpace(array1):
    array2 = []
    lowest = min(array1)
    highest = max(array1)
    diff = highest - lowest
    space = diff/len(array1)

    for i in range (0, len(array1)):
        array2.append(i*space)
    return array2
    
    