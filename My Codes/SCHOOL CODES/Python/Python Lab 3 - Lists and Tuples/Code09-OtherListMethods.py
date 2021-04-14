#!/usr/bin/env python3

color_names = ['orange', 'yellow', 'green']
print('color_names:', color_names)

# Inserting an element at a specified list index
print('Inserting at index 0...')
color_names.insert(0, 'red')
print('color_names:', color_names)

# Inserting an element to the end of the list
print('Inserting at end...')
color_names.append('blue')
print('color_names:', color_names)

# Adding all elements of a sequence to the end of a list
print('Adding all elements of sequence to the end...')
color_names.extend(['indigo', 'violet'])
print('color_names:', color_names)

print('Extending a string...')
sample_list = []
print('sample_list:', sample_list)
s = 'abc'
sample_list.extend(s)
print('sample_list:', sample_list)
print('Extending a tuple...')
t = (1, 2, 3)
sample_list.extend(t)
print('sample_list:', sample_list)
sample_list.extend((4, 5, 6))
print('sample_list:', sample_list)

# Removing the first occurrence of an element in a list
print('color_names:', color_names)
print('Removing green...')
color_names.remove('green')
print('color_names:', color_names)

# Emptying a list
print('Emptying...')
color_names.clear()
print('color_names:', color_names)

# Counting the number of occurrences of an item
responses = [1, 2, 5, 4, 3, 5, 2, 1, 3, 3,
             1, 4, 3, 3, 3, 2, 3, 3, 2, 2]
print('Responses:', responses)
for i in range(1, 6):
    print(f'{i} appears {responses.count(i)} times in responses')

# Reversing a list's elements
color_names = ['red', 'orange', 'yellow', 'green', 'blue']
print('color_names:', color_names)
print('Reversing...')
color_names.reverse()
print('color_names:', color_names)

# Copying a list
copied_list = color_names.copy()
print('copied_list:', copied_list)
