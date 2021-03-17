package schule;

import java.util.ArrayList;

public class Schule {
    private String name;
    private ArrayList<Schueler> schuelerArrayList;
    private ArrayList<Lehrer>  lehrerArrayList;

    public Schule (String name, ArrayList<Schueler> schuelerArrayList,ArrayList<Lehrer>  lehrerArrayList ){
      this.lehrerArrayList = lehrerArrayList;
      this.name = name;
      this.schuelerArrayList = schuelerArrayList;
    }
}
