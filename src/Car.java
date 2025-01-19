public class Car {

    private int number;      // Порядковый номер машины
    private Engine engine;   // Композиция с Engine

    public Car(int number, Engine engine) {
        this.number = number;
        this.engine = engine;  // При композиции двигатель "принадлежит" машине
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{number=" + number + ", engine=" + engine + "}";
    }
}
