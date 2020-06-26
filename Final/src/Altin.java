import java.io.IOException;

public class Altin {
    private int gram;
    private int birimFiyat = 400 ;
    private int tutar;

   public int getGram(String musteriIndisi) throws IOException {
        MüşteriVerileri müşteriVerileri = new MüşteriVerileri();
        int musteriİndisi= Integer.parseInt(musteriIndisi);
        gram = Integer.parseInt(müşteriVerileri.müşteriVerileri()[musteriİndisi][5]);
       return gram;
   }
   public int tutarHesapla(){
        int tlTutarı = birimFiyat * gram;
        return tlTutarı;
   }

   public void yazdir(String musteriIndis) throws IOException {
       System.out.println("Hesabınızdaki altın gram miktarı : " + getGram(musteriIndis));
       System.out.println("Hesabınızdaki altın gramının tl değeri : " + tutarHesapla());
   }

}
