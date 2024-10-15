package homework_24.sportsman;

public class Triathlete implements Swimmer, Runner {

    String name = this.getClass().getSimpleName();

    @Override
    public void run() {
        System.out.println( name + " is running");
    }

    @Override
    public void swim() {
        System.out.println( name + " is swiming");

    }
}
