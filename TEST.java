import java.util.Scanner;

public class TEST {
    public static void main(String[] args){
        double x;
        double Matematik,Fizik, Kimya, Turkce, Tarih, Muzik;
        String durum;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz:");
        Matematik=input.nextInt();
        System.out.println("Fizik notunuzu giriniz");
        Fizik=input.nextInt();
        System.out.println("Kimya notunuzu giriniz");
        Kimya=input.nextInt();
        System.out.println("Türkçe notunuzu giriniz");
        Turkce=input.nextInt();
        System.out.println("Tarih notunuzu giriniz");
        Tarih=input.nextInt();
        System.out.println("Muzik notunuzu giriniz");
        Muzik=input.nextInt();
        System.out.println("ortalamanız");
        System.out.println(x=(Matematik+Fizik+Kimya+Turkce+Tarih+Muzik)/6);
        durum=x>=60? " Geçtiniz" : " Kaldiniz";
        System.out.println("sonuç"+durum);
    }

}
