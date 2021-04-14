#!/usr/bin/env python3
"""Roll a six-sided die 6,000,000 times."""
import random

# face frequency counters
frequency = [0, 0, 0, 0, 0, 0]

# 6,000,000 die rolls
for roll in range(6_000_000):   # Underscore separators can be used to make numbers more readable
    face = random.randrange(1, 7)

    # increment appropriate face counter
    frequency[face - 1] += 1

print(f'Face{"Frequency":>13}')
for i in range(1, 7):
    print(f'{i:>4}{frequency[i - 1]:>13}')
