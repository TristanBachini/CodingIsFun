#!/usr/bin/env  python3
# Common properties among the sequences (lists, tuples, strings)

# Indexing
point = (23, 56, 11)
print("point elements:")
print(point[0])
print(point[1])
print(point[-1])
print(point[-2])

sequence = 'MRVLLVALALLALAASATS'
print("sequence elements:")
print(sequence[0])
print(sequence[5])
print(sequence[-2])
print(sequence[-4])

parameters = ['UniGene', 'dna', 'Mm.248907', 5]
print("parameters elements")
print(parameters[2])
print(parameters[-1])

# Accessing an element that is inside a sequence, w/c is itself another sequence
seqdata = ('MRVLLVALALLA', 12, '5FE9EEE8EE2DC2C7')
print("seqdata elements:")
print(seqdata[0][5])

# Slicing
# [x:y] - elements between x (inclusive) and y (exclusive)
word = "Python"
print("slicing:")
print(word[0:2])
# When x is omitted, default is 0.
print(word[:2])
# When y is omitted, it means up to the last element.
print(word[4:])
# A 3rd optional argument is used to skip positions by step increment.
print("skip position:")
print(word[1:5])
print(word[1:5:2])
# A step with a negative number is used to count backwards.
print("negative skip")
print(word[::-1])
print(word[3:0:-2])

# Membership test
print("membership test:")
print(11 in point)
print('X' in sequence)

# Concatenation with + as long as they are of the same class
print("concatenation:")
point2 = (2, 6, 7)
print(point + point2)
dna_seq = 'ATGCTAGACGTCCTCAGATAGCCG'
tata_box = 'TATAAA'
print(tata_box + dna_seq)
# print(point + tata_box)

# len returns the length of a sequence
print("len:")
print(len(point))
print(len(sequence))
# max and min
print("max and min")
print(max(point))
print(min(point))
print(max(sequence))
print(min(sequence))

# list converts a tuple or string into a list
print(list(tata_box))
