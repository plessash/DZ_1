package DZ_2;

public class Driver {
    private int drivingExperience;

    @Override
    public String toString() {
        return "Driver{" +
                "drivingExperience=" + drivingExperience +
                ", category='" + category + '\'' +
                ", key=" + key +
                '}';
    }

    public Driver(int drivingExperience, String category, DriverKey key) {
        this.drivingExperience = drivingExperience;
        this.category = category;
        this.key = key;
    }

    private final String category;
    public String getCategory() {
        return category;
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
        // вернет true, если тип топлива подходит и количество литров влазит в бак
        boolean addFuel(float liters, String fuelType);


    }
}
