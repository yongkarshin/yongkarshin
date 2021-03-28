
import java.util.Scanner;

public class MyRunnable {

    static int x;
    static int y;

    public static void main(String[] args) {

	//MyRunnable myRunnable=new MyRunnable();
        Scanner input=new Scanner(System.in);

        System.out.print("Please input x:");
        x=input.nextInt();

        System.out.print("Please input y:");
        y=input.nextInt();

        Thread odd= new Thread(() -> {
            int i;
            for(i=x;i<=y;i++){
                if(i%2==1){
                    System.out.println("Thread 1(odd):" + i);
                }
            }

        });

        Thread even= new Thread(() -> {
            int j;
            for(j=x;j<=y;j++){
                if(j%2==0){
                    System.out.println("Thread 2(even):" +j);
                }
            }

        });
        odd.start();
        even.start();

    }
}
