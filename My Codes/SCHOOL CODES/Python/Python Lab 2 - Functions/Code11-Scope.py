#!/usr/bin/env python3
"""Showing the variable scoping"""

# Global variable
x = 7

# Global variables can be accessed within a function
def access_global():
    print('x printed from access_global:', x)

# You cannot modify a global variable in function.
# When you first assign a value to a variable in a function's block,
# Python creates a new local variable.
# We say the local x "shadows" the global x, making it inaccessible in the
# scope of the function's block.
def try_to_modify_global():
    x = 3.5
    print('x printed from try_modify_global:', x)

# To modify a global variable in a function's block, you must use the
# "global" statement to declare that the variable is defined in the
# global scope
def modify_global():
    global x;
    x = 'hello'
    print('x printed from modify_global:', x)

# Variables defined in a function has local scope within the function only.
def access_local():
    y = 7
    print('local y:', y)

access_global()
try_to_modify_global()
print('x:', x)
modify_global()
print('x:', x)
access_local()
# print('y:', y)    # Causes runtime error because y does not have global scope

# Blocks vs. Suites
# When you create a variable in a block, it's local to that block.
# When you create a variable in control statement's suite, the variable's
# scope depends on where the control statement is defined.
#   1. If the control statement is in the global scope, then any variables defined in the
#      control statement have global scope.
#   2. If the control statement is in a function's block, then any variables defined in the
#      control statement have local scope.
if 1:
    z = 10;
    print('z witin if suite:', z)

print('z:', z)

# Shadowing functions
# Avoid naming variables with the same name as a function name.
# Otherwise, it will "shadow" the function.
sum = 10 + 5
print('sum:', sum)
# total = sum([10, 5])
