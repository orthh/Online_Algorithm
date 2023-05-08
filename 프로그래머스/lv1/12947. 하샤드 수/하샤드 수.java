class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String[] arr = String.valueOf(x).split("");
        int sum = 0;
        for(String item : arr){sum += Integer.parseInt(item);}
        if(x % sum == 0){
            answer = true;
        }else{
            answer = false;
        }
        return answer;
    }
}