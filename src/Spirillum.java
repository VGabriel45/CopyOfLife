import java.util.ArrayList;
import java.util.List;

public class Spirillum extends LifeForm {

    final static int LIFESPAN = 40;
    final static int NEARBY = 2;
    private List<Spirillum> spirillumList = new ArrayList<>();

    public Spirillum(int x, int y) {
        super(x, y);
    }

    @Override
    public void checkBacteria() {
        if (this.getAge() >= LIFESPAN){
            Spirillum spirillum1 = new Spirillum(RandomUtil.generateRandom(0,NEARBY),RandomUtil.generateRandom(0,NEARBY-1));
            Spirillum spirillum2 = new Spirillum(RandomUtil.generateRandom(0,NEARBY),RandomUtil.generateRandom(0,NEARBY-1));
            spirillumList.add(spirillum1);
            spirillumList.add(spirillum2);
        } else {
            setAge(getAge() + 1);
        }
    }

    @Override
    public String isDying(int a, int b) {
        if (a - b <= NEARBY){
            return "Spirillum died";
        } else {
            return "Spirillum alive";
        }
    }

    @Override
    public String toString() {
        return "Spirillum " + " LIFESPAN = " + LIFESPAN + " NEARBY = " + NEARBY + " bacillus list : " + spirillumList;
    }
}
