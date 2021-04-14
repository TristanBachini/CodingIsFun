#!/usr/bin/env  python3
# Sets are similar to sets in mathematics.
# It is similar to a list with 2 differences:
#   1. its elements do not preserve an implied order
#   2. every element is unique
# This type of data is not common in other programming languages.

first_set = {'Richard', 'Bryann', 'Chua'}
print(first_set)

# Creating an empty set and adding the elements.
print("Creating empty set and then adding elements...")
first_set = set()
print(first_set)
first_set.add('Richard')
first_set.add('Bryann')
first_set.add('Chua')
print(first_set)

# Duplicate elements have no effect on the set
print("Adding duplicate element...")
first_set.add('Richard')
print(first_set)

# Defining a set by comprehension
print("Define a set by comprehension...")
second_set = {2 * x for x in [1, 2, 3]}
print(second_set)

# Defining a set by comprehension
print("Define a set by comprehension with duplicates...")
second_set = {2 * x for x in [1, 1, 2, 2, 3, 3]}
print(second_set)

# Set can be used to remove duplicate elements
print("Removing duplicate elements...")
uniques = {2, 2, 3, 4, 5, 3}
print(uniques)

# Set operations
# Intersection
print("Intersection...")
other_set = {'Chua'}
common = first_set.intersection(other_set)
print(common)
common = first_set & other_set
print(common)

# Union
print("Union...")
first_set = {'Richard', 'Bryann'}
second_set = {'Bryann', 'Chua'}
result = first_set.union(second_set)
print(result)
result = first_set | second_set

# Difference
print("Difference...")
result = first_set - second_set
print(result)
result = other_set - first_set
print(result)

# Symmetric difference
print("Symmetric difference...")
result = first_set.symmetric_difference(second_set)
print(result)
result = first_set ^ second_set
print(result)

# Converting a set into a list
print("Converting a set into a list...")
list_set = list(first_set)
print(list_set)

# Frozen set is an immutable set.
# Since it's immutable, it can be used as dictionary key.
print("Frozen set...")
fs = frozenset(first_set)
print(fs)
