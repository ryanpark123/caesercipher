import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String original;
        String coded =""; // accumulator

        int letter;
        int shift; // displacement
        int codeLetter; // replacement
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        // prompt for message to encode
        System.out.print("Enter the text to be encoded: ");
        original = input.nextLine();

        // prompt for degrees of shifting
        System.out.print("Enter the shift that you wish to use: ");
        shift = input.nextInt();

        // traverse the original message
        // change all the letters to their shifted equivalents
        for(int i=0; i<original.length(); i++){
            if(alphabet.indexOf(original.substring(i,i+1))!=-1){
                letter=alphabet.indexOf(original.substring(i,i+1));
                codeLetter=letter+shift;
                codeLetter%=26; // highest 25, low 0
                coded+=alphabet.substring(codeLetter,codeLetter+1);
            } else {
                coded +=original.substring(i,i+1);
            }
            System.out.println(coded);
        }

        System.out.println(coded);

        input.close();

    }
}