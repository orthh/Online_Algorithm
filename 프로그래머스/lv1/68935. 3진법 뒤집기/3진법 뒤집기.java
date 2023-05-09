class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
		int answer = 0; 
        String s = Integer.toString(n, 3);
        sb.append(s);
        sb.reverse();
        answer = Integer.parseInt(sb.toString(), 3);
        return answer;
    }
}