import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String guestList = "Guests' list: ";
        String moreGuests = "yes";

        do {
            System.out.println("Please enter the guest's name:");
            String name = input.nextLine();

            if (!guestList.toLowerCase().contains(name.toLowerCase())) {
                if (!guestList.endsWith(": ")) {
                    guestList += ", ";
                }
                guestList += name;
            }

            System.out.println("Do you want to enter another guest's name?");
            moreGuests = input.nextLine();

        } while (moreGuests.equalsIgnoreCase("yes")); // if the String is anything besides yes then the loop stops

        System.out.println(guestList);

    }
}