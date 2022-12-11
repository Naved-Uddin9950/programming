def sort(arr):
    swap = True
    while swap == True:
        swap = False
        for i in range(len(arr) - 1):
            if arr[i] > arr[i + 1]:
                swap = True
                arr[i], arr[i + 1] = arr[i + 1], arr[i]
    return arr



arr = [10, 2, 5, 8, 3]
print(sort(arr))

# print(sort(arr = [10, 8, 2, 3, 5]))