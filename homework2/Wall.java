public class Wall implements Difficulty {
    String name;
    int heigth;

    public Wall(String name, int heigth) {
        this.name = name;
        this.heigth = heigth;
    }

    @Override
    public boolean difficulty(Moving one) {
        return one.jump(this);
    }
}
