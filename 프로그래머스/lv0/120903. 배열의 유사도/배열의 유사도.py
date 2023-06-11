def solution(s1, s2):
    answer = 0
    for item in s1 :
        answer += s2.count(item)
    return answer