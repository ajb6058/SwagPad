package swagpad;

import java.util.Date;
import java.text.*;

public class SwagDate
{

    public static String getSwagDate()
    {
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
	Date date = new Date();
	String swagDate = dateFormat.format(date);
	return swagDate;
    }
}