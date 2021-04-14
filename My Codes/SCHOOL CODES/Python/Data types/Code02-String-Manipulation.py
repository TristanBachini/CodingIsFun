#!/usr/bin/env  python3
# Showing how to return a manipulated strings from immutable strings

typing_sentence = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG."
print(typing_sentence.lower())
print(typing_sentence)

typing_sentence = typing_sentence.lower()
print(typing_sentence)

# replace(old, new, [,count])
# Replaces the old portion with new.
# If the optional argument count is used, only the first count occurrences will be replaced.
dna_seq = 'GCTAGTAATGTG'
m_rna_seq = dna_seq.replace('T', 'U')
print(m_rna_seq)

# count(sub[, start[, end]])
# Counts how many times the substring sub appears between the start and end positions (if available)
c = dna_seq.count("C")
g = dna_seq.count("G")
CG_content = (c + g) / len(dna_seq) * 100
print("CG Content:", str(CG_content) + "%")

# find(sub[, start[, end]])
# Returns the position of the substring sub, between the start and end positions (if available)
# If the substring is not found, it returns -1.
aug_posn = m_rna_seq.find('AUG')
print("AUG in", aug_posn)
ggg_posn = m_rna_seq.find("GGG")
print("GGG in", ggg_posn)

# index(sub[, start[, end]])
# Works like find(), except that the ValueError exception is raised with the substring is not found.
aug_posn = m_rna_seq.index('AUG')
print("AUG in", aug_posn)
# ggg_posn = m_rna_seq.index("GGG")
# print("GGG in", ggg_posn)

# split([sep [, maxsplit]])
# Separates the "words" of a string and returns them in a list.
# If the separator (sep) is not specified, the default separator is the white space.
words = typing_sentence.split()
print(words)
record = "Juan dela Cruz,2018-12345,jdelacruz@up.edu.ph"
record_list = record.split(",")
print(record_list)

# join(seq)
# join is the inverse of split. It joins the sequence using a string as a glue.
student_record = ";".join(['Juan dela Cruz', '2018-12345', 'jdelacruz@up.edu.ph'])
print(student_record)
gen_seq = ''.join(['A', 'C', 'A', 'T'])
print(gen_seq)
