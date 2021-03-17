package tresor;

public class Gegenstand {
    private int id;
    private double wert;


    public Gegenstand(int id,double wert) {
        this.id = id;
        this.wert = wert;
    }
        public int getId() {

            return id;
        }

        public double getWert(){

            return wert;
        }

    public void setWert(double wert){

    }

    public String toString() {

        StringBuilder text = new StringBuilder();
        text.append("\tWert: " + getWert() + "\n");
        text.append("\tID: " + getId() + "\n");

        return text.toString();
    }
}

