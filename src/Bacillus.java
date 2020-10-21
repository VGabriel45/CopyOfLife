import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class Bacillus extends LifeForm {

    final static int LIFESPAN = 10;
    final static int NEARBY = 3;
    private List<Bacillus> bacillusList = new ArrayList<>();

    public Bacillus(int x, int y) {
        super(x, y);
    }

    @Override
    public void checkBacteria() {
        if (this.getAge() >= LIFESPAN){
            Bacillus bacillus1 = new Bacillus(RandomUtil.generateRandom(0,NEARBY),RandomUtil.generateRandom(0,NEARBY-1));
            Bacillus bacillus2 = new Bacillus(RandomUtil.generateRandom(0,NEARBY),RandomUtil.generateRandom(0,NEARBY-1));
            bacillusList.add(bacillus1);
            bacillusList.add(bacillus2);
        } else {
            setAge(getAge() + 1);
        }
    }

    @Override
    public String isDying(int a, int b) {
        if (a - b <= NEARBY){
            return "Bacillus died";
        } else {
            return "Bacillus alive";
        }
    }

    @Override
    public String toString() {
        return "Bacillus " + " LIFESPAN = " + LIFESPAN + " NEARBY = " + NEARBY + " AGE = " + getAge() +  " bacillus list : " + bacillusList;
    }
}
