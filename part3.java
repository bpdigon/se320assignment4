import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class part3{
    public static void main(String[] args) throws ParseException{
        double UKNumber = 12345.678;
        double USMoney = 12345.678;
        String strToNum = "12,345.678";


        NumberFormat unitedKingdom = NumberFormat.getInstance(new Locale("en", "UK"));
        unitedKingdom.setMaximumFractionDigits(2);
        unitedKingdom.setMinimumFractionDigits(2);
        String ukFormatted = unitedKingdom.format(UKNumber);


        NumberFormat unitedStates = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        String usFormatted = unitedStates.format(USMoney);
        
        NumberFormat strFormatter = NumberFormat.getInstance(new Locale("en", "US"));
        Number numFormatted = strFormatter.parse(strToNum); 

        System.out.println("Part A input: " + UKNumber);
        System.out.println("Part A output: " + ukFormatted);
        System.out.println("Part B input: " + USMoney);
        System.out.println("Part B output: " + usFormatted);
        System.out.println("Part C input: " + strToNum);
        System.out.println("Part C output: " + numFormatted);


        
        
    }
}