class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        
        
        for(int i=0; i<arr.length; i++){
        	char[] temp = arr[i].toCharArray();
            for(int j=0; j<temp.length; j++) {
            	if(j %2 == 0) {
                	temp[j] =Character.toUpperCase(temp[j]);
                	sb.append(temp[j]);
                }else {
                	temp[j] = Character.toLowerCase(temp[j]);
                	sb.append(temp[j]);
                }
            }
            if(i != arr.length - 1) {
            	sb.append(" ");
            }
            
        }
        int cnt = 0;
        while(s.charAt(s.length() - (cnt + 1)) == ' ') {
        	cnt ++;
        }
        for(int i=0; i<cnt; i++) {
        	sb.append(" ");
        }
        answer = sb.toString();
        return answer;
    }
}