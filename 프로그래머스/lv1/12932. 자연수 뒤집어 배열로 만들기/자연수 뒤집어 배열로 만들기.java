class Solution {
    public int[] solution(long n) {
        int[] answer;
       
    	String a= String.valueOf(n);
    	String[] arr = a.split("");
    	answer = new int[arr.length];
    	for(int i=0; i<answer.length; i++){
            answer[answer.length -1 -i] = Integer.parseInt(arr[i]);
        }

        return answer;
    }
}