import io.lettuce.core.*;
import io.lettuce.core.api.*;
import io.lettuce.core.api.sync.*;






public class Main 
{

            /*  Fields  */


    // Data Base part
    private static RedisClient db = RedisClient.create("redis://localhost:6379/0");
    private static StatefulRedisConnection<String, String> connection = db.connect();
    private static RedisCommands<String, String> syncCommands = connection.sync();

    public static void main(String[] args) 
    {
        
    }
}