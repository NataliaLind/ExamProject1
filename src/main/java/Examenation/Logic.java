package Examenation;

public class Logic {
    int sum = 0;
    int characters =0;
    int wordsLength = 0;
    String longestWord = "";
    int countWords =0;
    public void setSum(String str){
        if (!str.equals("stop")) {
            sum++;
        }
    }
    public int getSum() {
        return sum;
    }
    public void setCharacters(String str) {
        if (!str.equals("stop")) {
            characters+=str.length();
        }
    }
    public int getCharacters(){

        return characters;
    }
    public String getLongestWord(String str) {
        if (!str.equals("stop")) {
            String[] words = str.split(" ");

            countWords = countWords + words.length;
            for (int i = 0; i < words.length; i++) {


                if (words[i].length() > wordsLength) {
                    wordsLength = words[i].length();
                    longestWord = words[i];

                }

            }
        }
        return longestWord;
    }
}
