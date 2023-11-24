package B;
// problim link
/*
https://vjudge.net/problem/UVA-412
*/


import java.io.*;
import java.util.StringTokenizer;

public class PI {
    static Reader input = new Reader();
    static int gcd(int a, int b){
        // greatest common divisor
        if (b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static void main(String[] args) throws IOException {
        while (true){
            int n = input.nextInt();
            if (n == 0){
                return;
            }
            int[] arr = input.nextIntArray(n);
            int cnt = 0;
            for (int i = 0 ; i < n ; i++){
                for (int j = i + 1 ; j < n ; j++){
                    if (gcd(arr[i], arr[j]) == 1){
                        cnt++;
                    }
                }
            }
            if (cnt == 0){
                System.out.println("No estimate for this data set.");
                continue;
            }
            double pi = Math.sqrt(((n * (n-1)) * 3.0) / cnt);
            System.out.println(String.format("%.6f", pi));
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
