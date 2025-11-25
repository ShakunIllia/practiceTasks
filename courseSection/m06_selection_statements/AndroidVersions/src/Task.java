public class Task {
    public static void main(String[] args) {

        String version = "1.5";

        // ----Do not change below lines. needed for testing---
        version = args.length > 0 ? args[0] : version;
        //--------------------------------

        switch(version) {
            case "1.5":
                version = "Cupcake";
                break;
            case "1.6":
                version = "Donut";
                break;
            case "2.1":
                version = "Eclair";
                break;
            case "2.2":
                version = "Froyo";
                break;
            case "2.3":
                version = "Gingerbread";
                break;
            case "3.1":
                version = "Honeycomb";
                break;
            case "4.0 ":
                version = "Ice Cream Sandwich";
                break;
            case "4.1":
                version = "Jelly Bean";
                break;
            case "4.4":
                version = "KitKat";
                break;
            case "5.0":
                version = "Lollipop";
                break;
            case "8.0":
                version = "Oreo";
                break;
            case "9.0":
                version = "Pie";
                break;
            default:
                version = "Not a valid version";
        }
        System.out.println(version);
    }
}