package DZ2_1;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
Car car = new Car("B", new Engine("N52",3000,"AI95"),
        new Wheels("BBS",17,"Summer"),
        new Seeds(5),new Lock(new LockKey(1111)));
        Driver driver = new Driver(new DriverKey(1234));
        System.out.println(driver);
        System.out.println(car);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввести ключ: ");
        int key = scanner.nextInt();
      //boolean keyValid1 =  car.isKeyValid(driver);1
     if (driver.getKeyValue() ==key) {
         System.out.println("Ключ подошел");
     }
     else {
         System.out.println("Ключ не подходит");
         System.out.println(car.IsValueCategory());
     }
    }
}
