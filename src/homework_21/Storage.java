package homework_21;

// Производный класс Storage (Накопитель)
public class Storage extends Component {

    private int size; // емкость накопителя в GB

    public Storage(String brand, String model, int size) {
        super(brand, model);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

}
