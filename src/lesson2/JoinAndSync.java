/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bbiadmin
 */
public class JoinAndSync {

    private static int count = 0;

    private static synchronized void incCount() {
        count++;
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    incCount();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(JoinAndSync.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000000; i++) {
                    incCount();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(JoinAndSync.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(JoinAndSync.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Count is "+count);
    }
}
