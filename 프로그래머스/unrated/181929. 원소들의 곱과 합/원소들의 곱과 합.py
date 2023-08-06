def solution(num_list):
    answer = 0
    result1 = 1
    result2 = 0
    for i in num_list:
        result1 *= i
    for i in num_list:
        result2 += i
    if(result1 < result2 * result2):
        answer = 1
    else:
        answer = 0
    return answer