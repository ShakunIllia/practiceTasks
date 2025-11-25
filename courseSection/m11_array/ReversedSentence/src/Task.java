
public class Task {
    public static void main(String[] args) {
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("Hello! How are you?"));
    }

    public static String reverseSentence(String sentence){

        String[] words = sentence.split(" ");

        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i != 0) {
                result += " ";  // додаємо пробіл між словами
            }
        }

        return result;

    }

}