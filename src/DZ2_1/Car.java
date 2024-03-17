package DZ2_1;

public class Car {
    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Car{" +
                "category='" + category + '\'' +
                ", engine=" + engine +
                ", wheels=" + wheels +
                ", seeds=" + seeds +
                ", lock=" + lock +
                '}';
    }

    public Car(String category, Engine engine, Wheels wheels, Seeds seeds, Lock lock) {
        this.category = category;
        this.engine = engine;
        this.wheels = wheels;
        this.seeds = seeds;
        this.lock = lock;
    }

    private String category;
   private Engine engine;
   private Wheels wheels;

    private Seeds seeds;
   private Lock lock;

    public boolean isKeyValid(Driver driver){
        int a = this.lock.getKeyValueLock();
        int b = driver.getKeyValue();
return a == b;
}

public String IsValueCategory(){
        String a =this.getCategory();
        return getCategory();
}
    }

