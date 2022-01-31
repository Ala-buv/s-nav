
package soru2;
import java.util.Scanner;

public class Soru2{
    public static void main(String[] args) {
        
        Scanner klavye=new Scanner(System.in);
        System.out.println("Boyunuzu cm olarak giriniz");
        int boy=klavye.nextInt();
        System.out.println("Boyunuzu kg olarak giriniz");
        int kilo=klavye.nextInt();
        double oran=boy/kilo;
        
        if(oran<2)
            System.err.println("şişman");
        else if(oran>2.0 && oran<=2.5)
            System.err.println("Normal");
        else
            System.err.println("Zayıf");
    }
}