package Examenation;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logic lines= new Logic();
        String line = "";
        String result1="";

        while (!line.equals("stop")) {
            line = scan.nextLine();


            lines.setSum(line);
            lines.setCharacters(line);
            result1=lines.getLongestWord(line);
        }


        System.out.println("The number of lines is "+lines.getSum());
        System.out.println("The number of characters is "+lines.getCharacters());
        System.out.println("The number of words " +lines.countWords);
        System.out.println("The biggest word is " +result1);
    }
}
