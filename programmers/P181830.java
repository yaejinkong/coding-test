//문제: https://school.programmers.co.kr/learn/courses/30/lessons/181830
//시간: 0.45ms
//메모리: 102MB

class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int[][] answer = (row > column) ? new int[row][row] : new int[column][column];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}