
public class Task {
    public static void main(String[] args) {
        System.out.println(longestWord(new String[]{"aaa", "bbbbb", "whasstupppp", "longg", "jaaaaavvaaaaaaaaaa"}));
        System.out.println(longestWord(new String[]{"five5", "six666", "one1111111111111", "2two", "four4444"}));
    }

    public static String longestWord(String[] words){

        String longestWord = words[0];
        for(String word : words){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }

}