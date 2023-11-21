package A;
// problim link
/*
https://vjudge.net/problem/UVA-408
 */



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UniformGenerator {

    public static void main(String[] args) throws IOException {
        usingEquation();  // solution using equation provided in the problem
        //usingGCD();  // solution using gcd

    }

    private static void usingGCD() throws IOException {
        FastReader input = new FastReader();
        while (input.ready()) {
            int step = input.nextInt();
            int mod = input.nextInt();
            String ans = gcd(step, mod) == 1 ? "Good Choice" : "Bad Choice";
            String s1 = step + "";
            while (s1.length() < 10){
                s1 = " " + s1;
            }
            String s2 = mod + "";
            while (s2.length() < 10){
                s2 = " " + s2;
            }
            ans = "    " + ans;
            System.out.println(s1 + s2 + ans);
            System.out.println();
        }
    }
    public static long gcd(long a, long b){
        if (b == 0)
            return a;
        return gcd(b, a%b);
    }
    public static long lcm(long a, long b){
        return a / gcd(a, b) * b;
    }
    private static void usingEquation() throws IOException {
        FastReader input = new FastReader();
        while (input.ready()){
            int step = input.nextInt();
            int mod = input.nextInt();
            int start = 0;
            boolean valid = true;
            boolean[] taken = new boolean[mod];
            for (int i = 0 ; i < mod ; i++){
                int next = (start + step) % mod;
                if (taken[next] == true){
                    valid = false;
                    break;
                }
                taken[next] = true;
                start = next;
            }

            String ans = valid ? "Good Choice" : "Bad Choice";
            String s1 = step + "";
            while (s1.length() < 10){
                s1 = " " + s1;
            }
            String s2 = mod + "";
            while (s2.length() < 10){
                s2 = " " + s2;
            }
            ans = "    " + ans;
            System.out.println(s1 + s2 + ans);
            System.out.println();
        }
    }
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        boolean ready() throws IOException{
            return br.ready();
        }
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}

