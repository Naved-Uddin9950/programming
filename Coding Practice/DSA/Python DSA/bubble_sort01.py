arr = [10, 8, 2, 6, 4]
swap = True

while swap == True:
    swap = False
    for i in range(len(arr) - 1):
        if arr[i] > arr[i + 1]:
            swap = True
            temp = arr[i]
            arr[i] = arr[i + 1]
            arr[i + 1] = temp

print(arr)