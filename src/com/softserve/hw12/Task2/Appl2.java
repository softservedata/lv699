package com.softserve.hw12.Task2;

public class Appl2 {
   /* Cause a deadlock. Organize the expectations of ending a thread in main(),
    and make the end of the method main() in this thread.
   */
   public static void main(String[] args) throws InterruptedException {

deadlock();

   }
   private static void deadlock () throws InterruptedException {
      String firstResource = "first";
      String secondResource = "second";
Thread first = new Thread() {
   public void run() {
synchronized (firstResource) {
   System.out.println("FirstResorce is locked");
   try {
      Thread.sleep(200);
   } catch (InterruptedException e) {
      throw new RuntimeException(e);
   }
   synchronized (secondResource) {
      System.out.println("SecondResorce is locked");
   }
}
   }
};
Thread second = new Thread(){
   public void run(){
      synchronized (secondResource){
         System.out.println("SecondResorce is locked");
         try {
            Thread.sleep(50);
         } catch (InterruptedException e) {
            throw new RuntimeException(e);
         }
         synchronized (firstResource) {
            System.out.println("FirstResorce is locked");
         }
      }
   }
};
first.start();
second.start();

first.join();
second.join();
   }
}
