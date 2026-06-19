import java.util.Scanner;

public class Memory {

    public static void main(String[] args) throws InterruptedException {

        
    Scanner sc = new Scanner(System.in);

    System.out.println("You will see a random 5-digit number.");
    System.out.println("Memorize it.");
    System.out.println("Press any key to start.");

    sc.next();

    int secretNumber = (int)(Math.random() * 90000) + 10000;

    System.out.println(secretNumber);

    int timer = 5;

    while (timer > 0) {

        System.out.println("Disappearing in " + timer);

        Thread.sleep(1000);

        timer--;
    }

    for (int i = 0; i < 50; i++) {
        System.out.println();
    }

    System.out.println("Enter the number:");

    int number = sc.nextInt();

    if (number == secretNumber) {
        System.out.println("🎉 Your memory is strong!");
    } else {
        System.out.println("❌ Wrong.");
        System.out.println("The number was: " + secretNumber);
    }

    sc.close();
        // System.out.println("you will see a random number in few seconds");
        // System.out.println("memorize it !!!");
        // System.out.println("press any KEY to Start game !!");


        // Scanner sc = new Scanner(System.in);
        // String start;
        // start=sc.next(); 

        // int secretNumber = (int)(Math.random() * 20000) + 1;
        // System.out.println(secretNumber);
        // if(start==start){
        //     int timer=5;
        //     while(timer>0){
        //         System.out.println("disapearing in "+ timer);
        //         Thread.sleep(1000);
        //         timer--;
        //     }
        //         System.out.println("enter that number !!");
        //         int number;
        //         number=sc.nextInt();
        //         if(number==secretNumber){
        //             System.out.println("you win");

        //         }
        //         else{
        //             System.out.println("you lost");
        //         }
            
        //     sc.close();
            
        
        // }
        // else{
        //     System.err.println("not in if");
        // }


        
    }
    
}
