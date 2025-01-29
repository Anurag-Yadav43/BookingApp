package org.example;

// Source code is decompiled from a .class file using FernFlower decompiler.
public class Booking {
   long pnr;

   String seatNo;

   public Booking() {
   }

   public Booking(long pnr, String seatNo) {
      this.pnr = pnr;
      this.seatNo = seatNo;
   }

   public long getPnr() {
      return this.pnr;
   }

   public void setPnr(long var1) {
      this.pnr = var1;
   }

   public String getSeatNo() {
      return this.seatNo;
   }

   public void setSeatNo(String var1) {
      this.seatNo = var1;
   }

   public String getColumn() {
     return seatNo.charAt(0) + "";
   }

   public int getRow(){
      return Integer.parseInt(seatNo.substring(1));
   }
}
