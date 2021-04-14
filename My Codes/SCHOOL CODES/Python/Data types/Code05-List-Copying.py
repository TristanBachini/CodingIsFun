#!/usr/bin/env  python3
# Illustrating the tricky operation of list copying

# This doesn't copy the list. It only references it.
a = [1, 2, 3]
b = a
b.pop()
print(a)

# To copy a list, use the copy method in the copy module
import copy
a = [1, 2, 3]
b = copy.copy(a)
b.pop()
print(a)

# Another way of copying w/o using the copy module
a = [1, 2, 3]
b = a[:]
b.pop()
print(a)
