package time;
 
import java.util.ArrayList;
public class HotelWorldClockSystem {
    private ArrayList<cityClock> cityClocks = new ArrayList<cityClock>();

    public void attach(cityClock cityClock) {
        this.cityClocks.add(cityClock);
    }

    public ArrayList<cityClock> getClocks() {
        return this.cityClocks;
    }
}