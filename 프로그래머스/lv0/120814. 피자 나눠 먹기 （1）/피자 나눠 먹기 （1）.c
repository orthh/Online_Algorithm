#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    int pizzaCut = 7;
    answer = (n%pizzaCut == 0) ? n / pizzaCut : n / pizzaCut + 1 ;
    return answer;
}