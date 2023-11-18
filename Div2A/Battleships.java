package Div2A;
// problim link
/*
https://vjudge.net/problem/UVA-11953
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Battleships {
    static Reader input = new Reader();
    static PrintWriter output = new PrintWriter(System.out);
    static List<Integer>[] graph;
    static int n;
    static int m;
    static char[][] grid;
    static List<String> path;
    static int[] X = {0, 0, -1, 1, 1, -1, 1, -1};
    static int[] Y = {1, -1, 0, 0, 1, -1, -1, 1};
    static int[] per;
    static boolean[] vis;
    static boolean[][] visited;
    public static void main(String[] args) throws IOException {
        int t = input.nextInt();
        int counter = 1;
        while (t-- > 0) {
            n = input.nextInt();
            grid = new char[n][n];
            visited = new boolean[n][n];
            for (int i = 0; i < n; i++) {
                grid[i] = input.next().toCharArray();
            }
            int result = 0;
            for (int i = 0 ; i < n ; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 'x' && !visited[i][j]) {
                        dfs(i, j);
                        result++;
                    }
                }
            }

            System.out.println("Case " + counter++ + ": " + result);

        }

    }

    private static void dfs(int i, int j) {
        visited[i][j] = true;
        for (int k = 0 ; k < 4 ; k++){
            if (valid(i + X[k], j + Y[k]) && !visited[i + X[k]][j + Y[k]] && grid[i + X[k]][j + Y[k]] != '.') {
                dfs(i + X[k], j + Y[k]);
            }
        }
    }
    private static boolean valid(int i, int j){
        return i < n && i >= 0 && j < n && j >= 0;
    }

    static class Reader extends PrintWriter {

        private final BufferedReader r;
        private StringTokenizer st;
        // standard input

        public Reader() {
            this(System.in, System.out);
        }

        public Reader(InputStream i, OutputStream o) {
            super(o);
            r = new BufferedReader(new InputStreamReader(i));
        }
        // USACO-style file input

        public Reader(String problemName) throws IOException {
            super(problemName + ".out");
            r = new BufferedReader(new FileReader(problemName));
        }

        // returns null if no more input
        String nextLine() {
            String str = "";
            try {
                str = r.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

        boolean hasNext() {
            String s = null;
            try {
                s = r.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (s == null || s == "\n") return false;
            st = new StringTokenizer(s);
            return true;
        }

        public String next() {
            try {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(r.readLine());
                }
                return st.nextToken();
            } catch (Exception e) {
            }
            return null;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public long nextLong() {

            return Long.parseLong(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = (int) nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

}
