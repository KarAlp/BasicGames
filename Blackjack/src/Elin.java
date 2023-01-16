import java.sql.Array;

public class Elin {
    private ArrayList<kart> elin;
    private ArrayList<kart> deste;

    elin() {
        elin = new ArrayList<kart>();
        deste = new ArrayList<kart>();
    }


    public void kartcek(Kart C) {
        elin.add(c);
    }

    public void desteyeekle(Kart c) {
        hand.remove(c);
    }

    public int getElin() {
        return elin.size();
    }

    public void Karıstır(deck) {
        while (elin.size() > 0) {
            k.cikart(el.remove(0));
        }
    }

    public void karıstır() {
        elin.add(deste.get(0));
        deste.remove(0);
    }

    public int getKalankartlar() {
        return deste.size();
    }

    public void cikar(Deste k)
                    discard.add(k);
                    draw.remove(k);
                    cards.remove(k);

}
    public static int getElin(Elin k)
    {
        int i = 0;
        int deger = 0;
        int toplam = 0;
        int  as = 0;
        while (ben. elin() > i)
        {
            deger = ben.getElin(i).getRank();
            if (deger >= 9)
            {
                toplam += 10;

            }
            else if (toplam == 0)
            {
                as++;
        }
            else
            {
                toplam += deger + 1;
                            }
            i++;
    }
        if((toplam + 10 + as ) >21)
            toplam += as;
        else if (as > 0)
            toplam += 10 +as; //kartın durumu 1 veya 10 olabiliyor
        return toplam;


