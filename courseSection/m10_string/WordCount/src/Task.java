
public class Task {
    public static void main(String[] args) {
        System.out.println(wordCount("one two three"));
        System.out.println(wordCount("foo bar"));
    }

    public static int wordCount(String words) {

        if (words == null || words.isEmpty()) {
            return 0;
        }

        int count = 0;
        boolean insideWord = false;

        for (int i = 0; i < words.length(); i++) {
            char ch = words.charAt(i);

            if (ch != ' ') {
                if (!insideWord) {
                    count++;
                    insideWord = true;
                }
            } else {
                insideWord = false;
            }
        }

        return count;
    }
}