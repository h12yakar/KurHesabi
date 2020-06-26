import java.io.IOException;
import java.util.Scanner;

public class BankaHesabi {
    public static void main(String[] args) throws IOException {
        MüşteriVerileri müşteriVerileri = new MüşteriVerileri();
        for (;;) {
            Scanner scan = new Scanner(System.in);
            String musteriAdi, musteriSoyadi;
            String musteriId;

            System.out.println("Müşteri Adı: ");
            musteriAdi = scan.next();
            System.out.println("Müşteri Soyadı: ");
            musteriSoyadi = scan.next();
            System.out.println("Müşteri ID: ");
            musteriId = scan.next();


            if (müşteriVerileri.müşteriMevcutMu(musteriId, musteriAdi, musteriSoyadi)[0].equals("1")) {
                String musteriIndisi = müşteriVerileri.müşteriMevcutMu(musteriId, musteriAdi, musteriSoyadi)[1];

                System.out.println("Euro hesabınız için 1,Dolar hesabınız için 2, Türk Lirası hesabınız için 3, altın hesabınız için 4 giriniz");
                int tercih = scan.nextInt();
                switch (tercih) {
                    case 1:
                        Euro e = new Euro();
                        e.yazdir(musteriIndisi);
                        System.out.println("Çıkış yapmak için 1, tekrar işlem yapmak için 2 giriniz...");
                        int cıkısEuro = scan.nextInt();
                        if (cıkısEuro == 1){
                            System.out.println("Tekrar bekleriz..");
                            System.exit(5);
                        }
                        break;
                    case 2:
                        Dolar d = new Dolar();
                        d.yazdir(musteriIndisi);
                        System.out.println("Çıkış yapmak için 1, tekrar işlem yapmak için 2 giriniz...");
                        int cıkısDolar = scan.nextInt();
                        if (cıkısDolar == 1){
                            System.out.println("Tekrar bekleriz..");
                            System.exit(6);
                        }
                        break;
                    case 3:
                        TL l = new TL();
                        l.yazdir(musteriIndisi);
                        System.out.println("Çıkış yapmak için 1, tekrar işlem yapmak için 2 giriniz...");
                        int cıkıstl = scan.nextInt();
                        if (cıkıstl == 1){
                            System.out.println("Tekrar bekleriz..");
                            System.exit(7);
                        }
                        break;
                    case 4:
                        Altin a = new Altin();
                        a.yazdir(musteriIndisi);
                        System.out.println("Çıkış yapmak için 1, tekrar işlem yapmak için 2 giriniz...");
                        int cıkısaltın = scan.nextInt();
                        if (cıkısaltın == 1){
                            System.out.println("Tekrar bekleriz..");
                            System.exit(9);
                        }
                        break;

                }
            } else {
                System.out.println("Hatalı yada eksik bilgi girişi tekrar yönlendiriliyorsunuz");
            }
        }
    }
}