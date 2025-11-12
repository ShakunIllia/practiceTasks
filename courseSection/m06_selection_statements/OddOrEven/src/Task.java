public class Task {
    public static void main(String[] args) {

        int num = 100;

        // ----Do not change below lines. needed for testing---
        num = args.length > 0 ? Integer.parseInt(args[0]) : num;
        //--------------------------------

        System.out.println("num is " + num);

        if(num%2 == 0) {System.out.println(num + " is even");}
        else System.out.println(num + " is odd");

    }
}