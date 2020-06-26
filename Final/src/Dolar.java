import java.io.IOException;

public class Dolar {
    private int miktar;
    private int kur = 7;
    private int tutar;


    public int getMiktar(String musteriIndisi) throws IOException {
        MüşteriVerileri müşteriVerileri = new MüşteriVerileri();
        int musteriİndisi= Integer.parseInt(musteriIndisi);
        miktar = Integer.parseInt(müşteriVerileri.müşteriVerileri()[musteriİndisi][4]);
        return miktar;
    }

    public int getKur() {
        return kur;
    }

    public int getTlTutar() {
        tutar = miktar*kur;
        return tutar;
    }

    public void yazdir(String musteriIndisi) throws IOException {
        System.out.println("Hesabınızdaki Dolar tutarı : " + getMiktar(musteriIndisi));
        System.out.println("Hesabınızdaki Doların Tl miktarı : " + getTlTutar());

    }
}
