class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        String[] map1 = new String[arr1.length];
        String[] map2 = new String[arr2.length];
        for(int i=0; i<arr1.length; i++){
            map1[i] = tenToTwo(arr1[i], arr1.length);
            map2[i] = tenToTwo(arr2[i], arr2.length);
        }
        for(int i=0; i<answer.length; i++){
            String temp = "";

            for(int j=0; j<map1[i].length(); j++){
                if(map1[i].charAt(j) == '1' || map2[i].charAt(j) == '1'){
                    temp += "#";
                }else{
                    temp += " ";
                }
            }
            answer[i] = temp;
        }
        
        return answer;
    }
    public String tenToTwo(int ten, int len){
        StringBuilder sb = new StringBuilder();
        while(ten >= 1){   
            sb.append(ten % 2);
            ten /= 2;
        }
        if(sb.length() <= len - 1){
            sb.append("0".repeat(len - sb.length()));
        }
        sb.reverse();
        
        return sb.toString();
    }
}