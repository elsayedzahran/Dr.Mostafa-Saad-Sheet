package B;
// problim link
/*
https://codeforces.com/contest/16/problem/B
*/


import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BurglarAndMatches {
    static Reader input = new Reader();
    public static void main(String[] args){
        int n = input.nextInt();
        int k = input.nextInt();
        Pair[] arr = new Pair[k];

        for (int i = 0 ; i < k ; i++){
            arr[i] = new Pair();
            arr[i].a = input.nextInt();
            arr[i].b = input.nextInt();
        }
        Arrays.sort(arr);
        int result = 0;
        for (int i = 0 ; i < k && n >= 0 ; i++){
            if (arr[i].a <= n){
                result += (arr[i].a * arr[i].b);
                n -= arr[i].a;
            }else{
                result += (n * arr[i].b);
                System.out.println(result);
                return;
            }
        }
        System.out.println(result);

    }
    static class Pair implements Comparable<Pair> {
        int a, b;
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
