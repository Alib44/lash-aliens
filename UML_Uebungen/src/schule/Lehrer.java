package schule;

import java.util.ArrayList;

public class Lehrer {
    private String name;
    private String vorname;
    private ArrayList<Fach> FachArrayList;

    public Lehrer(String Vorname, String name, ArrayList<Fach> FachArrayList) {
        this.FachArrayList = FachArrayList;
        this.name = name;
        this.vorname = Vorname;
    }
}