package org.example;// Source code is decompiled from a .class file using FernFlower decompiler.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Solution {
   public Solution() {
   }

   public static void main(String[] var0) {
      Solution solution = new Solution();
      List<Booking> bookings = solution.populateData();
      List<Booking> sortedBySeat = solution.sortBySeat(bookings);

       for (Booking booking : sortedBySeat) {
           System.out.println(booking.pnr + " " + booking.seatNo);
       }

   }

   private List<Booking> populateData() {
      ArrayList<Booking> bookings = new ArrayList<>();
      bookings.add(new Booking(101, "A1"));
      bookings.add(new Booking(101, "B1"));
      bookings.add(new Booking(101, "A20"));
      bookings.add(new Booking(101, "B20"));
      bookings.add(new Booking(102, "C1"));
      bookings.add(new Booking(102, "D1"));
      bookings.add(new Booking(103, "C20"));
      bookings.add(new Booking(104, "D20"));
      bookings.add(new Booking(105, "D10"));
      bookings.add(new Booking(106, "C10"));
      bookings.add(new Booking(107, "D5"));
      bookings.add(new Booking(108, "C5"));
      bookings.add(new Booking(109, "A303"));
      bookings.add(new Booking(109, "B3"));
      bookings.add(new Booking(109, "C3"));
      bookings.add(new Booking(109, "D3"));
      return bookings;
   }

   public List<Booking> sortBySeat(List<Booking> bookings) {
      ArrayList<Booking> sortedList = new ArrayList<>(bookings);
      sortedList.sort(new SeatComparator());
      return sortedList;
   }
   static class SeatComparator implements Comparator<Booking> {

      public int compare(Booking b1, Booking b2) {
         return (b2.getRow() != b1.getRow()) ? b2.getRow() - b1.getRow() : b2.getColumn().compareToIgnoreCase(b1.getColumn());
      }
   }
}
