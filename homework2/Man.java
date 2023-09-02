public class Man implements Moving{
    String name;
    int maxrun;
    int maxjump;

    public Man(String name, int maxrun, int maxjump){
        this.name = name;
        this.maxrun = maxrun;
        this.maxjump = maxjump;
    }

    @Override
    public boolean run(Track track){
        boolean bool = false;
        if (track.tracklong < maxrun) {
            bool = true;
            System.out.printf("Человек " + name + " может пробежать " + track.name + " " + track.tracklong + "км! \n");
        } else System.out.printf("Человек " + name + " НЕ может пробежать " + track.name + "! \n");
        return bool;
    }


    @Override
    public boolean jump(Wall wall){
        boolean bool = false;
        if (wall.heigth < maxjump) {
            bool = true;
            System.out.printf("Человек" + name + "может перепрыгнуть " + wall.name + " " + wall.heigth + "м! \n");
        } else System.out.printf("Человек" + name + " НЕ может перепрыгнуть " + wall.name + "! \n");
        return bool;
    }
}
