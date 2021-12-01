
package finalproject;

import static finalproject.ParkingLot.*;

public class Bus implements Vehicle{
    public int bus(){
         
        System.out.println("\t1. PARK BUS \n\t2. EXIT PARKING\n\t3. BACK");
         answer = scan.nextInt();
         
         while(answer != 3){
             if(answer==1){
                countBus++;
                //System.out.println("Count: "+countBus);
                if(countBus<5){
                    location[0][countBus-1]="B"+countBus+"\t"; //single output
                }
                    else if(countBus>4 && countBus<9){
                         location[1][countBus-5]="B"+countBus+"\t";
                    }
                    else if(countBus>8 && countBus<13){
                         location[2][countBus-9]="B"+countBus+"\t";
                    }
                    else if(countBus>12 && countBus<17){
                         location[3][countBus-13]="B"+countBus+"\t";
                    }
                    else if(countBus>16){
                        System.out.println("Sorry, Parking Lot Is Full!");
                    }
                 System.out.println("\nYour Bus Parked At B"+countBus+"\n");
                
                
//               if(countBus<17 && countBus>=0){
//                    for(int i=0; i<4; i++){
//                        for(int j=0; j<4; j++ ){
//                            //location[0][j]="B";
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
                    countBus--;
                    //System.out.println("Count: "+countBus);
                    //System.out.println("You want to exit");
                    
                    if(countBus<4 && countBus>=0){
                    location[0][countBus]="0 \t"; 
                    }
                    
                    else if(countBus<8 && countBus>3){

                    location[1][countBus-4]="0 \t"; 
                    }
                    else if(countBus<12 && countBus>7){

                    location[2][countBus-8]="0 \t"; 
                    }
                    else if(countBus<16 && countBus>11){

                    location[3][countBus-12]="0 \t"; 
                    }
                    else if(countBus<0){
                        System.out.println("No Bus To Exit\n");
                        countBus++;
                        
                    }
                    System.out.println("\nYour Bus Exited Parking Lot\nThanks For Coming...\n\n");
//                    if(countBus<17 && countBus>=0){
//                    for(int i=0; i<4; i++){
//                        for(int j=0; j<4; j++ ){
//                           System.out.print(location[i][j]+" ");
//                        }
//                        System.out.println("\n");
//
//
//                    }
//                }
                break;
                    
            }
         }
         if(answer==3){
//             System.out.println("-----BIDAY PITIBI-----");
         }

         return 0;
    }

    @Override
    public int car() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int bike() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void busShow(){
             for(int i=0; i<4; i++){
                        for(int j=0; j<4; j++ ){
                            //location[0][j]="B";
                           System.out.print(location[i][j]+" ");
                        }
                        System.out.println("\n");


                    }
             System.out.println("\n\n\nB = BUS\n\nTotal Bus Parked  : "+countBus);
    
    }

}
