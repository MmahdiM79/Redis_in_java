import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import redis.clients.jedis.Jedis;





public class Main 
{

            /*  Fields  */

    // Data Base
    private static Jedis db = new Jedis("localhost");

    // inputs
    private static Scanner in;





            /*  Methods  */

    /**
     * This method loads the 'NYSE_20210301.csv' file in data base
     */
    private static void load() throws FileNotFoundException
    {
        // open csv file
        in = new Scanner(new File("./NYSE_20210301.csv"));


        // read values
        String[] holdLine;
        while (in.hasNextLine())
        {
            holdLine = in.nextLine().split(",");
            db.set(holdLine[0], holdLine[1]);
        }
    }


    public static void main(String[] args) 
    {
        // load csv file in date base
        try { load(); }
        catch (FileNotFoundException e) 
        {
            System.out.println("\ncan not find the NYSE_20210301 file!\n");
            return;
        }


        // set scanner
        in = new Scanner(System.in);

        // hold the client command
        String[] command;

        // read client commands
        while (true)
        {
            command = in.nextLine().split(" ");

            switch (command[0])
            {
                
            }
        }
    }
}