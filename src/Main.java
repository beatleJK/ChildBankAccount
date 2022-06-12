public class Main {
    public static void main(String[] args){
        ChildBankAccount account = new ChildBankAccount(10000);
        account.depositMoney(1000);
        account.depositMoney(2000);
        account.depositMoney(10000);
        account.depositMoney(-1000);
        System.out.println("Balance: " + account.getBalance());
        account.debitMoney(500);
        account.debitMoney(422.75);
        account.debitMoney(50000);
        account.debitMoney(-50);
        System.out.println("Balance: " + account.getBalance());
        Country Rus = new Country("Russia");
        Rus.setName("Russia");
        System.out.println("Название страны: "+ Rus.getName());
        Rus.setSize(145478097);
        System.out.println("Численность населения: "+ Rus.getSize()+ " человек");
        Car ford = new Car("Mustang","mechanical",500000.00);
        System.out.println("Модель машины: " + ford.getName());
        System.out.println("Коробка передач: " + ford.getGearBox());
        System.out.println("Цена: " + ford.getPrice());
        ford.setMaxSpeed(200);
        System.out.println("Максимальная скорость: " + ford.getMaxSpeed());
    }
}
