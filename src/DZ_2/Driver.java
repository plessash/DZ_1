package DZ_2;

public class Driver {
private String category;

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "category='" + category + '\'' +
                ", key=" + key +
                '}';
    }

    public Driver(String category, DriverKey key) {
        this.category = category;
        this.key = key;
    }


    private DriverKey key;

    public int getKeyValue(){
        return key.getKey();
    }
public String isValueCategoryDriver(){
        String b=this.getCategory();
        return getCategory();
}
    interface DrivingCar {

        // вернет false  если нет ключей
        boolean openCar(Car car);

        // вернет false, если категории не позволяют вести автомобиль или если машина не была еще открыта
        boolean driveCar(String adressToDrive);
        //Этот метод должен выполняется только если машина открыта
        boolean takePassengers(int numberOfPassengers);

        // вернет true, если тип топлива подходит и количество литров влазит в бак
        boolean addFuel(float liters, String fuelType);

    }
}
