package soru4;
import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Pay değerini giriniz:");
        int pay=klavye.nextInt();
        System.out.println("Payda değerini giriniz:");
        int payda=klavye.nextInt();
        double oran=pay/payda;
        
        if(pay<payda)
            System.err.println("Basit Kesir girdiniz");
        else if(pay==payda)
                System.err.println("Bir tam sayı girdiniz");
        else
        {
            int x=pay/payda;
            int y=pay%payda;
            System.err.println("birleşik bir kesir girdiniz...");
            System.err.println("kesir değeri= "+x+" tam "+y+"/"+payda);
        }
    }
    
}
