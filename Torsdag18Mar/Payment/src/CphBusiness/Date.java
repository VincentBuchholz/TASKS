package CphBusiness;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Date {
    LocalDateTime myDate;
    DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public String getTimeNow() {
        myDate = LocalDateTime.now();
        String formattedDate = myDate.format(myDateFormat);
        return formattedDate;
    }

}
