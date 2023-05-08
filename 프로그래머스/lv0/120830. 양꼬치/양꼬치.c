#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n, int k) {
    int answer = 0;
    
    k -= n/10 ;
    if(k<=0){
        k=0;
    }
    answer = n * 12000 + k * 2000 ;
    
    
    
    return answer;
}