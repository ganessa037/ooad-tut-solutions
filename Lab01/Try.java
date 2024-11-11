import java.util.*;
// 5 rows and 5 columns
// public class Try{
//     public static void main (String[] args ){

//         for(int row=1; row<=5; row++){
//             for(int col=1; col<=5; col++){
//                 if(row==1 || row==5 || col==1 || col==5){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

public class Try{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int size;

        do{
            System.out.print("Enter an integer between 1 and 20: ");
            size = input.nextInt();

            if( size < 1 || size > 20){
                System.out.println("Number not between 1 and 20. Exiting.");
                return;
            }
    
            for(int row=1; row<=size; row++){
                for(int col=1; col<=size; col++){
                    if(row==1 || row==size|| col == 1 || col == size){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } while (size >= 1 && size <= 20);
    }
}


