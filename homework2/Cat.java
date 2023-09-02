public class Cat implements Moving {
    String name;
    int maxrun;
    int maxjump;

    public Cat(String name, int maxrun, int maxjump) {
        this.name = name;
        this.maxrun = maxrun;
        this.maxjump = maxjump;
    }


    @Override
    public boolean run(Track track) {
        boolean bool = false;
        if (maxrun > track.tracklong) {
            bool = true;
            System.out.printf("Кот " + name + " может пробежать " + track.name + " " + track.tracklong + "км! \n");
        } else System.out.printf("Кот " + name + " НЕ может пробежать " + track.name + "! \n");
        return bool;
    }

    @Override
    public boolean jump(Wall wall) {
        boolean bool = false;
        if (wall.heigth < maxjump) {
            bool = true;
            System.out.printf("Кот " + name + " может перепрыгнуть " + wall.name + " " + wall.heigth + "м! \n");
        } else System.out.printf("Кот " + name + " НЕ может перепрыгнуть " + wall.name + "! \n");
        return bool;
    }
}
