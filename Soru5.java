package soru5;
import java.util.Scanner;


public class Soru5 {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen 100 ile 500 arasında bir değer giriniz");
        int sayi=klavye.nextInt();
        while(sayi<100 || sayi>500)
        {
            System.err.println("Lütfen belirtilen koşullara uygun giriş yapınız");
            System.err.println("Lütfen 100 ile 500 arasında bir değer giriniz");
            sayi=klavye.nextInt();
        }
        
        int saat=sayi/60;
        int dakika=sayi%60;
        
        saat=saat+8;
        dakika=dakika+30;
        
        if(dakika>60)
        {
            saat=saat+(dakika/60);
            dakika=dakika%60;
        }
        System.err.println("Sınavın başlangıç saati 8:30'dur "+sayi+" dk sonra saat "+saat+":"+dakika+" olacaktir");
    }
    
}
