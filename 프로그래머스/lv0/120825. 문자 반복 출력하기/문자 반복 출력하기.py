def solution(my_string, n):
    answer = ''
    for item in my_string :
        answer = answer + item * n;
    return answer