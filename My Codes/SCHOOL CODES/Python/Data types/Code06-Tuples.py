#!/usr/bin/env  python3
# Tuples are immutable lists

point = (23, 56, 11)
print(point)

# For a tuple with one element, there should be a trailing comma.
# Python requires this to disambiguate from (5) w/c means an int of 5.
lone_element_tuple = (5,)
print(lone_element_tuple)

# point.append(3)

# Why use tuple?
# 1. Some data are immutable by nature. E.g. coordinate system.
# 2. Tuples takes less memory than lists.
