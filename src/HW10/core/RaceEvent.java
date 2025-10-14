package HW10.core;

public class RaceEvent{
    private String type;
    private String driver;
    private Integer position;

    public RaceEvent(String type, String driver, Integer position) {
        this.type = type;
        this.driver = driver;
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public String getDriver() {
        return driver;
    }

    public int getPosition() {
        return position;
    }

}
