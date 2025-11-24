
public class Task {
    public static void main(String[] args) {
        System.out.println(countLetters("aaabbcccc"));
        System.out.println(countLetters("appleeess"));
    }

    public static String countLetters(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            // пропускаємо, якщо символ уже був порахований
            if (result.indexOf(current) != -1) {
                continue;
            }

            int count = 0;

            // рахуємо повторення current
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == current) {
                    count++;
                }
            }
            result += count + "" + current;
        }

            return result;
    }
}