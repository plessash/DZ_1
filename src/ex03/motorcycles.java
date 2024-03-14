package ex03;
public class motorcycles {
    String type;
    @Override
    public String toString() {
        return "motorcycles{" +
                "type='" + type + '\'' +
                ", max_speed='" + max_speed + '\'' +
                '}';
    }
    int max_speed;
    public motorcycles(String type, int max_speed) {
        this.type = type;
        this.max_speed = max_speed;
    }
}
