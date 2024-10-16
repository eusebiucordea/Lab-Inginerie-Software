import java.util.ArrayList;
import java.util.List;

public class Clasa{
    private int capacitate;
    private NumarClasa numar;
    private char litera;
    private List<Elev> elevi = new ArrayList<Elev>();

    void adaugaElev(Elev e)
    {
        elevi.add(e);
    }

    void eliminaElev(Elev e)
    {
        elevi.remove(e);
    }

    int getTotalElevi()
    {
        int size = elevi.size();
        return size;

    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public NumarClasa getNumar() {
        return numar;
    }

    public void setNumar(NumarClasa numar) {
        this.numar = numar;
    }

    public char getLitera() {
        return litera;
    }

    public void setLitera(char litera) {
        this.litera = litera;
    }

    public List<Elev> getElevi() {
        return elevi;
    }

    public void setElevi(List<Elev> elevi) {
        this.elevi = elevi;
    }
}
