package A;
// problim link
/*
https://vjudge.net/problem/SPOJ-MAKETREE
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Hierarchy {
    static Reader input = new Reader();
    static PrintWriter output = new PrintWriter(System.out);
    static List<Integer>[] graph;
    static List<Integer> topoSort;
    static int[] per;
    static boolean[] vis;
    // study topological sort and back :)
    public static void main(String[] args) throws IOException {
        int n = input.nextInt();
        int m = input.nextInt();
        graph = new List[n + 1];
        for (int i = 0 ; i <= n ; i++){
            graph[i] = new ArrayList<>();
        }
        per = new int[n+1];
        topoSort = new ArrayList<>();
        vis = new boolean[n + 1];
        for (int i = 0 ; i < m ; i++){
            int rep = input.nextInt();
            while (rep-- > 0){
                int node = input.nextInt();
                graph[i+1].add(node);
            }
        }
        for (int i = 1 ; i <= n ; i++){
            if (! vis[i]){
                dfs(i);
            }
        }
//        for (int i = 0 ; i < topoSort.size() ; i++){
//            System.out.print(topoSort.get(i) + " ");
//        }
        System.out.println();
        int pos = 0;
        for (int i = n - 1 ; i >= 0 ; i--){
            int child = topoSort.get(i);
            per[child] = pos;
            pos = child;
        }
        for (int i = 1 ; i <= n ; i++){
            output.println(per[i]);
        }
        output.close();
    }

    private static void dfs(int i) {
        vis[i] = true;
        for (int sub : graph[i]){
            if (! vis[sub]) {
                dfs(sub);
            }
        }
        topoSort.add(i);
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
            if (s == null) return false;
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
