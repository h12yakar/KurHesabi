import java.io.IOException;

public class Euro {
    private int miktar;
    private int kur = 8;
    private int tlTutarı;

    public int getMiktarEuro(String musteriIndis) throws IOException {
        MüşteriVerileri müşteriVerileri = new MüşteriVerileri();
        müşteriVerileri.müşteriVerileri();
        int müşteriİndisi= Integer.parseInt(musteriIndis);
        miktar = Integer.parseInt(müşteriVerileri.müşteriVerileri()[müşteriİndisi][3]);
        return miktar;
    }


    public int getKur() {
        return kur;
    }

    public int getTutar() {
         tlTutarı = miktar*getKur();
        return tlTutarı;
    }

    public void yazdir(String musteriIndis) throws IOException {
        System.out.println("Euro hesabınızda bulunan toplam Euro bakiyesi : " + getMiktarEuro(musteriIndis));
        System.out.println("Euro hesabınızda bulunan Euroların TL tutarı : " + getTutar());
    }
}
