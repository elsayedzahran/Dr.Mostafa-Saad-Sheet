package A;
// problim link
/*
https://codeforces.com/contest/382/problem/A
 */

import java.io.*;
import java.util.StringTokenizer;

public class KseniaAndPanScales {
    static Reader input = new Reader();
    public static void main(String[] args) {

        char[] string = input.next().toCharArray();
        char[] weights = input.next().toCharArray();

        int left = 0;
        for (int i = 0 ; i < string.length ; i++){
            if (string[i] == '|'){
                break;
            }
            left++;
        }
        String stringL = "";
        String stringR = "";
        int idx = 0;
        for (int i = 0 ; i < string.length ; i++){
            if (string[i] == '|'){
                continue;
            }else if (i < left){
                stringL += string[i];
            }else {
                stringR += string[i];
            }
        }
        int addSize = weights.length;
        while (idx < addSize){
            if (stringL.length() < stringR.length()){
                stringL += weights[idx++];
            }else {
                stringR += weights[idx++];
            }
        }
        if (stringL.length() != stringR.length()){
            System.out.println("Impossible");
            return;
        }
        System.out.println(stringL + '|' + stringR);

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