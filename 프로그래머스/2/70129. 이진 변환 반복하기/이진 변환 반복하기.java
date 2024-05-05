class Solution {
    public int[] solution(String s) {
        int circulCnt = 0;
        int removedCnt = 0;
        while(true){
            if(s.equals("1")){
                break;
            }
            removedCnt += Integer.parseInt(removeZero(s));
            s = s.replace("0","");
            s = toBinary(s.length());
            circulCnt++;
        }
        return new int[] {circulCnt, removedCnt};
    }
    
    // 1. x의 모든 0을 제거합니다, 제거된 0의 갯수를 반환합니다.
    private String removeZero(String s){
        int cnt = 0;
        String[] arr = s.split("");
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("0")){
                cnt ++;
            }
        }
        return String.valueOf(cnt);
    }
    
    // 2. x의 길이를 c라고 하면, x를 'c를 2진법으로 표현한 문자열'로 바꿉니다.
    private String toBinary(int s){
        return Integer.toBinaryString(s);
    }
    
}