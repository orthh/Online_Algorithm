import java.util.HashSet;
import java.util.Set;
public class Solution {
    // 생성 가능한 모든 숫자를 저장할 Set
    private Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        // 모든 가능한 숫자 조합을 만들어 set에 저장
        makeNums("", numbers);
        // set에 저장된 숫자 중 소수의 개수를 세어 반환
        return countPrimeNumbers(set);
    }

    // 가능한 모든 조합을 생성하는 메서드
    private void makeNums(String current, String numbers) {
        // current가 빈 문자열이 아니라면(즉, 숫자가 만들어졌다면) set에 추가
        if (!current.equals("")) {
            set.add(Integer.parseInt(current));
        }

        // numbers의 각 자릿수를 하나씩 current에 추가하여 재귀 호출
        for (int i = 0; i < numbers.length(); i++) {
            makeNums(current + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1));
        }
    }

    // 소수의 개수를 세는 메서드
    private int countPrimeNumbers(Set<Integer> numbers) {
        int count = 0;
        for (Integer number : numbers) {
            if (isPrime(number)) {
                count++;
            }
        }
        return count;
    }

    // 소수인지 판별하는 메서드
    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
