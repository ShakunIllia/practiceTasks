
public class Task {
    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4}));
        System.out.println(countEvens(new int[]{1, 3, 5, 7, 9}));
    }

    public static int countEvens(int[] nums){

        int sum = 0;
        for(int element: nums){
            if(element % 2 == 0){sum+=1;}
        }
        return sum;
    }
}