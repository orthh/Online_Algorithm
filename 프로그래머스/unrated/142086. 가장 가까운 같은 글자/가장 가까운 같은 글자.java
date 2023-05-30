class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] arr = s.split("");
        for(int i=0; i<arr.length; i++){
            for(int j=i-1; j>=0; j--){
                if(arr[i].equals(arr[j])){
                    answer[i] = i - j;
                    break;
                }else{
                    answer[i] = -1;
                }
            }
        }
        answer[0] = -1;
        return answer;
    }
}