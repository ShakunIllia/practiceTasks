public class Task {
    public static void main(String[] args) {

        int num = 1;

        // ----Do not change below lines. needed for testing---
        num = args.length > 0 ? Integer.parseInt(args[0]) : num;
        //--------------------------------

        System.out.println("num is " + num);

        if(num > 0){System.out.println("positive");}
        else if(num < 0){System.out.println("negative");}
        else if(num == 0){System.out.println("zero");}
        else System.out.println("invalid number");


    }
}