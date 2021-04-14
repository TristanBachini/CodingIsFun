#!/usr/bin/env  python3
# Illustrating the use of lists
# A list is an ordered collection of objects.

first_list = [1, 2, 3, 4, 5]
print(first_list)

other_list = [1, 'two', 3, 4, 'last']
print(other_list)

nested_list = [1, 'two', first_list, 4, 'last']
print(nested_list)

empty_list = []
print(empty_list)

# Accessing list elements
print(first_list[0])
print(first_list[1])

# Negative elements are used to access lists from the right
print(first_list[-1])
print(first_list[-4])

# list() function turns a non-list object into a list
aseq = "atggctaggc"
print(list(aseq))

# * operator can be used to initialize a list with the same item repeated multiple times
samples = ['red'] * 5
print(samples)

# Pre-populating a list with empty values
samples = [None] * 5
print(samples)

# List by enumeration
a = [0, 1, 2, 3, 4, 5]
print(a)

# List by comprehension
multiples_3 = [3 * x for x in a]
print(multiples_3)
