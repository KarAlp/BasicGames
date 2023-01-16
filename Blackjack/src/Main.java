import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deste k = new Deste();
        El Kurpiyer = new El();
        El ben = new El();
        Scanner input = new Scanner(System.in);

        while (true) //blackjack games starting when both players have 2 cards
        {
            k.karistir();
            Kurpiyer.kartcek(k.kartcek());
            Kurpiyer.kartcek(k.kartcek());
            ben.kartcek(k.kartcek());
            ben.karteck(k.kartcek());
        }

        while (true) {
            System.out.println(ben + "Elin:" + " " + getElin(ben));
            System.out.println("TAMAM?");
            if (input.nextLine().equalsIgnoreCase("TAMAM")) {
                ben.kartcek(k.kartcek());
                if (Elin(ben) > 21) {
                    System.out.println("Yenildin");
                    break;
                }
                continue;
            } else if (getElin(ben) >= getElin(Kurpiyer)) {
                System.out.println("Kazandın");
                break;
            } else {
                System.out.println("Kaybettin");
                break;
            }
        }
        System.out.println("Kurpiyer"+ "" + Kurpiyer.toString() + "Elin" + getElin(Kurpiyer);
        System.out.println("Ben"+ "" + ben.toString() + "Elin" + getElin(ben);
        Kurpiyer.Fold(k);
        ben.Fold(k);

        system.out.println("Tekrar y/n");
        if (input.nextLine().equalsIgnoreCase("Hayır")) {
            System.out.println("Tebrikler");
            System.exit(0);
        }


    }
    public static int getElin(kartcek p)
        int i = 0;
        int value = 0;
        int total = 0;

}