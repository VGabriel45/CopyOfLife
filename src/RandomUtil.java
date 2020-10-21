import java.util.Random;

public class RandomUtil {

    public static int generateRandom(int low,int high){
        Random r = new Random();
        return r.nextInt(high-low) + low;
    }


}
