/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnthreads;

/**
 *
 * @author bbiadmin
 */
class MyClass extends Thread {

    @Override
    public void run() {
        System.out.println("Inside Thread class example");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() + " Number is " + (i + 1));
        }
    }

}

public class LearnThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyClass m1 = new MyClass();
        MyClass m2 = new MyClass();
        Thread t1 = new Thread(new ThreadUsingRunnable());
        Thread t2 = new Thread(new ThreadUsingRunnable());
        m1.start();
        m2.start();
        t1.start();
        t2.start();
    }

}
