import java.util.Scanner;
public class serisi {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Bir sayı giriniz:");
        int number=input.nextInt();

        //fibonacci dizinin ilk iki terimi = 0 ve 1

        int n1=0,n2=1;
        int total;
        System.out.println(number + " sayısının fibonacci dizisi");


        for (int i =1; i<=number; i++ ){
            System.out.print(n1 + " , ");

            total= n1+n2;
            n1=n2;
            n2=total;

        }

    }
}
