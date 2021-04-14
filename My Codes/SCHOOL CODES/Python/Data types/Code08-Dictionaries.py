#!/usr/bin/env  python3
# Dictionary stores arbitrary indexed unordered data types.
# Data is stored as key:value
# Only immutable objects can be used as keys: strings, tuples, numbers

iupac = {'A':'Ala', 'C':"Cys", 'E':'Glu'}
print("C stands for the amino acide {0}".format(iupac['C']))

# A dictionary can be created from a sequence with dict.
print("Using dict:")
rgb = [('red', 'ff0000'), ('green', '00ff00'), ('blue', '0000ff')]
colors_d = dict(rgb)
print(colors_d)

# dict also accepts name=value pairs in the keyword argument list
print("dict as name=value:")
rgb = dict(red='ff0000', green='00ff00', blue='0000ff')
print(rgb)

# elements can be added into a dictionary
print("adding elements into a dictionary:")
rgb = {}
rgb['red'] = 'ff0000'
rgb['green'] = '00ff00'
print(rgb)
print(len(rgb))
rgb['blue'] = '0000ff'
print(rgb)
print(len(rgb))

# If you need ordered dictionary, use OrderedDict.
print("OrderedDict:")
from collections import OrderedDict
d = OrderedDict()
d['a'] = 'A'
d['b'] = 'B'
d['c'] = 'C'
print(d)

# Getting the keys and values of a dictionary
print("Dictionary:")
iupac['X'] = 'Xaa'
print(iupac)
print("Keys:")
print(iupac.keys())
print("Values:")
print(iupac.values())

# The methods keys and values return a dictionary view.
# This means if there are changes in the dictionary, it will also change in the dictionary view.
print("Before change:")
iupac_keys = iupac.keys()
iupac_vals = iupac.values()
print(iupac_keys)
print(iupac_vals)
iupac.pop('X')
print("After change:")
print(iupac_keys)
print(iupac_vals)

# items returns a dictionary view with a tuple for every key/value pair
print("Dictionary items:")
print(iupac.items())

# Querying w/o exception: get(k, x)
# k - key of the element
# x - element that will be returned in case k is not found
print("Querying without exception:")
#print(iupac['Z'])
print(iupac.get('A', 'No translation available'))
print(iupac.get('Z', 'No translation available'))
print(iupac.get('Z'))

# Erasing elements
print("Erasing elements:")
del iupac['A']
print(iupac)
