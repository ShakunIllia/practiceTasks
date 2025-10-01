public class Task {
    public static void main(String[] args) {
        int h = 3;
        String str = "";
        for(int i = 1; i <= h; i++){
            str = " ".repeat(h-i) + "*".repeat(i)+"*".repeat(i-1);
            System.out.println(str);
        }
    }
}
