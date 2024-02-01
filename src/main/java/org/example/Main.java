package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast webside med http://");
        String k = sc.nextLine();
        System.out.println("Indtast filnavn");
        String w = sc.nextLine();

        EbReadWrite ebReadWrite = new EbReadWrite();
        ebReadWrite.readWrite(k, w);
    }

}