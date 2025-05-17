public class Slon extends Zwierze{
    private String rozmiarCiosow;

    public Slon(String nazwa, int wiek, String rozmiarCiosow) {
        super(nazwa, wiek);
        this.rozmiarCiosow = rozmiarCiosow;
    }

    @Override
    public String wydajDzwiek() {
        return "Trąbienie";
    }

    @Override
    public String poruszajSie() {
        return "Wolno chodzi";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Sawanny Afryki i Indie";
    }
    public void pokazCiosy(){
        System.out.println("Rozmiar ciosow: " + rozmiarCiosow);
    }
}
