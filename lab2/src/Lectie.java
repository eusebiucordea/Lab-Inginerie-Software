public class Lectie <T>{
    T tema;
    void start()
    {
        System.out.println("lectie cu tipul : " + tema.getClass());
    }

    Lectie(T tema)
    {
        this.tema = tema;
    }

}
