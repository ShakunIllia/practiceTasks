public class Task {
    public static void main(String[] args) {

        System.out.println(simpleRoomBook(true,2,1,2018));

    }

    public static boolean simpleRoomBook(boolean isAvailable, int month, int day, int year) {

        return isAvailable && (year == 2018) && (month == 7) && (day >= 1 && day <= 8);

    }

}