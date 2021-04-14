def createList(size):
    temp = []
    for x in range(size):
        temp.append([])
    return temp


def get_Data(fname):
    with open(fname, 'r') as f:
        size = int(f.readline())
        temp = createList(size)
        for line in f:
            row = line.split()
            temp[int(row[0])].append(int(row[1]))
            temp[int(row[1])].append(int(row[0]))
    return size, temp


def recommend(main, sim, user, size):
    exclude = main[user]
    exclude.append(user)
    temp = []
    for x in range(size):
        if x not in exclude:
            temp.append(sim[user][x])
    maximum = max(temp)
    index = []
    for x in range(size):
        if x not in exclude:
            if sim[user][x] == maximum:
                index.append(x)
    return index


def simMatrix(main, size):
    temp = createList(size)
    for i in range(size):
        for j in range(size):
            similar = len(set(main[i]) & set(main[j]))
            temp[i].append(similar)
    return temp


print("Facebook friend recommendation.\n")
fname = input("Enter a filename: ")
while True:
    size, main_list = get_Data(fname)
    user = int(input(f"Enter an integer in the range of 0 to {size-1}: "))
    sim_matrix = simMatrix(main_list, size)
    rec = recommend(main_list, sim_matrix, user, size)
    if len(rec) > 1:
        print(f"The suggested friends for {user} are", end= " ")
        print(*rec, sep =", ")
    else:
        print(f"The suggested friend for {user} is {rec[0]}")

    loop = input("Do you want to continue (yes/no)?: ")
    if loop.upper() == "NO":
        break