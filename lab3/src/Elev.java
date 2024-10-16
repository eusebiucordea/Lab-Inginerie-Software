public class Elev  {
    private String nume;
    Gen gen;

    Elev(String nume, Gen gen)
    {
        this.nume = nume;
        this.gen = gen;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
