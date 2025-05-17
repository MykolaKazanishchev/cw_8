public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze slon = new Slon("Horton", 4, "1,5 m");
        Zwierze kruk = new Kruk("Krou", 2, "Czarny");
        Zwierze jaszczurka = new Jaszczurka("Nagini", 2, true);

        Zwierze[] zoo = {slon, kruk, jaszczurka};

        for (Zwierze z : zoo) {
            z.wyswietlInformacje();
            System.out.println("Dzwiek: " + z.wydajDzwiek());
            System.out.println("Ruch: " + z.poruszajSie());
            System.out.println("Srodowisko: " + z.srodowiskoNaturalne());
        }
    }
}
