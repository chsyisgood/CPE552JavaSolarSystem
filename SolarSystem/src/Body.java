
public class Body {
    private char name;
    private double mass;
    private double diameter;
    private Body orbits;
    private double meandistance;
    public Body(char nm, double mas, double dia, Body orbit, double distance) {
        name = nm;
        mass = mas;
        diameter = dia;
        orbits = orbit;
        meandistance = distance;
    }
    /*public static void main(String[] args) {
        System.out.println("Hello World!");
    }*/
}
