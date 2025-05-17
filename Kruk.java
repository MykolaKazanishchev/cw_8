public class Kruk extends Zwierze {
    private String kolorPior;
    public Kruk(String nazwa, int wiek, String kolorPior) {
        super(nazwa, wiek);
        this.kolorPior = kolorPior;
    }

    @Override
    public String wydajDzwiek() {
        return "Kra";
    }

    @Override
    public String poruszajSie() {
        return "Lataj nad budynkami";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Miasta, lasy";
    }

    public void pokazPiora(){
        System.out.println("Kolor pior: " + kolorPior);
    }
}
