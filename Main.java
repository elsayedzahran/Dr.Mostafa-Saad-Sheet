
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static Reader input = new Reader();
    static boolean[] prime;
    static boolean[] vis;
    static List<Node> nodes;
    public static void main(String[] args) {

        int t = input.nextInt();
        while (t-- > 0) {
            int n = input.nextInt();
            int k = input.nextInt();
            int[] arr = input.nextIntArray(n);
            boolean isSorted = true;
            for (int i = 1 ; i < n && isSorted ; i++){
                if (arr[i] < arr[i-1])
                    isSorted = false;
            }
            if (isSorted) {
                System.out.println("YES");
                continue;
            }
            System.out.println(k > 1 ? "YES" : "NO");

        }
    }

    static class Node {
        char label;
        Node left, right;
        public Node(char item){
            label = item;
            left = right = null;
        }
    }

    private static void seive(int n) {
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }
    }

    public static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }


    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n <= 3)
            return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
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
