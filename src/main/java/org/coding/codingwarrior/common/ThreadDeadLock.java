package org.coding.codingwarrior.common;

/**
 * @author nageshasriramappa
 **/
public class ThreadDeadLock {
    public static void main(String[] args) throws InterruptedException {

        AccountBalance account1 = new AccountBalance();
        AccountBalance account2 = new AccountBalance();

        Thread t1 = new Thread(() -> {
           synchronized (account1) {
               account1.changeBalance();
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   System.out.println(e.getMessage());
               }
               synchronized (account2) {
                   account2.changeBalance();
                   try {
                       Thread.sleep(3000);
                   } catch (InterruptedException e) {
                       System.out.println(e.getMessage());
                   }
               }
           }
        });

        Thread t2 = new Thread(() -> {
           synchronized (account2) {
               account2.changeBalance();
               try {
                   Thread.sleep(3000);
               } catch (InterruptedException e) {
                   System.out.println(e.getMessage());
               }
               synchronized (account1) {
                   account1.changeBalance();
                   try {
                       Thread.sleep(3000);
                   } catch (InterruptedException e) {
                       System.out.println(e.getMessage());
                   }
               }
           }
        });

        t1.start();
        t2.start();

        Thread.sleep(5000);

        System.out.println("T1:" + t1.getState());
        System.out.println("T2:" + t2.getState());
    }

}

class AccountBalance {

    public void changeBalance() {
        System.out.println("Changing Balance.");
    }
}