
public class Main {
    public static void main(String[] args) {
        Scoala scoala = new Scoala();
        Clasa c1 = new Clasa();
        Clasa c2 = new Clasa();
        Clasa c3 = new Clasa();

        Elev e1 = new Elev("Mihai", Gen.masculin);
        Elev e2 = new Elev("George", Gen.masculin);
        Elev e3 = new Elev("Andreea", Gen.feminin);
        Elev e4 = new Elev("Georgiana", Gen.feminin);


        scoala.adaugaClasa("1A", c1);
        scoala.adaugaClasa("1B", c2);
        scoala.adaugaClasa("1C", c3);

        c1.adaugaElev(e1);
        c1.adaugaElev(e2);
        c3.adaugaElev(e3);
        c2.adaugaElev(e4);

        int numarClase = scoala.getNumarClase();
        System.out.println("Numarul de clase : " + numarClase);

        int numarElevi = scoala.getToatalElevi();
        System.out.println("Numarul total de elevi in scoala : " + numarElevi);

        //eliminare elev
        c1.eliminaElev(e1);
        System.out.println("Numarul de elevi in c1 : " + c1.getTotalElevi());

//        //eliminare elev dupa nume
//        scoala.eliminaElevDupaNume("Georgiana");
//        System.out.println("Numarul de elevi in c2 : " + c2.getTotalElevi());

        //eliminare clasa
        scoala.eliminaClasa("1A");
        System.out.println("Numarul de clase dupa eliminare clasa : " + scoala.getNumarClase());

        //adauga elev in clasa
        scoala.adaugaElevInClasa("1C",e1);
        System.out.println("Numar elevi dupa adauga : " + c3.getTotalElevi());

    }
}