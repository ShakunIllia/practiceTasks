public class Task {
    public static void main(String[] args) {

        System.out.println(waterTax(55));

    }

    public static double waterTax(int units){

        double bill;
        if (units <= 50) {
            bill = units * 0.60;
        }
        else if (units > 150) {
            bill = units * 0.90 + 100;
        }
        else if (units > 100) {
            bill = units * 0.90 + 50;
        }
        else {
            bill = units * 0.90;
        }

        return bill;
        }


}