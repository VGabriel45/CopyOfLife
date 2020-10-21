public class Main {
    public static void main(String[] args) {
        Dish dish = new Dish();

        Bacillus bacillus = new Bacillus(3,5);
        Coccus coccus = new Coccus(2,4);
        Spirillum spirillum = new Spirillum(2,4);

        dish.addBacteria(bacillus);
        dish.addBacteria(coccus);
        dish.addBacteria(spirillum);

        for (int i = 0; i < 25 ; i++){
            dish.timePulse();
        }

        // verific daca Coccus x+y - Bacillus x+y == NEARBY-ul clasei Bacillus. Adica daca Coccus se afla "nearby" Bacillus.
        System.out.println(bacillus.isDying(coccus.getX() + coccus.getY(),bacillus.getX() + bacillus.getY()));

        dish.display();

    }
}
