package prog2.exercise5.flight.booking.system;

import java.util.Scanner;
import java.time.LocalDate;

public class Main 
{
    public static void main( String[] args )
    {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your total number of tickets: ");
        int numOfTickets = input.nextInt();
      

        System.out.println("Please enter your departure date: ");

        String departureDate = input.next();

        System.out.println("Please enter your return date:");

        String returnDate = input.next();

        System.out.println("Please enter number of children:");

        int childPassengers = input.nextInt();

        System.out.println("Please enter number of adults:");

        int adultPassengers = input.nextInt(); 
       
        System.out.println("1. First\n2. Bussiness\n3. Economy\nPlease choose your booking class(input the number):");

        String numOfBookingClass = input.next();

        System.out.println("1. One way\n2. Return\nPlease choose your trip type(input the number):");

        String numOfTripType = input.next();

        System.out.println("1. Nanjing\n2. Beijing\n3. Oulu\n4.Helsinki\nPlease choose your trip source(input the number):");

        String numOfTripSource = input.next();

        System.out.println("1. Nanjing\n2. Beijing\n3. Oulu\n4.Helsinki\nPlease choose your trip destination(input the number):");

        String numOfTripDestination = input.next();
       

        
        LocalDate departureDate1 = LocalDate.parse(departureDate);

        LocalDate returnDate1 = LocalDate.parse(returnDate);
        //change

        FlightBooking flightBooking1 = new FlightBooking(numOfTickets);
        
        flightBooking1.reserveTickets(numOfTickets);

        flightBooking1.reserveTickets(numOfTickets);

        flightBooking1.setTotalTicketPrice();

        flightBooking1.setBookingClass(numOfBookingClass);

        flightBooking1.setTripType(numOfTripType);

        flightBooking1.setTripSource(numOfTripSource);

        flightBooking1.setTripDestination(numOfTripSource,numOfTripDestination);     

        flightBooking1.setDepartureDate(departureDate1);

        flightBooking1.setReturnDate(returnDate1);

        flightBooking1.setDepartingTicketPrice(childPassengers, adultPassengers);

        flightBooking1.setReturnTicketPrice();

        flightBooking1.setTotalTicketPrice();

      
        

        

        
        
        flightBooking1.setFlightID();
        
        input.close();

      
        
    }
}
