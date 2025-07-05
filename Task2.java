import java.util.Scanner;
class Task2{
    public static void main(String[] args){
        System.out.println("Welcome.....");
        Scanner scan = new Scanner(System.in);
        int marks[] = new int[10];
        int mc=0,totalMarks=0;

        
        while (true) { 
            System.out.println("****** CHOICE ******");
            System.out.println("1. ENTER MARKS");
            System.out.println("2. CALCULATE");
            System.out.println("3. EXIT");
            System.out.println("Enter Your choice :");

            int choice = scan.nextInt();
            if(choice != 1 && choice != 2){
                break;
            }
            switch (choice){
                case 1:
                    System.out.println("Enter Marks of Subject "+ (mc+1) + " Out of 100 " +":");
                    marks[mc]=scan.nextInt();
                    mc++;
                    continue;
                case 2:
                    System.out.println("****** RESULT ******");
                    for(int m:marks){
                        totalMarks += m;
                    }
                    int avgPer=totalMarks/(mc+1);
                    System.out.println("Total Marks : " + totalMarks);
                    System.out.println("Average Percentage : " + avgPer);
                    if(avgPer>=95){
                        System.out.println("Grade : O");
                    }
                    else if(avgPer>=90 && avgPer<95){
                        System.out.println("Grade : A");
                    }
                    else if(avgPer>=75 && avgPer<90){
                        System.out.println("Grade : B");
                    }
                    else if(avgPer>=60 && avgPer<75){
                        System.out.println("Grade : C");
                    }
                    else if(avgPer>=45 && avgPer<60){
                        System.out.println("Grade : D");
                    }
                    else if(avgPer>=0 && avgPer<45){
                        System.out.println("Grade : Fail");
                    }
                    break;
                default:
                    break;
                    

            }
        }
    }
}