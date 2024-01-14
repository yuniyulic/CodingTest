import java.util.*;

class Solution {
    private int[][] visited = new int[5][5];
    private int[] dx = {0, 0, -1, 1};
    private int[] dy = {-1, 1, 0, 0};
    private int flag = 1;
    private Queue<Node> q = new LinkedList<Node>();
    
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        for (int i=0; i<5; i++) {
            flag = 1;              
            for (int j=0; j<5; j++) {
                for (int k=0; k<5; k++) {
                    if (places[i][j].charAt(k) != 'P') continue;
                    for (int p=0; p<5; p++) for (int q=0; q<5; q++) visited[p][q] = -1;
                    
                    visited[j][k] = 0;
                    q.add(new Node(j, k));
                    bfs(places[i]);
                }
            }
            answer[i] = flag;
        }
        return answer;
    }
    
    private void bfs(String[] places) {
        while (q.size() != 0) {
            Node node = q.poll();
            for (int i=0; i<4; i++) {
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5 || visited[nx][ny] != -1) continue;
                char ch = places[nx].charAt(ny);
                if (ch == 'X') continue;
                visited[nx][ny] = visited[node.x][node.y] + 1;
                if (ch == 'P' && visited[nx][ny] <= 2) {
                    flag = 0;
                }
                q.add(new Node(nx, ny));
            }
        }
    }
    
    private class Node {
        int x;
        int y;
        
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}