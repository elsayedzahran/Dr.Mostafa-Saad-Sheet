package A;
// problim link
/*
https://codeforces.com/contest/287/problem/A
*/

import java.io.*;
import java.util.StringTokenizer;

public class IQTest {
    static Reader input = new Reader();
    public static void main(String[] args) {
        char[][] grid = new char[4][4];
        for (int i = 0 ; i < 4 ; i++){
            grid[i] = input.next().toCharArray();
        }
        for (int i = 0 ; i < 3 ; i++){
            int l = 0;
            int r = 1;
            while (r < 4){
                if (grid[i][l] == grid[i][r]){
                    if (grid[i][l] == grid[i+1][l] || grid[i][l] == grid[i+1][r]){
                        System.out.println("YES");
                        return;
                    }
                }else{
                    if (grid[i+1][l] == grid[i+1][r]){
                        System.out.println("YES");
                        return;
                    }
                }
                l++;
                r++;
            }
        }
        System.out.println("NO");
    }

    static class Reader extends PrintWriter {

        private final BufferedReader r;
        private StringTokenizer st;

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