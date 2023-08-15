def solution(num_list):

    if len(num_list) >= 11:
        answer = 0
        for item in num_list:
            answer+=item
    else:
        answer=1
        for item in num_list:
            answer*=item
    return answer