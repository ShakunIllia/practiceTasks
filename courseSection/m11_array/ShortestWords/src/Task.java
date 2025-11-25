import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shortestWords("olive, fish, pursuit, old, warning, python, java, coffee, cat, ray")));
        System.out.println(Arrays.toString(shortestWords("spare, decrease, morning, article, chaos, orbit, acceptance, lodge, tournament, trade")));
    }

    public static String[] shortestWords(String str){

        String[] words = str.split(", ");

        int min = words[0].length();
        for(String word: words){
            if(word.length() < min){min = word.length();}
        }
        int count = 0;
        for(String word: words){
            if(word.length() == min){count++;}
        }
        String[] result = new String[count];
        int index = 0;
        for(String word: words){
            if(word.length()==min){
                result[index++] = word;
            }
        }
        return result;
    }

}