package soru7;

public class Soru7 {

    public static double polinomDegeriHesapla(double[] katsayilar, double x) 
    {
        double sonuc=0;
        
        int i=0;
        while(i<katsayilar.length)
        {
            sonuc=sonuc+(katsayilar[i]* Math.pow(x, i));
            i=i+1;
        }
        return sonuc;
    }
    
    public static void main(String[] args){
        double[] dizi={0.0, 0.0, 5.0, 9.3, 7.0};
        double deger=-13;
        System.err.println(polinomDegeriHesapla(dizi, deger));
        
    }
    
}
