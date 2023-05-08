class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        try{
            if(s.length() == 4 || s.length() == 6){
                long a = Long.parseLong(s); 
            }else{
                throw new Exception();
            }

        } catch(Exception e){
            answer = false;
        }
        
        return answer;
    }
}