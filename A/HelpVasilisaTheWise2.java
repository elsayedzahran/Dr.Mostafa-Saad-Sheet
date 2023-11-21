package A;
// problim link
/*
https://codeforces.com/contest/143/problem/A
 */

import java.io.*;
import java.util.StringTokenizer;

public class HelpVasilisaTheWise2 {
    static Reader input = new Reader();
    public static void main(String[] args) {
        int[] inputs = input.nextIntArray(6);
        int[][] arr = new int[2][2];

        boolean ok = false;
        for (int i = 1 ; i <= 9 ; i++){
            arr[0][0] = i;
            arr[0][1] = inputs[0] - arr[0][0];
            arr[1][0] = inputs[2] - arr[0][0];
            arr[1][1] = inputs[1] - arr[1][0];

            if (valid(arr, inputs)){
                ok = true;
                break;
            }
        }
        if (!ok){
            System.out.println(-1);
            return;
        }
        System.out.println(arr[0][0] + " " + arr[0][1]);
        System.out.println(arr[1][0] + " " + arr[1][1]);

    }

    private static boolean valid(int[][] arr, int[] inputs) {
        int[] freq = new int[10];
        for (int i = 0 ; i < 2 ; i++){
            for (int j = 0 ; j < 2 ; j++){
                if (arr[i][j] < 1 || arr[i][j] > 9){
                    return false;
                }
                freq[arr[i][j]]++;
            }
        }
        if (arr[0][0] + arr[0][1] != inputs[0]) {
            return false;
        }
        if (arr[1][0] + arr[1][1] != inputs[1]) {
            return false;
        }
        if (arr[0][0] + arr[1][0] != inputs[2]) {
            return false;
        }
        if (arr[0][1] + arr[1][1] != inputs[3]) {
            return false;
        }
        if (arr[0][0] + arr[1][1] != inputs[4]) {
            return false;
        }
        if (arr[0][1] + arr[1][0] != inputs[5]) {
            return false;
        }
        for (int i = 0 ; i < 10 ; i++){
            if (freq[i] > 1){
                return false;
            }
        }
        return true;
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