package time;
public class cityClock extends Clock {
	private int utcZeroTime;
	
	public cityClock(int utcOffset) {
        super.utcOffset = utcOffset;
    }
	
	@Override
    public int getTime() {
        return (super.utcOffset + this.utcZeroTime + 24) % 24;
    }

    public void setUtcZeroTime(int utcZeroTime) {
        this.utcZeroTime = utcZeroTime;
    }
}