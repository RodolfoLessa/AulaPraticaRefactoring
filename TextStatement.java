public class TextStatement extends Statement {

   public String getName(Customer aCustomer) {
      return "Rental Record for " + aCustomer.getName() + "\n";
   }

   public String getTitleCharge(Rental each) {
      return "\t" + each.getMovie().getTitle() + "\t" +
            String.valueOf(each.getCharge()) + "\n";
   }

   public String getTotals(Customer aCustomer) {
      return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
            "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
   }
}