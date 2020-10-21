import java.util.ArrayList;
import java.util.List;

public class Coccus extends LifeForm{

    final static int LIFESPAN = 100;
    final static int NEARBY = 1;
    private List<Coccus> coccusList = new ArrayList<>();

    public Coccus(int x, int y) {
        super(x, y);
    }

    @Override
    public void checkBacteria() {
        if (this.getAge() >= LIFESPAN){
            Coccus coccus1 = new Coccus(RandomUtil.generateRandom(0,NEARBY),RandomUtil.generateRandom(0,NEARBY-1));
            Coccus coccus2 = new Coccus(RandomUtil.generateRandom(0,NEARBY),RandomUtil.generateRandom(0,NEARBY-1));
            coccusList.add(coccus1);
            coccusList.add(coccus2);
        } else {
            setAge(getAge() + 1);
        }
    }

    @Override
    public String isDying(int a, int b) {
        if (a - b <= NEARBY){
            return "Coccus died";
        } else {
            return "Coccues alive";
        }
    }

    @Override
    public String toString() {
        return "Coccus " + " LIFESPAN = " + LIFESPAN + " NEARBY = " + NEARBY + " bacillus list : " + coccusList;
    }
}
