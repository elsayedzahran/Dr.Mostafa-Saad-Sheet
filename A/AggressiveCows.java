package A;
// problim link
/*
https://vjudge.net/problem/SPOJ-AGGRCOW
 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AggressiveCows {
    static Reader input = new Reader();
    public static void main(String[] args) {

        int t = input.nextInt();

        while (t-- > 0) {

            int n = input.nextInt();
            int c = input.nextInt();
            int[] arr = input.nextIntArray(n);
            Arrays.sort(arr);
            int ans = binarySearch(0, 1000000000, arr, c);
            System.out.println(ans);
        }
    }

    private static int binarySearch(int l, int r, int[] arr, int c) {
        int ans = 0;
        while (l <= r){
            int mid = (l + r)/2;
            if (valid(mid, arr, c)){
                ans = mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return ans;
    }

    private static boolean valid(int dis, int[] arr, int c) {
        c--;
        int start = arr[0];
        for (int i = 1 ; i < arr.length && c > 0 ; i++){
            if (start + dis <= arr[i]){
                c--;
                start = arr[i];
            }
        }
        return c == 0 ? true : false;
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