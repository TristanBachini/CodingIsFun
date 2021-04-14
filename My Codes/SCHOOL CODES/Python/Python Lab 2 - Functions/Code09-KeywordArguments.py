#!/usr/bin/env python3
"""Showing the use of keyword arguments"""
# Keyword arguments are used to pass arguments in any order.

def rectangle_area(length = 2, width = 3):
    return length * width

print('1 width parameter and defaulty length parameter', rectangle_area(width=10))
print('2 parameters', rectangle_area(width=10, length=5))
