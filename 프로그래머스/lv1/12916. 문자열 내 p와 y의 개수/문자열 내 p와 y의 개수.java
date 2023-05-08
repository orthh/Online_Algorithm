class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] arr = s.toLowerCase().split("");
        int cnt1=0;
        int cnt2=0;
        
        for(String item : arr){
            if(item.equals("y")){
                cnt1++;
            }
            if(item.equals("p")){
                cnt2++;
            }
        }
        if(cnt1 == cnt2){
            answer = true;
        }else{
            answer = false;
        }
        

        return answer;
    }
}