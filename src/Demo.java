package l2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Scanner textInput=new Scanner(System.in);

        Music m1=new Music("ehd e waafa", "The Bad","comedy",5.05,new Date(5,4,2002),new Artist("usman","pak",4.5));
        Music m2=new Music("yaarian", "today","sad",4.05,new Date(6,2,2003),new Artist("kiran","pak",5.5));
        Music m3=new Music("baarish", "The worst","comedy",2.05,new Date(5,4,2012),new Artist("alia","india",1.5));
        Music m4=new Music("hawaien", "sunrise","soft",3.05,new Date(5,7,2021),new Artist("atif","us",2.5));
        Music m5=new Music("saardi", "moon","romantic",7.05,new Date(2,3,2102),new Artist("falak","uk",3.5));

        System.out.println("Enter tittle");
        String Tittle=input.nextLine();
        System.out.println("Enter Album");
        String Album=input.nextLine();
        System.out.println("Enter gener");
        String Gener=input.nextLine();
        System.out.println("Enter Artist name");
        String Artistname=input.nextLine();
        System.out.println("Enter Artist nationality");
        String nationality= input.nextLine();
        System.out.println("Enter duration");
        double Duration= input.nextDouble();
        System.out.println("Enter rating");
        double rating=input.nextDouble();
        System.out.println("Enter date");
        int date= input.nextInt();
        System.out.println("Enter month");
        int mon= input.nextInt();
        System.out.println("Enter year");
        int year= input.nextInt();

        Music m6=new Music(Tittle,Album,Gener,Duration,new Date(date,mon,year),new Artist(Artistname,nationality,rating));
        Music list[]=new Music[6];
        list[0]=m1;
        list[1]=m2;
        list[2]=m3;
        list[3]=m4;
        list[4]=m5;
        list[5]=m6;
        int i=0;
        while(i<6){
            System.out.println(list[i]);
            i++;
        }
//
//        System.out.println(m1);
//        System.out.println(m2);
//        System.out.println(m3);
//        System.out.println(m4);
//        System.out.println(m5);
        boolean l=m1.equals(m2);
        System.out.println(l);
    }
}

