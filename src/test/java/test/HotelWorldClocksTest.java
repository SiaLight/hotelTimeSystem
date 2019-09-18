package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import time.HotelWorldClockSystem;
import time.PhoneClock;

import time.cityClock;

class HotelWorldClocksTest {
	private HotelWorldClockSystem hotelWorldClockSystem;
	 private PhoneClock phoneClock;
	 
   @BeforeEach
   
   public  void initialize () {
	   this.hotelWorldClockSystem = new HotelWorldClockSystem();
       this.phoneClock = new PhoneClock(8);
   }
  
	
	
	@Test
	void london_time_test() {
		//Arrange
		cityClock londonClock = new cityClock(0);
        hotelWorldClockSystem.attach(londonClock);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        // Assert
        assertEquals(1, londonClock.getTime());
	}
	
	@Test
	
	public void NewYork_time_test() {
		 cityClock newYorkClock = new cityClock(-5);
	        hotelWorldClockSystem.attach(newYorkClock);

	        // Act
	        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
	        phoneClock.setTime(9);

	        // Assert
	        assertEquals(20, newYorkClock.getTime());
	}
	
	@Test 
	public void London_NewYork_Test() {
		cityClock londonClock = new cityClock(0);
       cityClock newYorkClock = new cityClock(-5);
        hotelWorldClockSystem.attach(londonClock);
        hotelWorldClockSystem.attach(newYorkClock);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        // Assert
        assertEquals(1, londonClock.getTime());
        assertEquals(20, newYorkClock.getTime());
	}
   
	@Test
	
	public void the_time_phone_clock_test() {
		phoneClock.setTime(9);

        // Assert
        assertEquals(9, phoneClock.getTime());
	}
	
	@Test
	
	public void the_time_of_Moscow_test() {
		cityClock moscowClock = new cityClock(4);
        hotelWorldClockSystem.attach(moscowClock);

        // Act
        phoneClock.setHotelWorldClockSystem(hotelWorldClockSystem);
        phoneClock.setTime(9);

        // Assert
        assertEquals(5, moscowClock.getTime());
	}
}
