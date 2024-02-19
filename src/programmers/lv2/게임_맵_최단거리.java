package programmers.lv2;

import java.util.ArrayDeque;
import java.util.Arrays;

public class 게임_맵_최단거리 {

    private static int[] rx = {1, -1, 0, 0};
    private static int[] ry = {0, 0, 1, -1};

    private static class Point {
        int x, y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }



    public static int solution(int[][] maps) {

        int[][] dist = new int[maps.length][maps[0].length];
        ArrayDeque<Point> dq = new ArrayDeque<>();
        dq.add(new Point(0, 0));
        dist[0][0] = 1;
        dist[maps.length - 1][maps[0].length - 1] = -1;

        while(!dq.isEmpty()){
            Point now = dq.poll();

            for (int i = 0; i < 4; i++) {
                int nx = now.x + rx[i];
                int ny = now.y + ry[i];

                if( nx<0 || ny<0 || ny >= maps.length || nx >= maps[0].length)
                    continue;


                if(maps[ny][nx] == 0)
                    continue;


                if(dist[ny][nx] <= 0){
                    dist[ny][nx] = dist[now.y][now.x] + 1;
                    dq.add(new Point(nx, ny));
                }

            }

        }



        return dist[maps.length - 1][maps[0].length - 1];
    }


    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};

        System.out.println("solution(maps) = " + solution(maps));
    }
}

