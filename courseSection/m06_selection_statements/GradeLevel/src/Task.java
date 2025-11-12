public class Task {
    public static void main(String[] args) {

        int age = 10;

        // ----Do not change below lines. needed for testing---
        age = args.length > 0 ? Integer.parseInt(args[0]) : age;
        //--------------------------------

        System.out.println("age is " + age);

        if(age < 3) {System.out.println("ineligible");}
        else if(age < 5) {System.out.println("preschool");}
        else if(age == 5) {System.out.println("kindergarten");}
        else if(age < 11) {System.out.println("elementary school");}
        else if(age < 14) {System.out.println("middle school");}
        else if(age < 18) {System.out.println("high school");}
        else if(age > 18) {System.out.println("college");}
    }
}