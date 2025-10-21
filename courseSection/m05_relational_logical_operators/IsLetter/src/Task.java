public class Task {
    public static void main(String[] args) {

        char c = 'a';
        // ----Do not change below lines. needed for testing---
        c = args.length > 0 ? args[0].charAt(0) : c;
        //--------------------------------

        boolean isLetter = c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
        System.out.println("isLetter = "+ isLetter);
    }
}