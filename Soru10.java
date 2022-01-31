package soru10;


public class Soru10 {
    static int Degis(int[] dizi, int pozisyon)
    {
        int sonuc=dizi[pozisyon];
        dizi[pozisyon]=-1;
        return sonuc;
    }
   
    public static void main(String[] args) {
       int[] veri={6,21,17,64,97,102,197};
       System.out.println("Değiştirilen eleman: "+Degis(veri,5));
    }
    
}
