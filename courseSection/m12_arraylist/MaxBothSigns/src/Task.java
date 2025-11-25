import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        System.out.println(findMaxBoth(new ArrayList<>(List.of(20, 2, 5, -2, 8, -5))));
        System.out.println(findMaxBoth(new ArrayList<>(List.of(-2, -23, -9, 2, 7, 20))));
        System.out.println(findMaxBoth(new ArrayList<>(List.of(-20, -23, -9, 3, 7, 20))));
    }

    public static int findMaxBoth(ArrayList<Integer> nums) {

        int max = 0;

        for(int i = 0; i < nums.size(); i++){
            for(int j = 0; j < nums.size(); j++){

                if(nums.get(i) == -nums.get(j)){
                    int value = Math.abs(nums.get(i));
                    if(value > max){
                        max = value;
                    }
                }

            }
        }

        return max;
    }
}