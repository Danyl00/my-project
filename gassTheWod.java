import java.util.Scanner;

public class gassTheWod {
    public static void main(String[] args) {
String secretWord="Hello";
Scanner sk= new Scanner(System.in);
        System.out.println("Welcome to game");
int counter=0;
Boolean GessEnd=false;
while(!GessEnd&&counter<3) {
    counter++;
    System.out.println("Enter Word");
    String UserWord=sk.next();
    if (UserWord.equalsIgnoreCase(secretWord)) {
        System.out.println("You Win,attempts:"+counter);
        GessEnd=true;
    }
    else{
        System.out.println("Sorry you didn't guess");


    }

    }

}





    }
