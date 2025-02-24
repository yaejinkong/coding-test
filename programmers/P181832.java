//문제 링크: https://school.programmers.co.kr/learn/courses/30/lessons/181832
//시간: 0.11ms
//메모리: 81.3MB

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        int[] dx = {0, 1, 0, -1}; // 우, 하, 좌, 상
        int[] dy = {1, 0, -1, 0};
        int x = 0, y = 0, dir = 0, num = 1;

        while (num <= n * n) {
            answer[x][y] = num++;
            visited[x][y] = true;

            int nx = x + dx[dir];
            int ny = y + dy[dir];

            if (nx < n && ny < n && nx >= 0 && ny >= 0 && !visited[nx][ny]) {
                x = nx;
                y = ny;
            } else {
                dir = (dir + 1) % 4;
                x += dx[dir];
                y += dy[dir];
            }
        }

        return answer;
    }
}