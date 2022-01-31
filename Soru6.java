package soru6;
import java.util.Scanner;


public class Soru6 {

    
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen 1 ile 365 arasında bir değer giriniz");
        int sayi=klavye.nextInt();
        while(sayi<0 || sayi>365)
        {
            System.err.println("Lütfen belirtilen koşullara uygun giriş yapınız");
            System.err.println("Lütfen 1 ile 365 arasında bir değer giriniz");
            sayi=klavye.nextInt();
            
        }
        
        String yaz="";
        int gun=sayi%7;
        if(gun==0)
            yaz="Cumartesi";
        else if(gun==1)
            yaz="Pazar";
        else if(gun==2)
            yaz="Pazartesi";
        else if(gun==3)
            yaz="Salı";
        else if(gun==4)
            yaz="Çarşamba";
        else if(gun==5)
            yaz="Perşembe";
        else if(gun==6)
            yaz="Cuma";
        
        System.err.println("Bugün Cumartesi "+sayi+" gün sonra haftanın "+yaz+" gundüdür");
    }
    
}
