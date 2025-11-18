public class Task {
    public static void main(String[] args) {

        int inhabitants = 20;

        // ----Do not change below lines. needed for testing---
        inhabitants = args.length > 0 ? Integer.parseInt(args[0]) : inhabitants;
        //--------------------------------
        int i = 0;
        while (inhabitants > 0) {
            System.out.println("Day "+ i++ +" ["+inhabitants+']');
            inhabitants = inhabitants / 2;
        }
        System.out.println("---- EXTINCT ----");
    }
}