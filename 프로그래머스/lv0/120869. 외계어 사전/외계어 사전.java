import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        int[] result = new int[dic.length];
        for(String d: dic){
          String[] splitList = d.split("");
          int[] temp = new int[spell.length];
          for(String s : splitList){
              // s : s, o d
              for(int i=0; i<spell.length; i++){
                  if(spell[i].equals(s)){
                      temp[i]++;
                  }
              }
          }
          // temp[] 원소가 모두 1이면 1 리턴  
          boolean isAllOne = true;
          for(int j=0; j<temp.length; j++){
              System.out.println(temp[j]);
              if(temp[j] != 1){
                  isAllOne = false;
                  break;
              }
          }
          if(isAllOne) return 1;
        }
        return 2;
    }
}