
package finalproject;

import static finalproject.ParkingLot.*;


public class Bike implements Vehicle {
    public int bike(){
         
         System.out.println("\t1. PARK BIKE \n\t2. EXIT PARKING\n\t3. BACK");
         answer = scan.nextInt();
         
         while(answer != 3){
             if(answer==1){
                countBike++;
                System.out.println("Count: "+countBike);
                if(countBike<3){
                    
                    location[0][countBike+3]="b\t"; //single output
                }
                    else if(countBike>2 && countBike<5){
                        
                        location[1][countBike+1]="b\t";
                    }
                    else if(countBike>4 && countBike<7){
                        
                        location[2][countBike-1]="b\t";
                    }
                    else if(countBike>6 && countBike<9){

                         location[3][countBike-3]="b\t";
                    }
                    else if(countBike>8 && countBike<11){

                         location[4][countBike-5]="b\t";
                    }
                    else if(countBike>10 && countBike<13){

                         location[5][countBike-7]="b\t";
                    }
                    else if(countBike>13){
                        System.out.println("Sorry, Parking Lot Is Full!");
                    }
                System.out.println("\nYour Bike Parked At b"+countBike+"\n");
//               if(countBike<13){
//                    for(int i=0; i<6; i++){
//                        for(int j=4; j<6; j++ ){
//                          
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
                    countBike--;
//                    System.out.println("Count: "+countBike);
//                    System.out.println("You want to exit");
                    
                    if(countBike<2 && countBike>0){
                        location[0][countBike+4]="0\t"; 
                    }

                        else if(countBike<4 && countBike>1){

                            location[1][countBike+2]="0\t"; 
                        }
                        else if(countBike<6 && countBike>3){

                            location[2][countBike]="0\t"; 
                        }
                        else if(countBike<8 && countBike>5){

                            location[3][countBike-2]="0\t"; 
                        }
                        else if(countBike<10 && countBike>7){

                            location[4][countBike-4]="0\t"; 
                        }
                        else if(countBike<12 && countBike>9){

                            location[5][countBike-6]="0\t"; 
                        }
                        else if(countBike<1){
                            System.out.println("No Bike To Exit");
                            countBike++;
                        }
                    System.out.println("\nYour Bike Exited Parking Lot\nThanks For Coming...\n\n");
//                    if(countBike<13 && countBike>=0){
//                        for(int i=0; i<4; i++){
//                            for(int j=4; j<6; j++ ){
//                           
//                            System.out.print(location[i][j]+" ");
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
    public int car() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public static void bikeShow(){

            for(int i=0; i<4; i++){
                for(int j=4; j<6; j++ ){
                           
                            System.out.print(location[i][j]+" ");
                }
                System.out.println("\n");
            }
            System.out.println("\n\n\nb = BIKE\n\nTotal Bike Parked  : "+countBike);
    


}
    
}
