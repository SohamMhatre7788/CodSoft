import java.util.Scanner;
class userAccount{
        double balance=0;

}

class ATM extends userAccount{
    public void withdraw(double amount){
        if(balance<=0 || amount>balance){
            System.out.println("OOPs Withdraw Failed... Your Account has Balance "+balance);
        }
        else{
            balance-=amount;
            System.out.println("Withdraw Succesful.. Your Balance is "+balance);
        }
    }
    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposit Succesful.. Your Balance is "+ balance);
    }
    public void checkBalance(){
        System.out.println("Your Balance is "+balance);
    }

}
public class Task3 extends ATM{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int choice;
        ATM myATM = new ATM();
        while(true){
            System.out.println("******************");
            System.out.println("Choose Operation:");
            System.out.println("1.Withdraw Amount \t 2.Deposit Amount \t 3.Check Balance");
            System.out.println("[Press Any Key To exit...]");
            choice=scan.nextInt();
            
            double amount;
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Amount To Withdraw:");
                    amount=scan.nextDouble();
                    System.out.println("******************");
                    myATM.withdraw(amount);
                    continue;
                case 2:
                    System.out.print("Enter Amount To Deposit:");
                    amount=scan.nextDouble();
                    System.out.println("******************");
                    myATM.deposit(amount);
                    continue;
                case 3:
                    System.out.println("******************");
                    myATM.checkBalance();
                    continue;
                default:
                    break;
                    
            }
            break;
        }
        
    }
}