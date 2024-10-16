import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scoala
{
    Map<String, Clasa> cls = new HashMap<>();

    void adaugaClasa(String identificator, Clasa c)
    {
        cls.put(identificator, c);
    }

    void eliminaClasa(String identificator)
    {
        cls.remove(identificator);
    }

    void adaugaElevInClasa(String identificator, Elev e)
    {
        cls.get(identificator).adaugaElev(e);
    }

    void eliminaElevDupaNume(String nume)
    {
        for (Clasa c : cls.values())
        {
            for (Elev e : c.getElevi())
            {
                if (e.getNume() == nume)
                    c.eliminaElev(e);
            }
        }
    }

    int getNumarClase()
    {
        int contor = 0;
        for(Map.Entry<String, Clasa> c : cls.entrySet())
        {
            contor++;
        }
        return contor;
    }

    int getToatalElevi()
    {
        int totalElevi = 0;
        for (Clasa c : cls.values())
        {
            totalElevi += c.getTotalElevi();
        }
        return totalElevi;
    }
}
