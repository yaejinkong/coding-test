//문제: https://school.programmers.co.kr/learn/courses/30/lessons/42747
//시간: 5.23ms
//메모리: 96.1MB

import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b.compareTo(a);
            }
        });

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= i + 1) {
                answer = i + 1;
            }
        }
        return answer;
    }
}