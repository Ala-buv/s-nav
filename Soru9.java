package soru9;
import java.util.Scanner;

public class Soru9 
{

    public static void main(String[] args) 
    {
        System.out.println("x değerini giriniz");
        Scanner klavye=new Scanner(System.in);
        int x=klavye.nextInt();
        
        int toplam=0;
        for(int i=0; i<=x;i++)
        {
            toplam=toplam+(i*i);
        }
        String seri="";
        for(int j=0;j<=x;j++)
        {
           seri=seri+" + "+j+"^2"; 
        }
        System.out.println(seri.substring(3)+" serisi için sonuç: "+toplam);
    }           
                
    
    
}
