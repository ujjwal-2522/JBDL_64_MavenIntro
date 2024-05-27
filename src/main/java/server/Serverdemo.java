package server;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Serverdemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("enter your input");
        Scanner scanner=new Scanner(System.in);
        ExecutorService executorService=Executors.newFixedThreadPool(4);
        while (true){
            String data=scanner.nextLine();
            if(data.equalsIgnoreCase("exit")){
                System.exit(0);
            }
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println("This is your input " + data+ " with thread name"+ Thread.currentThread().getName());
                }
            });


        }
    }
}
