public class Main {
    public static void main(String[] args) {
        FactoryAF factory = new FactoryAF();

        // Добавим несколько автомобилей на "склад"
        factory.addCar(new Car(1, new Engine(10)));
        factory.addCar(new Car(2, new Engine(15)));
        factory.addCar(new Car(3, new Engine(20)));

        // Добавим несколько потенциальных покупателей
        factory.addCustomer(new Customer("Иван"));
        factory.addCustomer(new Customer("Мария"));
        factory.addCustomer(new Customer("Пётр"));
        factory.addCustomer(new Customer("Елена"));

        // Смотрим, что есть до продажи
        System.out.println("До вызова saleCar():");
        System.out.println("Автомобили на складе: " + factory.getCars());
        System.out.println("Желающие купить: " + factory.getCustomers());

        // Пытаемся всем выдать автомобили
        factory.saleCar();

        // Смотрим результат после вызова saleCar()
        System.out.println("\nПосле вызова saleCar():");
        System.out.println("Автомобили на складе: " + factory.getCars());
        System.out.println("Желающие купить: " + factory.getCustomers());
    }
}