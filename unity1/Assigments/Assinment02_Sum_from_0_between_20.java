import java.util.Scanner;

public class Sum_from_0_between_20 {

    public static void main(String [] args){
        Scanner Enter = new Scanner(System.in);

        int suma = 0;
        int number = 0;

        System.out.print("Enter a number less than 20: ");
        number = Enter.nextInt();

        if(number <20){
            for(int i=0; i<=number; i++){
            suma += i;
            }
            System.out.println("The sum is: "+suma);
        }else{
            System.out.println("Wrong number");
        }

    }

}
