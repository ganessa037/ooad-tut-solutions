//  The while loop:
// public class Test {
//     public static void main(String args[]){
//        int x=10;
 
//        while( x < 20 ){
//           System.out.print("value of x : " + x );
//           x++;
//           System.out.print("\n");
//        }
//     }
//  }

//  The do-while loop:
// public class Test{
//     public static void main(String args[]){
//         int x = 0;

//         do{
//             System.out.println("value of x : " + x );
//             x++;
//         }while (x < 20);
//     }
// }


//Enhanced for loop in Java:
// public class Test {
//    public static void main(String args[]){
//       int [] numbers = {10, 20, 30, 40, 50};

//       for(int x : numbers ){
//          System.out.print( x + ",," );
//       }
//       System.out.print("\n");
//       String [] names ={"James", "Larry", "Tom", "Lacy"};
//       for( String name : names ) {
//          System.out.print( name );
//          System.out.print(",");
//       }
//    }
// }

// The for loop:
// public class Test {
//     public static void main(String args[]){
//        for(int x = 0; x < 10; x = x+1){
//           System.out.print("value of x : " + x );
//           System.out.print("\n");
//        }
//     }
//  }


//The break keyword:
// public class Test {
//    public static void main(String args[]){
//       int [] numbers = {10, 20, 30, 40, 50};

//       for(int x : numbers ){
//          if( x == 30 ){
// 	    break;
//          }
//          System.out.print( x );
//          System.out.print("\n");
//       }
//    }
// }

//The if statement:
// public class Test {
//    public static void main(String args[]){
//       int x = 10;
//       if( x < 20 ){
//          System.out.print("This is if statement");
//       }
//    }
// }

//The if...else statement:
// public class Test {
//    public static void main(String args[]){
//       int x = 90;

//       if( x == 10 ){
//          System.out.print("Value of X is 10");
//       }else if( x == 20 ){
//          System.out.print("Value of X is 20");
//       }else if( x == 30 ){
//          System.out.print("Value of X is 30");
//       }else{
//          System.out.print("This is else statement");
//       }
//    }
// }

//The switch-case statement:
// public class Test {
//    public static void main(String args[]){
//     char grade = 'B';
//     if (args.length > 0) {
//        grade = args[0].charAt(0);
//     }

//       switch(grade)
//       {
//       case 'A' :
//          System.out.println("Excellent!"); 
//          break;
//       case 'B' :
//       case 'C' :
//          System.out.println("Well done");
//          break;
//       case 'D' :
//          System.out.println("You passed");
//       case 'F' :
//          System.out.println("Better try again");
//          break;
//       default :
//          System.out.println("Invalid grade");
//       }
//       System.out.println("Your grade is " + grade);
//    }
// }