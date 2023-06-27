def solution(array):
    arr = sorted(array)
    answer = 0

    if len(arr) % 2 == 0:
        answer = arr[len(arr) // 2 - 1]
    else:
        answer = arr[len(arr) // 2]

    return answer