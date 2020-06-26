
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MüşteriVerileri {

    public String[][] müşteriVerileri() throws IOException {
        File musteriBilgileri = new File("musteriBilgileri.txt");
        if (!musteriBilgileri.exists())
            musteriBilgileri.createNewFile();

        Scanner scannerForLineCounter = new Scanner(musteriBilgileri);
        int lineCounter = 0;
        while (scannerForLineCounter.hasNextLine()) {
            scannerForLineCounter.nextLine();
            lineCounter++;
        }

        String line = "";
        String[][] musteriBilgiİcerikleri = new String[lineCounter][8];
        Scanner scannerForInitialize = new Scanner(musteriBilgileri);
        int lineIndis = 0;
        while (scannerForInitialize.hasNextLine()) {
            line = scannerForInitialize.nextLine();
            musteriBilgiİcerikleri[lineIndis][0] = line.split(" ")[0]; //Müşteri ID
            musteriBilgiİcerikleri[lineIndis][1] = line.split(" ")[1]; //AD
            musteriBilgiİcerikleri[lineIndis][2] = line.split(" ")[2]; //SOYAD
            musteriBilgiİcerikleri[lineIndis][3] = line.split(" ")[3]; //EURO
            musteriBilgiİcerikleri[lineIndis][4] = line.split(" ")[4]; //DOLAR
            musteriBilgiİcerikleri[lineIndis][5] = line.split(" ")[5]; //ALTIN
            musteriBilgiİcerikleri[lineIndis][6] = line.split(" ")[6]; //TL
            musteriBilgiİcerikleri[lineIndis][7] = line.split(" ")[7]; //TOTAL TL
            lineIndis++;

        }
        return musteriBilgiİcerikleri;
    }

    public String[] müşteriMevcutMu (String ID, String Ad, String Soyad) throws IOException {

        String[] geriDönen = new String[2];
        geriDönen[0] = "0";

        File musteriBilgileri = new File("musteriBilgileri.txt");
        if (!musteriBilgileri.exists())
            musteriBilgileri.createNewFile();

        Scanner scannerForLineCounter = new Scanner(musteriBilgileri);
        int lineCounter = 0;
        while (scannerForLineCounter.hasNextLine()) {
            scannerForLineCounter.nextLine();
            lineCounter++;
        }

        String line = "";
        Scanner scannerForInitialize = new Scanner(musteriBilgileri);
        int lineIndis = 0;
        while (scannerForInitialize.hasNextLine()) {
            line = scannerForInitialize.nextLine();
            if ( line.split(" ")[0].equals(ID)  && line.split(" ")[1].equals(Ad) && line.split(" ")[2].equals(Soyad)){
                geriDönen[0] = "1";
                geriDönen[1] = String.valueOf(lineIndis);
            }else {
                lineIndis++;
            }
        }
        return geriDönen;
    }

}
