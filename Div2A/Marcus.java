package Div2A;
// problim link
/*
https://vjudge.net/problem/UVA-10452
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Marcus {
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
    static String word = "IEHOVA#";
    public static void main(String[] args) throws IOException {
        int t = input.nextInt();
        while (t-- > 0) {
            n = input.nextInt();
            m = input.nextInt();
            grid = new char[n][];
            path = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                grid[i] = input.next().toCharArray();
            }

            for (int j = 0; j < m; j++) {
                if (grid[n - 1][j] == '@') {
                    dfs(n - 1, j, 0);
                }
            }

            System.out.print(path.get(0));
            for (int i = 1 ; i < path.size() ; i++){
                System.out.print(" " + path.get(i));
            }
            System.out.println();

        }

    }

    private static void dfs(int i, int j, int idx) {
        if (grid[i][j] == '#')
            return;
        for (int k = 0 ; k < 3 ; k++){
            if (valid(i + X[k], j + Y[k]) && grid[i + X[k]][j + Y[k]] == word.charAt(idx)) {
                if (k == 0)
                    path.add("right");
                else if (k == 1)
                    path.add("left");
                else
                    path.add("forth");
                dfs(i + X[k], j + Y[k], idx+1);

            }
        }
    }
    private static boolean valid(int i, int j){
        return i < n && i >= 0 && j < m && j >= 0;
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
