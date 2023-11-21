package A;
// problim link
/*
https://codeforces.com/contest/682/problem/A
 */

import java.io.*;
import java.util.StringTokenizer;

public class AlyonaAndNumbers {
    static Reader input = new Reader();
    public static void main(String[] args) {
        int n = input.nextInt();
        int m = input.nextInt();
        int[] freqA = new int[5];
        int[] freqB = new int[5];

        for (int i = 1 ; i <= n ; i++){
            freqA[i%5]++;
        }
        for (int i = 1 ; i <= m ; i++){
            freqB[i%5]++;
        }
        long result = ((long)freqA[0] * freqB[0]);

        for (int i = 1; i < 5; i++) {
            result += (long)freqA[i] * freqB[5 - i];
        }
        System.out.println(result);

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