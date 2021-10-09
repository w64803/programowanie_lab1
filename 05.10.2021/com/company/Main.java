package com.company;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Wiek : " + wiek());
        System.out.println("Imie : " + imie());

        //losowanie liczb
        Random rand = new Random();
        int Liczba1 = rand.nextInt(11);
        int Liczba2 = rand.nextInt(11);
        int Liczba3 = rand.nextInt(11);

        kalkulator(Liczba1, Liczba2);

        System.out.println("Licaba " + Liczba1 +" jest parzysta : " + czyParzysta(Liczba1));
        System.out.println("Licaba " + Liczba2 +" jest podzielna przez 3 i przez 5 : " + czyPodzielnePrzez3i5(Liczba2));
        System.out.println("Licaba " + Liczba3 + " do potegi 3 = " + doSzescianu(Liczba3));
        System.out.println("Pierwiastek z " + Liczba1 + " = " + pierwiastek(Liczba1));

        //zadanie 8

        System.out.println("Podaj przedział od : ");
        b = input.nextInt();
        input.nextLine();
        System.out.println("Podaj przedział do : ");
        a = input.nextInt();
        input.nextLine();
        a = a-b;
        int Liczba4 = rand.nextInt(a+1)+b;
        int Liczba5 = rand.nextInt(a+1)+b;
        int Liczba6 = rand.nextInt(a+1)+b;
        System.out.println("Mozna zbudować trojkat z bokow o długościach : " + Liczba4 + " " + Liczba5 + " " + Liczba6 + " : " + moznaZbudowacTrojkat(Liczba4,Liczba5,Liczba6));
    }

    public static int wiek(){
        return 12;
    }
    public static String imie(){
        return "Artur";
    }

    public static void kalkulator(int Liczba1, int Liczba2){
        System.out.println("Suma 2 losowych liczb : " + (Liczba1 + Liczba2));
        System.out.println("Roznica 2 losowych liczb : " + (Liczba1 - Liczba2));
        if(Liczba2!=0)
            System.out.println("Iloczyn 2 losowych liczb : " + (Liczba1/Liczba2));
        System.out.println("Iloraz 2 losowych liczb : " + (Liczba1 * Liczba2));
    }

    public static boolean czyParzysta(int Liczba1){
        if(Liczba1 % 2 == 0)
            return true;
        return false;
    }

    public static boolean czyPodzielnePrzez3i5(int Liczba2){
        if((Liczba2 % 3 == 0) && (Liczba2 % 5 == 0))
            return true;
        return false;
    }

    public static int doSzescianu(int Liczba1){
        return (int)(Math.pow(Liczba1, 3));
    }

    public static double pierwiastek(int Liczba1){
        return Math.sqrt(Liczba1);
    }

    //zadanie 8

    public static boolean moznaZbudowacTrojkat(int Liczba4, int Liczba5, int Liczba6){
        if(Liczba4 < Liczba5 + Liczba6 && Liczba5 < Liczba4 + Liczba6 && Liczba6 < Liczba4 + Liczba5)
            return true;
        return false;
    }
}

