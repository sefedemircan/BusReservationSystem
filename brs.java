package javaapplication13;

import java.util.Scanner;

public class JavaApplication13 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String depart;
        String going;
        String Istanbul,Sakarya,Ankara,Antalya,Isparta;
        
        int price=0;
        int day;
        String month;
        int year;
        
        String TL = "TL";
        
        
        
        System.out.println("---Bus Reservation---");
        
        System.out.print("From: ");
        depart=scan.next();
        
        System.out.print("To: ");
        going=scan.next();
        
        System.out.print("Day: ");
        day=scan.nextInt();
        if(day<=0 || day>31){
            System.out.println("Please enter a valid day!");
            System.exit(0);
        }
        
        System.out.print("Month: ");
        month=scan.next();
        if(month.equals("January")|| month.equals("February")|| month.equals("March")|| month.equals("April")|| month.equals("May")|| month.equals("June")|| month.equals("July")||month.equals("August")||month.equals("September")||month.equals("October")||month.equals("November")||month.equals("December")){
            System.out.print("");
        }
        else{
            System.out.println("Please enter a valid month!");
            System.exit(0);
        }
        
        System.out.print("Year: ");
        year=scan.nextInt();
        if(year<2022){
            System.out.println("Please enter a valid year!");
            System.exit(0);
        }
        
        System.out.println("Date: "+day +month +year);
        
       
        
        if(depart.equals("Sakarya")&& going.equals("Isparta")||depart.equals("Isparta")&& going.equals("Sakarya") ){
            price=240;
            System.out.println(depart+" to "+going);
            System.out.println("Price: "+price+TL);
        }
        
        else if(depart.equals("Istanbul")&& going.equals("Isparta")|| depart.equals("Isparta")&& going.equals("İstanbul")){
            price=350;
            System.out.println(depart+" to "+going);
            System.out.println("Price: "+price+TL);
        }
        else if(depart.equals("Ankara")&& going.equals("Isparta")|| depart.equals("Isparta")&& going.equals("Ankara")){
            price=240;
            System.out.println(depart+" to "+going);
            System.out.println("Price: "+price+TL);
        }
        else if(depart.equals("Antalya")&& going.equals("Isparta")|| depart.equals("Isparta")&& going.equals("Antalya")){
            price=100;
            System.out.println(depart+" to "+going);
            System.out.println("Price: "+price+TL);
        }
        
        
        
        else if(depart.equals("Sakarya")&& going.equals("Ankara")|| depart.equals("Ankara")&& going.equals("Sakarya")){
            price=250;
            System.out.println(depart+" to "+going);
            System.out.println("Price: "+price+TL);
        }else if(depart.equals("Sakarya")&& going.equals("Istanbul")|| depart.equals("Istanbul")&& going.equals("Sakarya")){
            price=200;
            System.out.println(depart+" to "+going);
            System.out.println("Price: "+price+TL);
        }else if(depart.equals("Sakarya")&& going.equals("Antalya")|| depart.equals("Antalya")&& going.equals("Sakarya")){
            price=350;
            System.out.println(depart+" to "+going);
            System.out.println("Price: "+price+TL);
        }
        
        
        
        else if(depart.equals("Istanbul")&& going.equals("Ankara")|| depart.equals("Ankara")&& going.equals("Istanbul")){
            price=300;
            System.out.println(depart+" to "+going);
            System.out.println("Price: "+price+TL);
        }
        else if(depart.equals("Istanbul")&& going.equals("Antalya")|| depart.equals("Antalya")&& going.equals("Istanbul")){
            price=450;
            System.out.println(depart+" to "+going);
            System.out.println("Price: "+price+TL);
        }
        
        
        else if(depart.equals("Ankara")&& going.equals("Antalya")|| depart.equals("Antalya")&& going.equals("Ankara")){
            price=450;
            System.out.println(depart+" to "+going);
            System.out.println("Price: "+price+TL);
        }
        else{
            System.out.println("ERROR!");
            System.exit(0);
        }
        
    }
    
}
