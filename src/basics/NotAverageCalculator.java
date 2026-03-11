package basics;

import java.util.Scanner;

/**
 * NotAverageCalculator.java
 *
 * Bu program kullanıcıdan 6 dersin notlarını alır,
 * ortalamayı hesaplar ve ternary operator ile
 * öğrencinin sınıfı geçip geçmediğini ekrana yazdırır.
 *
 * Ödev: Ternary Operator kullanılarak sınıfı geçme durumu gösterilecek.
 */

public class NotAverageCalculator {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        // Toplam ve ortalama hesaplama
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);

        // Ternary operator ile sınıfı geçme durumunu belirleme
        String str = (sonuc > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        // Sonucu ekrana yazdırma
        System.out.println(str);

    }


}
