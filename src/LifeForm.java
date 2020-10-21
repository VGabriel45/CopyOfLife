public abstract class LifeForm {

    private int x;
    private int y;
    private int age = 0;

    public LifeForm(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void checkBacteria(){}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract String isDying(int a, int b);

    @Override
    public String toString() {
        return "LifeForm{" +
                "x=" + x +
                ", y=" + y +
                ", age=" + age +
                '}';
    }
}
