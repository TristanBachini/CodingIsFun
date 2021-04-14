cNumber = (input("Enter Credit Card Number:"))
intInput = int(cNumber)

even=[]
odd=[]
totalEvenDigits=0
totalOddDigits=0

tempintInput = intInput
tempintInput //= 10

if cNumber[0]=="4" or cNumber[0]=="5" or cNumber[0]=="6" or cNumber[:2]=="37":

    if(13<=len(cNumber) and len(cNumber)<=16):

        print('Card number length:',len(cNumber))
        while tempintInput != 0:
            even.append(tempintInput%10)
            tempintInput//=100

        print('Even positioned digits from the right:',even)

        for i in even:
            doubleDigits = i*2
            if doubleDigits>9:
                doubleDigits=(doubleDigits%10)+(doubleDigits//10)
            totalEvenDigits+=doubleDigits

        tempintInput=intInput

        while tempintInput != 0:
            odd.append(tempintInput%10)
            tempintInput//=100

        #print('Odd positioned digits',oddDigits)

        for i in odd:
            doubleDigits=i
            if doubleDigits>9:
                doubleDigits=(doubleDigits%10)+(doubleDigits//10)
            totalOddDigits+=doubleDigits

        print('Sum of odd-positioned digits :',totalOddDigits)
        print('Sum of even-positioned digits :',totalEvenDigits)

        digitsSum=totalOddDigits+totalEvenDigits

        print('Sum of above digits:',digitsSum)

        if(digitsSum%10)==0:
            print('Card number is valid.')
        else:
            print('Card number is fake.')

    else:
        print('Card number is invalid. Length error.')
        print('Card number length is:',len(cNumber))

else:
    print('Card is invalid. Starting digit/s error.')
    print('Starting digit/s is/are',cNumber[0],'/',cNumber[0:2],'.')