number1 = input("Enter lower-bound number: ")
number2 = input("Enter upper-bound number: ")

number1=int(number1)
number2=int(number2)
palindrome = 0
notLychrel = 0
lychrel = 0

if (number1 > number2):
    print("Enter a valid range (Lower-bound < Upper-bound)")
    exit()

if (number1 < 0):
    print("Enter only positive integers")
    exit()

if (number2 < 0):
    print("Enter only positive integers")
    exit()


#checks for the range of given 2 numbers
for i in range(number1,number2+1):
    nonLychrel = i + int(str(i)[::-1])

    #checks if number is palindrome
    if i == int(str(i)[::-1]):
       palindrome += 1

    if i != int(str(i)[::-1]):
        #196 algorithm
        for r in range(1, 61):

            if nonLychrel == int(str(nonLychrel)[::-1]):
                notLychrel += 1
                break

            if nonLychrel != int(str(nonLychrel)[::-1]):
                nonLychrel += int(str(nonLychrel)[::-1])

            if r == 60:
                print(f"{i} looks like a Lychrel number ")
                lychrel += 1

print(f"In the range of {number1} to {number2}")

print("Number of Palindromes: ", palindrome)
print("Number of non-Lychrel numbers: ", notLychrel)
print("Number of Lychrel Numbers:", lychrel)