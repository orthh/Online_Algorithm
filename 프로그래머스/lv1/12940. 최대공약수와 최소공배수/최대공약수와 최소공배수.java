class Solution {
    public int gcd(int num1, int num2){
        if(num2 == 0){
            return num1;
        }else{
            return gcd(num2, num1 % num2);
        }
    }
    public int lcm(int num1, int num2, int gc){
        return (num1 * num2) / gc;
    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int gcdA = gcd(n, m);
        System.out.println(gcdA);
        answer[0] = gcdA;
        answer[1] = lcm(n, m, gcdA);
        return answer;
    }
}