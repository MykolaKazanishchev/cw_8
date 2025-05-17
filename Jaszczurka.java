public class Jaszczurka extends Zwierze{
    private boolean zyjeNaLadzie;

    public Jaszczurka(String nazwa, int wiek, boolean zyjeNaLadzie) {
        super(nazwa, wiek);
        this.zyjeNaLadzie = zyjeNaLadzie;
    }

    @Override
    public String wydajDzwiek() {
        return "Syk";
    }

    @Override
    public String poruszajSie() {
        return "Pełza";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Lasy, Rzeki, Bagna";
    }

    public void czyZyjeNaLadzie(){
        System.out.println("Zyje na ladzie: " + zyjeNaLadzie);
    }
}