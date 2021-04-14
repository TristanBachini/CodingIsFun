#!/usr/bin/env python3
"""Showing the use of default parameter values"""
# When a parameter value is missing, the default parameter value is assumed.

def rectangle_area(length = 2, width = 3):
    return length * width

print('0 parameter:', rectangle_area())
print('1 parameter', rectangle_area(10))
print('2 parameters', rectangle_area(10, 5))
