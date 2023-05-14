class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        int ptr = 0;
        while(ptr < s.length()) {
        	char temp = s.charAt(ptr);
        	if(temp >= 65 && temp <= 90) {
        		if(temp + n > 90) {
        			sb.append((char)(temp + n - 26));
        		}else {
        			sb.append((char)(temp + n));
        		}
        	}else if(temp >= 97 && temp <=122) {
        		if(temp + n > 122) {
        			sb.append((char)(temp + n - 26));
        		}else {
        			sb.append((char)(temp + n));
        		}
        	}else {
        		sb.append(" ");
        	}
        	ptr++;
        }
        return sb.toString();
    }
}