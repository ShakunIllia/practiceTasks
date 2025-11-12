public class Task {
    public static void main(String[] args) {

        int hour = 5;

        // ----Do not change below lines. needed for testing---
        hour = args.length > 0 ? Integer.parseInt(args[0]) : hour;
        //--------------------------------

        System.out.println("hour is "+hour);

        if(hour >= 5 && hour < 11) {System.out.println("Good Morning");}
        else if(hour > 11 && hour < 18) {System.out.println("Good Afternoon");}
        else if(hour >= 18 && hour <= 23 || hour >= 0 && hour < 5) {System.out.println("Good Evening");}
        else System.out.println("Invalid hour");

    }
}