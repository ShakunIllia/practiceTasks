public class Task {
    public static void main(String[] args) {

        char response = 'y';

        // ----Do not change below lines. needed for testing---
        response = args.length > 0 ? args[0].charAt(0) : response;
        //--------------------------------
        System.out.println(response);
        switch (response){
            case 'y': System.out.println("Your request is being processed"); break;
            case 'n': System.out.println("Thank you for your consideration"); break;
            case 'h': System.out.println("Sorry, no live agents are currently available"); break;
            default: System.out.println("Invalid entry, please try again"); break;
        }
    }
}