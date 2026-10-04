import java.util.*;
public class Main {
    static void checkBalance(double balance){
    System.out.println("Current Balance: "+"₹"+ balance );
    }

    static  double deposit(double balance,double amount){
    if(amount > 0){
    balance = balance+amount;
    System.out.println("Deposit successfully."+ "₹"+ amount);
    System.out.println("Updated balance :" + balance);
    }else{
        System.out.println("Invalid amount!");
    }

    return balance;
    }
    static double withdraw(double balance,double amount){
        if(amount<=balance && amount > 0){
            balance = balance - amount;
            System.out.println("Withdrawal successful."+ "₹"+ amount);
            System.out.println("Remaining balance: "+"₹"+balance);
        }else if(amount>balance){
            System.out.println("Insufficient Balance");
        }else if(amount<=0){
            System.out.println("Invalid amount");
        }

        return balance;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        int choice = 0;
        do{
        System.out.println();
        System.out.println("*----------------MINI ATM-----------------*");
        System.out.println("___________________________________________");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit Money");
        System.out.println("3.Withdraw Money");
        System.out.println("4.Exit");
        System.out.println("-------------------------------------------");
        System.out.println("Enter your choice:");
        choice = sc.nextInt();
        System.out.println("-------------------------------------------");
        double amount;
        switch(choice){

        case 1 :

        checkBalance(balance);
        break;

        case 2:
        System.out.println("Enter amount: ");
        amount = sc.nextDouble();
        System.out.println("______________________________________________");
        balance = deposit(balance, amount);
        break;

        case 3:
        System.out.println("Enter amount:");
        amount = sc.nextDouble();
        balance = withdraw(balance, amount);
        break;

        case 4:
            System.out.println("Thank you for using Mini ATM");
            System.out.println("Have a nice day!" );
            break;

            default:
                System.out.println("Invalid choice!");
        }
        }
        while(choice !=4);

    }
    }


