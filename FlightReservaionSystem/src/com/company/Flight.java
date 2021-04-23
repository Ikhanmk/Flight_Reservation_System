package com.company;

public class Flight {
    public String flightNumber;
    public String airline;
    public int capacity;
    private int bookedSeats;
    public int bookingCounter=0;

    public String getFlightDetails()
    {
        return "flightnumber is: "+flightNumber+", airline is: "+airline+", capacity is: "+capacity+", bookedSeats: "+bookedSeats;

    }
    public boolean checkAvailability()
    {
        return bookedSeats > capacity;
    }
    public void incrementBookingCounter()
    {
bookingCounter++;
    }
}
