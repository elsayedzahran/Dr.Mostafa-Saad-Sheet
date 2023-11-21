package A;
// problim link
/*
https://codeforces.com/contest/807/problem/A
 */

import java.io.*;
import java.util.StringTokenizer;

public class IsItRated {
    static Reader input = new Reader();
    public static void main(String[] args) {
        int n = input.nextInt();
        int[][] arr = new int[n+1][2];
        int rated = -1;
        for (int i = 0 ; i < n ; i++){
            arr[i][0] = input.nextInt();
            arr[i][1] = input.nextInt();
            if (arr[i][0] != arr[i][1]) {
                rated = 1;
            }
            if (i > 0 && rated != 1 && arr[i][0] > arr[i-1][0]){
                rated = 0;
            }
        }
        if (rated == 1){
            System.out.println("rated");
        }else if (rated == 0){
            System.out.println("unrated");
        }else{
            System.out.println("maybe");
        }

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