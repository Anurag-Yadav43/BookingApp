package org.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private Solution solution;
    private List<Booking> bookings;

    @Before
    public void setUp(){
        solution = new Solution();
        bookings = new ArrayList<>();
        bookings.add(new Booking(48544L, "A1"));
        bookings.add(new Booking(88988L, "A2"));
        bookings.add(new Booking(57345, "A3"));
        bookings.add(new Booking(89548, "B1"));
        bookings.add(new Booking(84589, "B2"));
        bookings.add(new Booking(12122, "D1"));

    }

    @Test
    public void testSortBySeat(){
        List<Booking> sortedBookings = solution.sortBySeat(bookings);

        assertEquals("A3",sortedBookings.get(0).getSeatNo());
        assertEquals("B2",sortedBookings.get(1).getSeatNo());
        assertEquals("A2",sortedBookings.get(2).getSeatNo());

    }

    @Test
    public void testSortBySeatForEmpty(){

        List<Booking> sortedBookings = solution.sortBySeat(new ArrayList<>());
        assertTrue(sortedBookings.isEmpty());
    }

    @Test
    public  void testSortBySeatSingleElement(){
        List<Booking> singleBooking = new ArrayList<>();
        singleBooking.add(new Booking(74548,"C9"));

        List<Booking> sortedBookings = solution.sortBySeat(singleBooking);
        assertEquals(1,sortedBookings.size());
        assertEquals("C9",sortedBookings.get(0).getSeatNo());
    }
}
