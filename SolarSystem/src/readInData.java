import java.util.*;
import java.io.*;

public class readInData {
    final String fileName = "solarsystem.dat";
    private ArrayList<Body> List;

    public readInData()throws NoSuchFieldException, IOException{
        List = new ArrayList<Body>();
        File file = new File(fileName);
        Scanner c = new Scanner(new BufferedReader(new FileReader(file)));
        String name , orbits;
        // double mass, diameter, Perihelion, Aphelion;
        double[] data;
        c.nextLine();
        do{
            data = new double[4];
            for(int i = 0; i < 6; i++){
                if(i == 0){
                    name = c.next();
                    System.out.print(name + " ");
                }
                else if(i == 1){
                    orbits = c.next();
                    System.out.print(orbits + " ");
                }
                else{
                    data[i - 2] = c.nextDouble();
                    System.out.print(data[i - 2] + " ");
                }
            }

            System.out.println();
            c.nextLine();
        }while(c.hasNextLine());
    }
    public static void main(String[] args)throws NoSuchFieldException, IOException {
        readInData a = new readInData();
    }
}
