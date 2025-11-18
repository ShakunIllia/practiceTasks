public class Task {
    public static void main(String[] args) {

        int n = 5;

        // ----Do not change below lines. needed for testing---
        n = args.length > 0 ? Integer.parseInt(args[0]) : n;
        //--------------------------------

        int res = 1;
        for(int i = 1; i <= n; i++) {res*=i;}
        System.out.println(res);
    }
}