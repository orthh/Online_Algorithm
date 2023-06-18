def solution(n):
    answer = 0
    for item in range(1,n + 1):
        if n % item == 0:
            answer += 1
    return answer