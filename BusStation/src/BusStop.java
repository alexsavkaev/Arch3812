public class BusStop {
    private int id;
    private String name;
    private double lattitude;
    private double longitude;

    public BusStop() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getLattitude() {
        return lattitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public BusStop(int id, String name, double lattitude, double longitude) {
        this.id = id;
        this.name = name;
        this.lattitude = lattitude;
        this.longitude = longitude;
    }
}
