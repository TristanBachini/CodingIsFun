#!/usr/bin/env python3
"""Using from import"""
# Using the from import statement you can import a comma-separated list of identifiers
# from a module them use them in your code without having to precede them with the module
# name and a dot.
from math import ceil, floor

print(ceil(10.3))
print(floor(10.7))

# Binding names for modules and module identifiers
# Sometimes it's helpful to import a module and use an abbreviation for it to simplify your code.
import statistics as stats
grades = [85, 93, 45, 87, 93]
print(stats.mean(grades))

# Computing for variance and standard deviation
data = [-2.5, -0.5, 0.5, -1.5, 2.5, 1.5, -0.5, 0.5, 1.5, -1.5]
var = stats.pvariance(data)
stddev = stats.pstdev(data)
print('variance =', var, 'standard deviation =', stddev)
