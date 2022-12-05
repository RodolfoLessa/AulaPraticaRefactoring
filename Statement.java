import java.util.Enumeration;

public abstract class Statement {
    
    public abstract String getName(Customer aCustomer);

    public abstract String getTitleCharge(Rental each);

    public abstract String getTotals(Customer aCustomer);

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
