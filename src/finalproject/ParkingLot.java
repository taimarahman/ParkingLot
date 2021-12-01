package finalproject;

import java.util.Scanner;
import java.lang.String;
import finalproject.Vehicle.*;
import finalproject.Bike.*;
import finalproject.Bus.*;
import finalproject.Car.*;
import static finalproject.Car.*;
import static finalproject.Bus.*;
import static finalproject.Bike.*;

public class ParkingLot {
    public static Scanner scan = new Scanner(System.in);
    public static Scanner scann = new Scanner(System.in);
    public static String start;
    public static String[] vehicle = {"CAR", "BUS", "BIKE","0"};
    public static String[][] location = new String[6][6];
    public static int choice;
    public static int show;
    public static int answer;
    public static int countCar=0;
    public static int countBus=0;
    public static int countBike=0;

    public static void main(String[] args) {
         Bus obj = new Bus();
        Car objj = new Car();
        Bike objjj = new Bike();
         for(int i=0; i<6; i++){        
            for(int j=0; j<6; j++){
                location[i][j]="0\t";
                //System.out.print(location[i][j]+" ");
            }
            //System.out.println("\n");
        }
         
         
        System.out.println("START?\nY/N");
        start = scan.nextLine();
        
        while(start.charAt(0)=='Y' || start.charAt(0)=='y'){
        
            System.out.println("\n  1. Use Parking Lot\n  2. Show Parking Lot\n  3. Exit\n");
            choice = scan.nextInt();
            
            if(choice==1){
            System.out.println("\nChoose Vehicle Type: \n\tCar \n\tBus \n\tBike \n\n'''To Close Program Press 0''''\n");
    
//        user input
            String userChoice;
            userChoice = scann.nextLine();
        
        if(vehicle[0].equalsIgnoreCase(userChoice)){
        
            System.out.println("Car Parking: ");
            objj.car();
        }
            else if(vehicle[1].equalsIgnoreCase(userChoice)){
        
                System.out.println("Bus Parking: ");
                obj.bus();

            } 
            else if(vehicle[2].equalsIgnoreCase(userChoice)){
        
                System.out.println("Bike Parking: ");
                objjj.bike();
            }
            else if(vehicle[3].equalsIgnoreCase(userChoice)){
        
                System.out.println("\n-----BIDAY PITIBI-----\n");
                break;
            }
        
        
    }
            else if(choice==2){

                showParking();
                
            }
            else if(choice==3){
                System.out.println("\n-----BIDAY PITIBI-----\n");
                break;
            }
            
    }
    }
    static void showParking(){
    
    
    System.out.println("\n\t1. Show Full Parking Lot\n\t2. Show Bus Parking\n\t3. Show Car PArking\n\t4. Show Bike Parking\n");
       
        show = scan.nextInt();
        
        if(show==1){
         for(int i=0; i<6; i++){
        
            for(int j=0; j<6; j++){
                //location[i][j]="0";
                System.out.print(location[i][j]+" ");}
            System.out.println("\n");
         }
                
                System.out.println("\n\nB = BUS\t\tC = CAR\t\tb = BIKE\t\t0 = Empty Slot\n");
                System.out.println("Total Bus Parked  : "+countBus);
                System.out.println("Total Car Parked  : "+countCar);
                System.out.println("Total Bike Parked : "+countBike);
        

        }
        else if(show==2){
            busShow();
        
        }
        else if(show==3){
            carShow();
        
        }
        else if(show==4){
            bikeShow();
        
        }
    
    
    }
}
