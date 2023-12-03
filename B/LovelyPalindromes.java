package B;
// problim link
/*
https://codeforces.com/contest/688/problem/B
*/


import java.io.*;
import java.util.StringTokenizer;

public class LovelyPalindromes {
    static char[][] grid;
    static boolean[][] vis;
    static boolean[] visited;
    static int n,m;
    static int[] X = {1, -1, 0, 0};
    static int[] Y = {0, 0, 1, -1};
    static int res;
    static Reader input = new Reader();
    public static void main(String[] args) throws IOException {
        StringBuilder word = new StringBuilder(input.next());
        String num1 = word.toString();
        String num2 = word.reverse().toString();
        System.out.println(num1 + num2);
    }

    private static void dfs(int x, int y, char ch) {
        vis[x][y] = true;
        for (int i = 0 ; i < 4 ; i++){
            int new_x = x + X[i];
            int new_y = y + Y[i];
            if (valid(new_x, new_y) && grid[new_x][new_y] != '.' && !visited[grid[new_x][new_y]]){
                visited[grid[new_x][new_y]] = true;
                dfs(new_x, new_y, ch);
                res++;
            }
        }
    }

    private static boolean valid(int i, int j) {
        return i < n && j < m && i >= 0 && j >= 0 && !vis[i][j];
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
        int[] nextIntArrayOneBased(int n) {
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) a[i] = (int) nextInt();
            return a;
        }

            long[] nextLongArray(int n) {
                long[] a = new long[n];
                for (int i = 0; i < n; i++) a[i] = nextLong();
                return a;
            }
        }
}
