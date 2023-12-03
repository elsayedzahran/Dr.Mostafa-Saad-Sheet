package B;
// problim link
/*
https://codeforces.com/contest/88/problem/B
*/


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Keyboard {
    static char[][] grid;
    static boolean[][] vis;
    static boolean[] visited;
    static int n,m;
    static int[] X = {1, -1, 0, 0};
    static int[] Y = {0, 0, 1, -1};
    static int res;
    static Reader input = new Reader();
    public static void main(String[] args) throws IOException {
        int n = input.nextInt();
        int m = input.nextInt();
        int k = input.nextInt();

        grid = new char[n][m];
        for (int i = 0; i < n; i++) {
            grid[i] = input.next().toCharArray();
        }

        List<Pair> list2[] = new List[26];
        for (int i = 0 ; i < 26 ; i++){
            list2[i] = new ArrayList<>();
        }

        List<Pair> list = new ArrayList<>();
        boolean sExist = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'S') {   // add position of Shift
                    sExist = true;
                   list.add(new Pair(i, j));
                } else {                   // add position of chars
                    list2[grid[i][j] - 'a'].add(new Pair(i, j));
                }
            }
        }
        int[] arr = new int[200];
        for (int i = 0 ; i <= 'z' - 'a' ; i++){  //calculate distance
            arr[i + 'a'] = calculate_value(list, list2[i]);
        }

        int q = input.nextInt(), res = 0;
        char[] query = input.next().toCharArray();

        for (int i = 0; i < q && res != -1; i++) {
            if (query[i] < 'a') {
                query[i] = Character.toLowerCase(query[i]);
                res += arr[query[i]] <= k * k ? 0 : 1;
                if (!sExist) {
                    res = -1;
                }
            }
            if (list2[query[i] - 'a'].size() == 0) {
                res = -1;
            }
        }
        System.out.println(res);


    }


    private static int calculate_value(List<Pair> list, List<Pair> list2) {
        int min = 100000000;
        for (int i = 0 ; i < list.size() ; i++){
            for (int j = 0 ; j < list2.size() ; j++) {
                int val = (int) Math.pow(list.get(i).first - list2.get(j).first, 2) + (int) Math.pow(list.get(i).second - list2.get(j).second, 2);
                min = Math.min(val, min);
            }
        }
        return min;
    }

    public static class Pair implements Comparable<Pair>{
        int first;
        int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(Pair o) {
            if (o.first != first){
                return first - o.first;
            }
            return second - o.second;
        }
    }

    private static void dfs(int x, int y, char ch) {
        vis[x][y] = true;
        for (int i = 0 ; i < 4 ; i++){
            int new_x = x + X[i];
            int new_y = y + Y[i];
            if (valid(new_x, new_y) && grid[new_x][new_y] != '.' && !visited[grid[new_x][new_y]]){
                visited[grid[new_x][new_y]] = true;
                dfs(new_x, new_y, ch);
                res++;
            }
        }
    }

    private static boolean valid(int i, int j) {
        return i < n && j < m && i >= 0 && j >= 0 && !vis[i][j];
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
        int[] nextIntArrayOneBased(int n) {
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) a[i] = (int) nextInt();
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }
}

