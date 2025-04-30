package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
 public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String nome = input.nextLine();
    String cognome = input.nextLine();
    String colore = input.nextLine();
    int giorno = input.nextInt();
    int mese = input.nextInt();
    int anno = input.nextInt();

    int data = giorno + mese + anno; 
    String password = nome + "-" + cognome + "-" + colore + "-" + data;
    System.out.println("La tua password è " + password.toLowerCase());
 }
}
