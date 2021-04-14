
def GCD(a,b):
	while(b):
		a, b = b, a%b
	return a


print("Enter positive integers only (-1 to end):")
num = []
while True:
	x = int(input())

	if x != -1:
		num.append(x)

	else:
		break

try:
	gcd = GCD(num[0], num[1])

	for x in range(2, len(num)):
		gcd = GCD(gcd, num[x])
	print(f"gcd = {gcd}")
except IndexError:

	print("Please input at least 2 integers.")





