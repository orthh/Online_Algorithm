class Solution {
    public int findYaksuCount(int num) {
		int cnt = 0;
		for(int i=1; i<=num; i++) {
			if(isYaksu(i, num)) {
				cnt++;
			}
		}
		return cnt;
	}
	public int solution(int left, int right) {
        int answer = 0;
        for(int i = left; i<=right; i++) {
        	if(findYaksuCount(i) % 2 == 0) {
        		answer += i;
        	}else {
        		answer -= i;
        	}
        }
        return answer;
    }
	public boolean isYaksu(int num,int base) {
		if(base % num == 0) {
			return true;
		}else {
			return false;
		}
	}
}