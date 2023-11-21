package A;
// problim link
/*
https://codeforces.com/contest/287/problem/B
 */

import java.io.*;
import java.util.StringTokenizer;

public class Pipeline {
    static Reader input = new Reader();
    public static void main(String[] args) {
        long n = input.nextLong();
        long k = input.nextLong();
        if (n == 1){
            System.out.println(0);
            return;
        }
        if (n <= k){
            System.out.println(1);
            return;
        }
        n--;
        k--;
        long sum = (k * (k + 1))/2;
        if (sum < n){
            System.out.println(-1);
            return;
        }
        long ans = binarySearch(k, n);
        System.out.println(ans);

    }

    private static long binarySearch(long k, long n) {
        long ans = 0;
        long l = 0 ,r = k;
        while (l <= r){
            long mid = (l + r)/2;
            long sum = (k * (k + 1))/2 - (mid * (mid + 1))/2;
            if (sum >= n){
                ans = k - mid;
                l = mid + 1;
            }else{
                r = mid - 1;
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