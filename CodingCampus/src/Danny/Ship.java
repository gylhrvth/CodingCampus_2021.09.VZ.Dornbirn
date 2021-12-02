package Danny;

public abstract class Ship {
    public void swim(int km) {
        start();
        for (int i = 0; i < km; i++) {
            if (i % 10 == 0 || i == km - 1) {
                System.out.println("Swimming because I am a ship kilometer " + i + "->" + (i + 1));
            }
        }
        stop();
    }

    public abstract void start();

    public abstract void stop();
}
