def solution(my_string):
    moeum = ["a","e","i","o","u"]
    for item in moeum :
        my_string = my_string.replace(item, "")
    return my_string