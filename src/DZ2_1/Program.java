package DZ2_1;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Car car = new Car("AI95","B", new Engine("N52", 3000, "AI95"),
                new Wheels("BBS", 17, "Summer"),
                new Seeds(4), new Lock(new LockKey(1111)));
        Driver driver = new Driver("B", (new DriverKey(1122)));
        System.out.println(driver);
        System.out.println(car);
        boolean keyValid1 = car.isKeyValid(driver); //3.1.Сверка ключа
        System.out.println(keyValid1);
        boolean categoryValid = car.isDriverCanDriveACar(driver); //3.2 Сверка категории прав
        System.out.println(categoryValid);
        System.out.println("Введите количество пассажиров: "); //3.3 Проверка мест
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        if (numb <= car.amountSeeds()) {
            System.out.println("Поехали!");
        } else {
            System.out.println("Мест нет((");
        }
    }
}
