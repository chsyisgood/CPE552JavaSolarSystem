import java.util.*;
import java.io.*;

public class SolarSystem  {
    final String fileName = "solarsystem.dat";
    private ArrayList<Body> bodiesList;

    public void findOrbits(Body body ,String orbits){
        // find and set the orbits
        int size = bodiesList.size();
        if(orbits.equals("NaN"))
            return;
        for(int i = 0; i < size; i++)
            if(bodiesList.get(i).isOrbits(orbits))
                body.setOrbits(bodiesList.get(i));
    }
    public SolarSystem ()throws NoSuchFieldException, IOException{
        bodiesList = new ArrayList<Body>();
        File file = new File(fileName);
        Scanner c = new Scanner(new BufferedReader(new FileReader(file)));
        String name = null,orbits = null;
        double[] data;
        c.nextLine();
        do{
            data = new double[4];
            for(int i = 0; i < 6; i++){
                if(i == 0)
                    name = c.next();
                else if(i == 1)
                    orbits = c.next();
                else
                    data[i - 2] = c.nextDouble();
            }
            Body body = new Body(name,data[0],data[1],data[2],data[3]);
            bodiesList.add(body);
            findOrbits(body,orbits);
            c.nextLine();
        }while(c.hasNextLine());
    }
    public String toString(){
        return bodiesList.toString();
    }
    public static void main(String[] args)throws NoSuchFieldException, IOException {
        SolarSystem  ss = new SolarSystem ();
        System.out.println(ss);
    }
}
