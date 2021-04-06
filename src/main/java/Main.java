import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        try{
            System.out.println("Hola mundo");
            int i = 0;
            int b = 10 / i;
        }catch (Exception e){
            logger.error("Algo salio mal", e);

        }
    }
}
