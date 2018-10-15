import java.util.*;
import java.io.*;

public class readInData {
    final String fileName = "solarsystem.dat";
    static ArrayList<Body> List;

    public void findOrbits(Body body ,String orbits){
        // find and set the orbits
        int size = List.size();
        if(orbits.equals("NaN"))
            return;
        for(int i = 0; i < size; i++)
            if(List.get(i).isOrbits(orbits))
                body.setOrbits(List.get(i));
    }
    public readInData()throws NoSuchFieldException, IOException{
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
            List.add(body);
            findOrbits(body,orbits);
            System.out.println(body);
            c.nextLine();
        }while(c.hasNextLine());
    }
    public static void main(String[] args)throws NoSuchFieldException, IOException {
        List = new ArrayList<Body>();
        readInData a = new readInData();
    }
}
