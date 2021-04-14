#!/usr/bin/env python
"""Showing arbitrary argument list"""
def average(*args):
    return sum(args) / len(args)

print('average(5, 10) =', average(5, 10))
print('average(5, 10, 15) =', average(5, 10, 15))
print('average(5, 10, 15, 20) =', average(5, 10, 15, 20))

# Iterable individual elements can be passed as function arguments for arbitrary argument list
grades = [88, 75, 96, 55, 83]
print('Average of grades is', average(*grades))
