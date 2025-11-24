
public class Task {
    public static void main(String[] args) {
        System.out.println(countTriples("abcXXXabc"));
        System.out.println(countTriples("xxxabyyyycd"));
        System.out.println(countTriples("java"));
    }

    public static int countTriples(String str){

        int tripleCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            char current = str.charAt(i);

            if (str.charAt(i + 1) == current && str.charAt(i + 2) == current) {
                tripleCount++;
            }
        }


        return tripleCount;
    }
}