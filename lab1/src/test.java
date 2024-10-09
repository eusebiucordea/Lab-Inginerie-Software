import pachet.exe;
public class test implements exe {

    void mostenire()
    {
        System.out.println("Mostenire");
    }

    @Override
    public void executa() {
        System.out.println("Executa");
    }
}
