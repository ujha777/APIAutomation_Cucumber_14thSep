package module;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import payloads.request.Booking;
import payloads.request.Bookingdates;

public class PayloadManager {
    ObjectMapper objectMapper;
    //Serialization
    public  String createPayload() throws JsonProcessingException {
        objectMapper = new ObjectMapper();
        //Json to String
        Booking booking = new Booking();
        booking.setFirstname("Pramod");
        booking.setLastname("Dutta");
        booking.setTotalprice(123);
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("BreakFast");

        Bookingdates bookingdates=new Bookingdates();
        bookingdates.setCheckin("2022-01-01");
        bookingdates.setCheckout("2022-01-10");

        booking.setBookingdates(bookingdates);

        String payload = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booking);

        return payload;
    }
}
