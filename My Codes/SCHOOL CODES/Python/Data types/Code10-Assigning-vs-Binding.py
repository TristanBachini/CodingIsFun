#!/usr/bin/env  python3
# Assigning a value to a variable name vs. binding a name to an object

a = 3
b = [1, 2, a]
print(b)

a = 5
print(b)

c = [1, 2, 3]
d = [5, 6, c]
print(d)
c.pop()
print(d)
