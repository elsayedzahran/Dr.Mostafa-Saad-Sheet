package B;
// problim link
/*
https://codeforces.com/contest/492/problem/B
*/


import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class VanyaAndLanterns {
    static Reader input = new Reader();
    static int gcd(int a, int b){
        // greatest common divisor
        if (b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        int n = input.nextInt();
        int m = input.nextInt();
        int[] arr = input.nextIntArray(n);
        Arrays.sort(arr);
        double max = 0;
        for (int i = 0 ; i < n - 1 ; i++){
            max = Math.max(max, arr[i + 1] - arr[i]);
        }
        max = max/2;
        max = Math.max(max, m - arr[n - 1]);
        max = Math.max(max, arr[0]);
        System.out.println(String.format("%.11f", max));

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
