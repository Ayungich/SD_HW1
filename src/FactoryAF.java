import java.util.LinkedList;
import java.util.Queue;

public class FactoryAF {

    // Композиция машин (Queue<Car>): завод "владеет" этими объектами
    private final Queue<Car> cars = new LinkedList<>();
    // Агрегация клиентов (Queue<Customer>): клиенты существуют независимо
    private final Queue<Customer> customers = new LinkedList<>();

    public void addCar(Car car) {
        cars.offer(car); // Добавляем в очередь машин
    }

    public void addCustomer(Customer customer) {
        customers.offer(customer); // Добавляем в очередь клиентов
    }

    public Queue<Car> getCars() {
        return cars;
    }

    public Queue<Customer> getCustomers() {
        return customers;
    }

    /**
     * Выдача автомобилей всем желающим.
     * Если после выдачи остались свободные автомобили, они ликвидируются (очищаются).
     */
    public void saleCar() {
        // Мы не можем напрямую пройтись циклом for-each по очереди и менять её одновременно.
        // Поэтому делаем так:
        int size = customers.size(); // Запоминаем сколько всего клиентов
        for (int i = 0; i < size; i++) {
            // Извлекаем клиента из очереди
            Customer customer = customers.poll();
            if (customer != null && !cars.isEmpty()) {
                // Выдаём автомобиль (извлекаем из очереди машин)
                Car car = cars.poll();
                customer.setCar(car);
            }
            // Возвращаем клиента (с автомобилем или без) назад в очередь
            customers.offer(customer);
        }
        // Если машины всё ещё остались — ликвидируем
        if (!cars.isEmpty()) {
            cars.clear();
        }
    }
}
