class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;
        for(int item : arr){
            sum += item;
        }
        answer = sum / (double)arr.length;
        
        return answer;
    }
}