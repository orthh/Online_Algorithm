def solution(arr, k):
    answer = []
    if k % 2 == 1:
        answer = list(map(lambda x: x * k, arr))
    else:
        answer = list(map(lambda x: x + k, arr))
    return answer