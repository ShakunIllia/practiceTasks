public class Task {
    public static void main(String[] args) {
        double accountBalance =  1235;
        double itemPrice = 254.99;

        // ----Do not change below lines. needed for testing---
        accountBalance = args.length> 0 ? Double.parseDouble(args[0]): accountBalance;
        itemPrice = args.length> 0 ? Double.parseDouble(args[1]): itemPrice;
        //--------------------------------

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("canAfford = "+canAfford);
    }
}