public class Engine {

    private int pedalSize; // Размер педалей

    public Engine(int pedalSize) {
        this.pedalSize = pedalSize;
    }

    public int getPedalSize() {
        return pedalSize;
    }

    public void setPedalSize(int pedalSize) {
        this.pedalSize = pedalSize;
    }

    @Override
    public String toString() {
        return "Engine{pedalSize=" + pedalSize + "}";
    }
}