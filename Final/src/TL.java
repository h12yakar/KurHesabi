import java.io.IOException;

public class TL {
    private int bakiye;

    public int getBakiye(String musteriIndis) throws IOException {
        MüşteriVerileri müşteriVerileri = new MüşteriVerileri();
        müşteriVerileri.müşteriVerileri();
        int müşteriİndisi= Integer.parseInt(musteriIndis);
        bakiye = Integer.parseInt(müşteriVerileri.müşteriVerileri()[müşteriİndisi][6]);
        return bakiye;
    }

    public void yazdir(String musteriIndisi) throws IOException {
        System.out.println("Hesabınızdaki tl tutarı : "  + getBakiye(musteriIndisi));
    }
}
