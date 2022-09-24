import java.util.Scanner;

public class infinity_input {
    public static void main(String args[]){
       int n =2;
        System.out.println("enter no only");
        Scanner scanner=new Scanner(System.in);

        while (n>0){
            n =scanner.nextInt();
            System.out.println("again enter");
          n++;
        }
    }
}
