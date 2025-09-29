package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Inizio gara");

        Contatore c1 = new Contatore(10);
        c1.start();
        Contatore c2 = new Contatore(10);
        c2.start();
        Contatore c3 = new Contatore(10);
        c3.start();
        Contatore c4 = new Contatore(10);
        c4.start();
        Contatore c5 = new Contatore(10);
        c5.start();

        c1.join();
        c2.join();
        c3.join();
        c4.join();
        c5.join();
        
        //System.out.println("Ha vinto: " + v);
    }
}    