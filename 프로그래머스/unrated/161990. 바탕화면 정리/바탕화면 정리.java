class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int x1 = -1;
        int x2 = -1;
        int y1 = 99;
        int y2 = -1;

        for (int i = 0; i < wallpaper.length; i++) {
            int temp = wallpaper[i].indexOf("#");
            int temp2 = wallpaper[i].lastIndexOf("#");

            if (temp != -1) {
                if (y1 > temp) {
                    y1 = temp;
                }
            }

            if (y2 < temp2) {
                y2 = temp2;
            }

            if (temp != -1 && x1 == -1) {
                x1 = i;
            }

            if (temp != -1) {
                x2 = i;
            }
        }

        answer[0] = x1;
        answer[1] = y1;
        answer[2] = x2 + 1;
        answer[3] = y2 + 1;
        
        return answer;
    }
}