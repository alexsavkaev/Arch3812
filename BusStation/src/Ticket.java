import java.math.BigDecimal;
import java.util.Date;

public class Ticket {
    private BigDecimal price;
    private Date date;
    private int startZone;
    private int finishZone;
    private boolean withLuggage;
    private int place;
    private int roadNumber;

    public BigDecimal getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public int getStartZone() {
        return startZone;
    }

    public int getFinishZone() {
        return finishZone;
    }

    public boolean isWithLuggage() {
        return withLuggage;
    }

    public int getPlace() {
        return place;
    }

    public int getRoadNumber() {
        return roadNumber;
    }

    public Ticket(BigDecimal price, Date date, int startZone, int finishZone, boolean withLuggage, int place, int roadNumber) {
        this.price = price;
        this.date = date;
        this.startZone = startZone;
        this.finishZone = finishZone;
        this.withLuggage = withLuggage;
        this.place = place;
        this.roadNumber = roadNumber;
    }
}
