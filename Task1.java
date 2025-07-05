
import java.util.Scanner;

class Task1{
    public static void main(String[] args){
        int counter=0;
        int won=0;
        System.out.println("WELCOME TO NUMBER GAME.... You have 5 Attempts ");
        Scanner scan = new Scanner(System.in);
        for(int a = 4; a>=0;a--){ 
            System.out.print("ENTER A NUMBER FROM 1 TO 100 :");
            int Number= scan.nextInt();
            int randomNumber= (int) (Math.random() * 100);
            if (Number== randomNumber){
                System.out.println("Wowwww... You Won!");
                won++;
                counter++;
                System.out.println("WON: " + won +" Played: " + counter);
            }
            counter++;
            System.out.println("Oooooh.... The Number Was " + randomNumber);

            System.out.println("WON: " + won + " " + "Played: " + counter);
            System.out.println("You have " + a + " Attempts Left");
            
            System.out.print("Press 1. TO CONTINUE or Press any Number to Exit :");
            int choice = scan.nextInt();
            if(choice != 1){
                break;
            }
        
        }


    }
}