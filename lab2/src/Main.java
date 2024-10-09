import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persoana pers = new Persoana(Gen.altul);
        pers.showGen();

        Lectie <Persoana> lectie = new Lectie(pers);
        lectie.start();

        Lectie <Integer> lectie2 = new Lectie<Integer>(8);
        lectie2.start();

        Lectie <Object> lectie3 = new Lectie(Persoana.class);
        lectie3.start();

        List<Persoana> persoane = new LinkedList<>();
        persoane.add(pers);
        persoane.add(new Persoana(Gen.feminin));
        persoane.add(new Persoana(Gen.masculin));
        for (Persoana i : persoane) {
            i.showGen();

            
        }
    }
}