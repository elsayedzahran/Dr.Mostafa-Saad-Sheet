package B;
// problim link
/*
https://vjudge.net/problem/UVA-369
*/


import java.io.*;
import java.util.StringTokenizer;

public class Combinations {
    static Reader input = new Reader();
    static long NCR(long n, long r){
        if (r == 0 || r == n) {
            return 1;
        } else {
            return (n * NCR(n - 1, r - 1)) / r;
        }
    }
    public static void main(String[] args) throws IOException {
        int n,m;
        while ((n = input.nextInt()) != 0 && (m = input.nextInt()) != 0){
            System.out.println(n + " things taken " + m + " at a time is " + NCR(n, m) + " exactly.");
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
