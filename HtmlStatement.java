import java.util.Enumeration;

public class HtmlStatement extends Statement {

   private String getName(Customer aCustomer) {
      return "<H1>Rentals for <EM>" + aCustomer.getName() + "</EM></H1><P>\n";
   }

   private String getTitleCharge(Rental each) {
      return each.getMovie().getTitle() + ": " + String.valueOf(each.getCharge()) + "<BR>\n";
   }

   private String getTotals(Customer aCustomer) {
      return "<P>You owe <EM>" + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" +
            "On this rental you earned <EM>" + String.valueOf(aCustomer.getTotalFrequentRenterPoints())
            + "</EM> frequent renter points<P>";
   }

   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = getName(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         // show figures for each rental
         result += getTitleCharge(each);
      }
      // add footer lines
      result += getTotals(aCustomer);
      return result;
   }

}
