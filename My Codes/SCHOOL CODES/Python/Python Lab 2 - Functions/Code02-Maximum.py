#/usr/bin/env python3

def maximum(value1, value2, value3):
    """Return the maximum of three values"""
    maxValue = value1
    if value2 > maxValue:
        maxValue = value2
    if value3 > maxValue:
        maxValue = value3
    return maxValue

print('maximum(12, 27, 36):', maximum(12, 27, 36))
print('maximum(12.3, 45.6, 9.7):', maximum(12.3, 45.6, 9.7))
print('maximum("yellow", "red", "orange"):', maximum('yellow', 'red', 'orange'))
print('maximum(13.5, -3, 7):', maximum(13.5, -3, 7))

print('Using the built-in max and min functions:')
print('max("yellow", "red", "orange", "blue", "green"):', max('yellow', 'red', 'orange', 'blue', 'green'))
print('min(15, 9, 27, 14):', min(15, 9, 27, 14))
