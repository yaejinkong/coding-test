//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181831
//시간: 0.32ms
//메모리: 102MB

class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (cnt < (arr.length / 2) && arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}