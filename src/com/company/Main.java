package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double  armut,elma,domates,muz,patlıcan,toplam;
        double  armuttotal,elmatotal,domatestotal,muztotal,patlıcantotal;
        System.out.print("Armut Kaç Kilo ? :");
        armut=input.nextDouble();
        System.out.print("Elma Kaç Kilo ? :");
        elma=input.nextDouble();
        System.out.print("Domates Kaç Kilo ? :");
        domates=input.nextDouble();
        System.out.print("Muz Kaç Kilo ? :");
        muz=input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo");
        patlıcan=input.nextDouble();
        elmatotal=elma*3.67; armuttotal=armut*2.14; domatestotal=domates* 1.11; muztotal=muz*0.95; patlıcantotal=patlıcan*5.00;


        toplam = (elmatotal + muztotal +  armuttotal + domatestotal+ patlıcantotal);
        System.out.println("TOPLAM TUTAR : "+ toplam + " TL");






    }
}
