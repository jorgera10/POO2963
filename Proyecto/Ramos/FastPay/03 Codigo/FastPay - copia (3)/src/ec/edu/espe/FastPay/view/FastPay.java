//package ec.edu.espe.FastPay.view;
//
//import ec.edu.espe.FastPay.controller.Entry;
//import java.util.Scanner;
//
//public class FastPay {
//    public static void main(String[] args) {
//        
//        Menu();
//        
//    }
//        public static void Menu(){
//        
//            Entry entry = new Entry();
//
//            Scanner enter = new Scanner(System.in);
//
//            int option;
//            char respuesta;
//
//            do{
//                System.out.println("1. Enter");
//                System.out.println("2. Modify");
//                System.out.println("3. Delete");
//                System.out.println("4. See");
//                System.out.println("5. Exit");
//
//                System.out.println("Please input an option: ");
//                option = enter.nextInt();
//                switch(option){
//                    case 1:
//                        entry.enter();
//                        break;
//                    case 2: 
//                        //modify
//                        break;
//                    case 3:
//                        //Delete
//                        break;
//                    case 4:
//                        //see
//                        break;
//                    case 5: 
//                        System.out.println("Thanks for use our system\n");
//                        System.out.println("Bye :)");
//                        break;
//                    default:
//                        System.out.println("Invalid option, input again");
//                        break;
//                }
//            }while(option !=5);
//        }
//    }
//
