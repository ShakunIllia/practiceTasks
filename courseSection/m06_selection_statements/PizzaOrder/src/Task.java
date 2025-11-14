public class Task {
    public static void main(String[] args) {

        char size  = 'S';
        char addPepperoni = 'Y';
        char extraCheese = 'Y';

        // ----Do not change below lines. needed for testing---
        size = args.length > 0 ? args[0].charAt(0) : size;
        addPepperoni = args.length > 0 ? args[1].charAt(0) : addPepperoni;
        extraCheese = args.length > 0 ? args[2].charAt(0) : extraCheese;
        //--------------------------------

        double price = 0.0;

        System.out.println("Size: " + size);
        System.out.println("Add Pepperoni: " + addPepperoni);
        System.out.println("Extra Cheese: " + extraCheese);

        if(size == 'S') {price += 13.99;}
        else if(size == 'M') {price += 15.99;}
        else if(size == 'L') {price += 18.79;}
        else System.out.println("Invalid size");

        if(addPepperoni == 'Y'){
            if(size == 'S') {price += 1.50;}
            else if(size == 'M') {price += 1.90;}
            else if(size == 'L') {price += 2.10;}
            else System.out.println("Invalid input");
        }
        if(extraCheese == 'Y'){
            if(size == 'S') {price += 1.25;}
            else if(size == 'M') {price += 1.65;}
            else if(size == 'L') {price += 2.00;}
            else System.out.println("Invalid input");
        }
        System.out.println("Total price " + price);
    }
}