#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numbers_len은 배열 numbers의 길이입니다.
int solution(int numbers[], size_t numbers_len) {
    int answer = 0;
    
    int max = 0;
    int maxIndex = 0;

    for(int i=0; i < numbers_len; i++){
        if(max < numbers[i]) {
            max = numbers[i];
            maxIndex = i;
        }
    }
    
    int semiMax = 0;
    int semiMaxIndex = 0;
    for(int i=0; i<numbers_len; i++){
        if(i == maxIndex) continue;
        if(semiMax < numbers[i]) {
            semiMax = numbers[i];
            semiMaxIndex = i;
        }
    }
    answer = max * semiMax ;
    return answer;
}