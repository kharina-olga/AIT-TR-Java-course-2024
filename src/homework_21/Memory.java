package homework_21;

public class Memory extends Component {
    private int capacity; // емкость памяти в GB

    public Memory(String brand, String model, int capacity) {
        super(brand, model);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

}
