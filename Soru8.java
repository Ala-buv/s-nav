package soru8;
import java.util.Scanner;

public class Soru8 {
    
    public static int okek(int x, int y){
        int okek=0;
        for(int i=1; i<=x*y; i++){
            if(i%x==0 && i%y==0){
                okek=i;
                break;
            }
        }
        return okek;
    }
   
    public static void main(String[] args) {
        int x, y;
        System.out.print("Birinci sayıyı giriniz: ");
        Scanner oku=new Scanner(System.in);
        x=oku.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        y=oku.nextInt();
        System.out.println("Okek: "+okek(x,y));
    }
    
}
