public class Main {

    public static void main(String[] args) {

        Moving moving[] = new Moving[7];
        moving[0] = new Bot("T-800", 55, 5);
        moving[1] = new Cat("Kuzik", 3, 1);
        moving[2] = new Man("Aleks", 10, 1);
        moving[3] = new Man("Aleksa", 22, 2);
        moving[4] = new Man("Boris", 5, 0);
        moving[5] = new Bot("T-1000", 65, 3);
        moving[6] = new Bot("Tbot", 6, 3);

        Difficulty dif[] = new Difficulty[3];
        dif[0] = new Track("марафон", 42);
        dif[1] = new Track("полумарафон", 11);
        dif[2] = new Wall("забор", 1);

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 3; j++) {
                if (dif[j].difficulty(moving[i]) == false) break;
            }
        }
    }
}