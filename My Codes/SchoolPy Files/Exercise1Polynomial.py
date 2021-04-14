a1 = input("input value for a1 (a1x): ")
a2 = input("input value for a2 (a2y): ")
a3 = input("input value for a3 (a1x+a2y=a3): ")
b1 = input("input value for b1 (b1x): ")
b2 = input("input value for b2 (b2y): ")
b3 = input("input value for b3 (b1x+b2y=b3): ")

a1 = float(a1)
a2 = float(a2)
a3 = float(a3)
b1 = float(b1)
b2 = float(b2)
b3 = float(b3)

c1 = a1
c2 = a2
c3 = a3

slopeA = (-a1)/a2
slopeB = (-b1)/b2

sum1 = (a3)/a2
sum2 = (b3)/b2

if slopeA == slopeB:
    if sum1 == sum2:
        print("The system has infinite solutions")
        exit()

    if sum1 != sum2:
        print("The system has no solutions")
        exit()



newx = -b1/b2
newx = a2*newx

equation = (a1) + newx
sum = (a3) - (a2*(b3))/b2

x = sum/equation

y = ((-c1*x) + c3)/c2

print("x =: ", x)
print("y =: ", y)
