public class Task {
    public static void main(String[] args) {

        int age = 25;

        // ----Do not change below lines. needed for testing---
        age = args.length > 0 ? Integer.parseInt(args[0]) : age;
        //--------------------------------

        boolean isEligible = age >= 18 && age <= 65;
        System.out.println("Am I eligible to work? "+isEligible);
    }
}