#!/usr/bin/env python3
"""Seeding the random-number generator"""
# Python automatically seeds the random-number generator with different values
# When you want reproducibility (e.g. in simulations), you have to specify
# your own seed manually.
import random

random.seed(32)

for roll in range(10):
    print(random.randrange(1, 7), end=' ')
