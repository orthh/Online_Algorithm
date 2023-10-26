class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        int cnt = 0;
        int zeroCnt = 0;
        for(int i=0; i<win_nums.length; i++){
            for(int j=0; j<lottos.length; j++){
                if(win_nums[i] == lottos[j]) cnt++;
            }
        }
        for(int i = 0; i<lottos.length; i++){
            if(lottos[i] == 0) zeroCnt ++;
        }      
        System.out.println(cnt + "," + zeroCnt);
        return score(cnt,zeroCnt);
    }
    
    public int[] score(int cnt, int zeroCnt){
        int max = 0;
        int min = cnt;    
        if(cnt + zeroCnt > 6){
            max = 6;
        }else{
            max = cnt + zeroCnt;
        }    
        // if(cnt - zeroCnt <= 0){
        //     min = 0;
        // }else{
        //     min = cnt - zeroCnt;
        // }
        return new int[]{place(max), place(min)};
    }
    public int place(int num){
        if(num == 6) return 1;
        if(num == 5) return 2;
        if(num == 4) return 3;
        if(num == 3) return 4;
        if(num == 2) return 5;
        return 6;
    }
    
}