package tresor;

public class Schmuck {
    private String bz;


    public Schmuck(int id, double wert, String bz) {
        this.bz = bz;
    }

    public String getBezeichnung() {

        return getBezeichnung();
    }

    public void setBezeichnung(int bezeichnung) {

    }


    public String toString() {

        StringBuilder text = new StringBuilder();
        text.append("\tID: " + getBezeichnung() + "\n");

        return text.toString();
    }
}