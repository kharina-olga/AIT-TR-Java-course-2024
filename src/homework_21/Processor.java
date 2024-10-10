package homework_21;

public class Processor extends Component {

    private double speed; // частота процессора в GHz

    public Processor(String brand, String model, double speed) {
        super(brand, model); // вызов конструктора родительского класса Component
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

}
