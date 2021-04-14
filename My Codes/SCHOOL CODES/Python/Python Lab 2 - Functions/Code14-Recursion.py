#!/usr/bin/env python3
"""Use of recursion"""

def factorial(number):
    if number <= 1:
        return 1
    return number * factorial(number - 1)

for i in range(20):
    print(f'{i}! = {factorial(i)}')
