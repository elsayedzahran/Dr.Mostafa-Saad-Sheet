package B;
// problim link
/*
https://codeforces.com/contest/47/problem/B
*/


import java.io.*;
import java.util.StringTokenizer;

public class Coins {
    static Reader input = new Reader();
    public static void main(String[] args){
        int c = 0 ,a = 0 ,b = 0;
        for (int i = 0 ; i < 3 ; i++){
            String in = input.next();
            if (in.equals("A>B") || in.equals("B<A") || in.equals("A>C") || in.equals("C<A")){
                a++;
            }
            if (in.equals("A<B") || in.equals("B>A") || in.equals("B>C") || in.equals("C<B")){
                b++;
            }
            if (in.equals("A<C") || in.equals("C>A") || in.equals("C>B") || in.equals("B<C")){
                c++;
            }
        }
        if (a == b || b == c || a == c){
            System.out.println("Impossible");
            return;
        }
        if (a > b && b > c){
            System.out.println("CBA");
        } else if (a > c && b < c) {
            System.out.println("BCA");
        }else if (b > c && a < c) {
            System.out.println("ACB");
        }else if (b > a && a > c) {
            System.out.println("CAB");
        }else if (c > a && b < a) {
            System.out.println("BAC");
        }else {
            System.out.println("ABC");
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
