public class Task {
    public static void main(String[] args) {

        System.out.println("Welcome to Cydeo Apartments!");
        System.out.println("How many bedrooms are you looking for?");

        int numberOfBedrooms = 1;

        // ----Do not change below lines. needed for testing---
        numberOfBedrooms = args.length > 0 ? Integer.parseInt(args[0]) : numberOfBedrooms;
        //--------------------------------

        switch(numberOfBedrooms){
            case 1:
                System.out.println(numberOfBedrooms);
                System.out.println("One Bedroom Selected"+'\n'+"Starting Price: 1100");
                break;
            case 2:
                System.out.println(numberOfBedrooms);
                System.out.println("Two Bedroom Selected"+'\n'+"Starting Price: 1850");
                break;
            case 3:
                System.out.println(numberOfBedrooms);
                System.out.println("Three Bedroom Selected"+'\n'+"Starting Price: 2550");
                break;
            default:
                System.out.println(numberOfBedrooms);
                System.out.println("Sorry, we do not offer that many bedrooms");
                break;
        }
    }
}