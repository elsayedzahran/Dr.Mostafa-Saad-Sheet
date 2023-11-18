package Div2A;
// problim link
/*
https://vjudge.net/problem/UVA-10305
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class OrderingTasks {
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
    static Stack<Integer> topoSort;
    public static void main(String[] args) throws IOException {
        while (true) {
            n = input.nextInt();
            m = input.nextInt();

            if (n == 0)
                break;

            vis = new boolean[n + 1];
            topoSort = new Stack<>();
            per = new int[n + 1];
            graph = new ArrayList[n + 1];
            for (int i = 1 ; i <= n ; i++){
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < m; i++) {
                int x = input.nextInt();
                int y = input.nextInt();
                graph[x].add(y);
            }
            for (int i = 1 ; i <= n ; i++) {
                if (!vis[i]) {
                    dfs(i);
                }
            }

            while (!topoSort.isEmpty()){
                System.out.print(topoSort.pop() + " ");
            }
            System.out.println();

        }

    }

    private static void dfs(int i) {
        vis[i] = true;
        for (int num : graph[i]){
            if (!vis[num]){
                dfs(num);
            }
        }
        topoSort.push(i);
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
