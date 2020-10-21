import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dish {

    private List<LifeForm> bacterias = new ArrayList<>();

    public void timePulse(){
        for (LifeForm bacteria : bacterias) {
            bacteria.checkBacteria();
        }
    }

    public void display(){
        for (LifeForm bacteria : bacterias) {
            System.out.println(bacteria.toString());
        }
        System.out.println(toString());
    }

    public void addBacteria(LifeForm e){
        bacterias.add(e);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "bacterias=" + bacterias +
                '}';
    }
}
