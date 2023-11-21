package A;
// problim link
/*
https://codeforces.com/contest/165/problem/B
 */

import java.io.*;
import java.util.StringTokenizer;

public class BurningMidnightOil {
    static Reader input = new Reader();
    public static void main(String[] args) {


        int n = input.nextInt();
        int k = input.nextInt();
        int ans = binarySearch(1, 1000000000, k, n);
        System.out.println(ans);

    }

    private static int binarySearch(int l, int r, int k, int n) {
        int ans = 0;
        while (l <= r){
            int mid = (l + r)/2;
            if (valid(mid, k, n)){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans;
    }

    private static boolean valid(int dis, int k, int n) {
        int con = k;
        n -= dis;
        int div = dis / k;
        while (n > 0 && div > 0){
            n -= div;
            k *= con;
            div = dis / k;
        }
        return n > 0 ? false : true;
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