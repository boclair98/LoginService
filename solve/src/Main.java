import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
    static int n,t;
    static int[] dx ={0,-1,0,1};
    static int[] dy ={1,0,-1,0};
    static int[][] map;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        t = Integer.parseInt(st.nextToken());
        String word = br.readLine();
        map = new int[n][n];
        int total = 0;
        int len = 0;
        int idx = 1;
        int x = n/2;
        int y = n/2;
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j<n; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        total+=map[x][y];
        while(len<word.length()){
            char c = word.charAt(len);
            if(c == 'L'){
                idx = (idx+1) % 4;
            }
            if(c == 'R'){
                idx = (idx+3) % 4;
            }
            if(c == 'F'){
                int nx = x + dx[idx];
                int ny = y + dy[idx];
                if(Range(nx,ny)){
                    total+=map[nx][ny];
                    x = nx;
                    y = ny;
                }
            }
//            System.out.println(total);
            len++;
        }
        System.out.println(total);
    }

    private static boolean Range(int nx, int ny) {
        return 0<=nx && nx<n && 0<=ny && ny<n;
    }
}