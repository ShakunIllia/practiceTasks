public class Task {
    public static void main(String[] args) {

        int count = 5;
        //Do not change below line:needed for testing---
        count = args.length > 0 ? Integer.parseInt(args[0]) : count;

        count = count + 1;
        count+=1;
        System.out.println("count = " + ++count);
    }
}