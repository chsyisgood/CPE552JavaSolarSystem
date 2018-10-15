public class Body {
    private String name;
    private double mass;
    private double diameter;
    private Body orbits;
    private double meandistance;
    public Body(String name, double mass, double diameter, double perihelion, double aphelion) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.orbits = null;
        this.meandistance = (perihelion + aphelion)/2;
    }
    public boolean isOrbits(String s){
        return s.equals(name);
    }
    public void setOrbits(Body orbits){
        this.orbits = orbits;
    }
    public String toString(){
        if(orbits == null)
            return "Name of the body: " + name + ", " + "Mass: " + mass + ", " + "Diameter: " + diameter + ", " + "What it orbits: " + "NaN" + ", " + "Mean distance from what it orbits: " + meandistance;
        else
            return "Name of the body: " + name + ", " + "Mass: " + mass + ", " + "Diameter: " + diameter + ", " + "What it orbits: " + orbits.name + ", " + "Mean distance from what it orbits: " + meandistance;
    }
}