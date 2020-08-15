
public class GraphicCalculatorLogic {
    private int value;

    public GraphicCalculatorLogic() {
        this.value = 0;
    }

    public void add(int input) {
        this.value += input;
    }

    public void subtract(int input) {
        this.value -= input;
    }

    public void reset() {
        this.value = 0;
    }

    public int getValue() {
        return value;
    }
}
