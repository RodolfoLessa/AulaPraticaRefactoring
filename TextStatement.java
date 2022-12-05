import java.util.Enumeration;

public class TextStatement extends Statement {

   private String getName(Customer aCustomer) {
      return "Rental Record for " + aCustomer.getName() + "\n";
   }

   private String getTitleCharge(Rental each) {
      return "\t" + each.getMovie().getTitle() + "\t" +
            String.valueOf(each.getCharge()) + "\n";
   }

   private String getTotals(Customer aCustomer) {
      return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
            "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
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