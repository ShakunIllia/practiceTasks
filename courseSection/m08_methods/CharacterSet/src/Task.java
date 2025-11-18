public class Task {
    public static void main(String[] args) {

        System.out.println(getCharacterSet('7', 'P'));
        System.out.println(getCharacterSet("uppercase"));

    }

    public static String getCharacterSet(char start, char end) {
        StringBuilder result = new StringBuilder();
        for (char ch = start; ch <= end; ch++) {
            result.append(ch);
        }
        return result.toString();
    }

    public static String getCharacterSet(String group) {

        switch (group.toLowerCase()) {
            case "uppercase":
                return "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            case "lowercase":
                return "abcdefghijklmnopqrstuvwxyz";
            case "digit":
                return "0123456789";
            case "special":
                return "!\"#$%&'()*+,-.";
            default:
                return "Invalid input";
        }


    }
}