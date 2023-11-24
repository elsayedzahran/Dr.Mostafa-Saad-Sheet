import B.BurglarAndMatches;

import java.io.*;
import java.util.StringTokenizer;

public class HelperClass {
    static int fib(int n){
        if (n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    static int gcd(int a, int b){
        // greatest common divisor
        if (b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    static int lcm(int a, int b){
        // least common multiple
        return a * b / gcd(a, b);
    }
    static int fastPower(int b, int p){
        if (p == 0){
            return 1;
        }
        int sq = fastPower(b, p/2);
        sq *= sq;
        if (p % 2 == 0){
            sq *= b;
        }
        return sq;
    }
    static long NCR(long n, long r){
        if (r == 0 || r == n) {
            return 1;
        } else {
            return (n * NCR(n - 1, r - 1)) / r;
        }
    }
    static int sumPower(int a, int k){
        if (k == 0){
            return 0;
        }
        if (k % 2 == 1){
            return a * (1 + sumPower(a, k - 1));
        }
        int half  = sumPower(a, k/2);
        return half * (1 + half - sumPower(a, k/2 - 1));
    }

    static class Pair implements Comparable<Pair> {
        int a, b;
        // if you sort it will be in descending order
        @Override
        public int compareTo(Pair obj) {
            if (b == obj.b) {
                return Integer.compare(obj.a, a);
            } else {
                return Integer.compare(obj.b, b);
            }
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
            if (s == null) return false;
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
