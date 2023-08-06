class Solution {
    // 약수 개수 구하는 함수
    public int numYaksu(int n){
        int cnt = 0;
        for(int i=1; i * i <= n; i++){
            if(i * i == n) cnt++;
            else if(n % i == 0)cnt+=2;
        }
        return cnt;
    }
    // 무기 공격력 정하는 함수
    public int attack(int n, int limit, int power){
        return n > limit ? power : n;
    }
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i=1; i<=number; i++){
            answer += attack(numYaksu(i), limit, power);
        }
        return answer;
    }
}