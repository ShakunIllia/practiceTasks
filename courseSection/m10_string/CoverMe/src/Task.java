
public class Task {
    public static void main(String[] args) {
        System.out.println(coverMe("java methods", "me"));
        System.out.println(coverMe("Certified Wooden Spoon", "o"));
    }

    public static String coverMe(String main, String coverMe){

        if (!main.contains(coverMe)) {
            return "[" + main + "]";
        }

        return main.replace(coverMe, "[" + coverMe + "]");
    }


}