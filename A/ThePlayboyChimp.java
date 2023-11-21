package A;
// problim link
/*
https://vjudge.net/problem/UVA-10611
 */

import java.io.*;
import java.util.StringTokenizer;

public class ThePlayboyChimp {
    static Reader input = new Reader();
    public static void main(String[] args) {

        int n = input.nextInt();
        int[] arr = input.nextIntArray(n);
        int q = input.nextInt();
        int[] queries = input.nextIntArray(q);
        for (int i = 0 ; i < q ; i++){
            int shorter = findNearestLower(0, n-1, queries[i], arr);
            int taller = findNearestHigher(0, n-1, queries[i], arr);
            System.out.println((shorter == -1 ? "X" : shorter) + " " + (taller == -1 ? "X" : taller));
        }
    }

    private static int findNearestHigher(int l, int r, int query, int[] arr) {
        int ans = -1;
        while (l <= r){
            int mid = (l + r)/2;
            if (arr[mid] > query){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return ans != -1 ? arr[ans] : ans;
    }

    private static int findNearestLower(int l, int r, int query, int[] arr) {
        int ans = -1;
        while (l <= r){
            int mid = (l + r)/2;
            if (arr[mid] < query){
                ans = mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return ans != -1 ? arr[ans] : ans;
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