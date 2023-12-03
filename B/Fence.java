package B;
// problim link
/*
https://codeforces.com/contest/363/problem/B
*/


import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Fence {
    static Reader input = new Reader();
    public static void main(String[] args) throws IOException {
        int n = input.nextInt();
        int k = input.nextInt();
        int[] arr = input.nextIntArrayOneBased(n);

        long[] prefix = new long[n + 2];
        for (int i = 1 ; i <= n ; i++){
            prefix[i] = prefix[i - 1] + arr[i];
        }
        long min = Integer.MAX_VALUE;
        int res = -1;
        for (int i = 1 ; i <= n - (k-1) ; i++){
            long sum = prefix[i + (k-1)] - prefix[i - 1];
            min = Math.min(sum, min);
            res = sum == min ? i : res;
        }
        System.out.println(res);

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
