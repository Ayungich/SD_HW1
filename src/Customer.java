public class Customer {

    private String fio;  // Имя покупателя
    private Car car;     // Агрегация: клиент лишь "ссылается" на автомобиль

    public Customer(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        if (car == null) {
            return "Customer{fio='" + fio + "', car=none}";
        }
        return "Customer{fio='" + fio + "', car=" + car + "}";
    }
}
