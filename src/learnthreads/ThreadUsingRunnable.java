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
public class ThreadUsingRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("This is runnable example ");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId() + " Number is " + (i + 1));
        }
    }

}
