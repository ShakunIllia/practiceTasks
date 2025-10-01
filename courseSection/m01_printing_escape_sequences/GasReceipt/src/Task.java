public class Task {
    public static void main(String[] args) {

        String a ="MCLEAN STORE";
        String b ="2019-06-19      04:38PM";
        String c ="gallons:        10.870";
        String d ="Price/Gallon:   $2.089";
        String e ="Refuel total:   $22.71";
        String[] list = {a, b, c, d, e};
        for(int i = 0; i < list.length; i++) {
            if (i == 0) {
                System.out.println("\t" + "\t" + list[i]);
                continue;
            }
            System.out.println("\t" + list[i]);
        }
    }
}