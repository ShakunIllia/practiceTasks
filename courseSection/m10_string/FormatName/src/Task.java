
public class Task {
    public static void main(String[] args) {
        System.out.println(fixFormat("CADEN ARROYO"));
        System.out.println(fixFormat("jaX wOLF"));
    }

    public static String fixFormat(String name) {

        String[] parts = name.split(" ");
        String result = "";

        for (int i = 0; i < parts.length; i++) {
            String word = parts[i].toLowerCase();                 // усе в нижній регістр
            word = word.substring(0, 1).toUpperCase() + word.substring(1);  // перша літера велика

            result += word;

            if (i < parts.length - 1) {
                result += " ";  // додаємо пробіл між словами
            }
        }

        return result;
    }
}