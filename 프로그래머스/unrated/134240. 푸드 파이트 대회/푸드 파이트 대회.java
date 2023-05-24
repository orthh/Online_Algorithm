class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();      
        for(int i=1; i<food.length; i++){
            if(food[i] %2 == 1) food[i] -= 1;
            sb.append(String.valueOf(i).repeat(food[i] / 2));
        }
        String temp = sb.toString();
        sb.append(0);
        sb.reverse();
        sb.insert(0,temp);
        return sb.toString();
    }
}