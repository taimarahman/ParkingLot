
package finalproject;

import static finalproject.ParkingLot.*;

public class Car implements Vehicle {
    public int car(){

         
         System.out.println("\t1. PARK CAR \n\t2. EXIT PARKING\n\t3. BACK");
         answer = scan.nextInt();
         
         while(answer != 3){
             if(answer==1){
                countCar++;
                //System.out.println("Count: "+countCar);
                if(countCar<7){
                    location[4][countCar-1]="C"+countCar+"\t"; //single output
                }
                    else if(countCar>6 && countCar<13){
                         location[5][countCar-7]="C"+countCar+"\t";
                    }
                    else if(countCar>12){
                        System.out.println("Sorry, Parking Lot Is Full!");
                    }
                 System.out.println("\nYour Car Parked At C"+countCar+"\n");
//               if(countCar<13){
//                    for(int i=4; i<6; i++){
//                        for(int j=0; j<6; j++ ){
//                           System.out.print(location[i][j]+" ");
//                        }
//                        System.out.println("\n");
//
//
//                    }
//                }
               break;
            }

                if(answer==2){
                    countCar--;
//                    System.out.println("Count: "+countCar);
//                    System.out.println("You want to exit");
                    
                    if(countCar<6 && countCar>=0){

                        location[4][countCar]="0 \t"; 
                    }

                        else if(countCar<12 && countCar>5){

                        location[5][countCar-6]="0 \t"; 
                        }

                        else if(countCar<0){
                            System.out.println("No Car To Exit");
                            countCar++;
                        }
                    System.out.println("\nYour Car Exited Parking Lot\nThanks For Coming...\n\n");
//                    if(countCar<13 && countCar>=0){
//                        for(int i=4; i<6; i++){
//                            for(int j=0; j<6; j++ ){
//        
//                                System.out.print(location[i][j]+" ");
//                            }
//                            System.out.println("\n");
//
//
//                        }
//                    }
                    break;
                    
            }
         }
         if(answer==3){
//             System.out.println("-----BIDAY PITIBI-----");
         }

         return 0;
    }

    @Override
    public int bus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int bike() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        public static void carShow(){
    
                     for(int i=4; i<6; i++){
                        for(int j=0; j<6; j++ ){
                           System.out.print(location[i][j]+" ");
                        }
                        System.out.println("\n");


                    }
                          System.out.println("\n\n\nC = CAR\n\nTotal Car Parked  : "+countCar);
    
    
    }
    
}
