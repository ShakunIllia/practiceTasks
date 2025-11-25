
public class Task {
    public static void main(String[] args) {
        System.out.println(uniqueChars("java"));
        System.out.println(uniqueChars("mama"));
    }

    public static String uniqueChars(String str) {

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (unique.indexOf(ch) == -1) { // якщо ще не міститься
                unique += ch;
            }
        }


        return unique;
    }

}