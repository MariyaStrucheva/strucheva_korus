package common;

import org.apache.commons.lang3.time.DateUtils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class AgeHelperTests {

    @DataProvider
    public Object[][] birthdays() {
        Date currentDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        return new Object[][]{
                {dateFormat.format(DateUtils.addYears(currentDate, -60)), true},
                {dateFormat.format(DateUtils.addYears(currentDate, -18)), true},
                {dateFormat.format(DateUtils.addYears(currentDate, -17)), false},
                {dateFormat.format(currentDate), false},
        };
    }

    @Test(dataProvider = "birthdays")
    public void testIsEighteenYears(String birthDate, boolean expectedResult) {
        Assert.assertEquals(AgeHelper.isEighteenYears(birthDate), expectedResult);
    }

    @Test(expectedExceptions = DateTimeParseException.class)
    public void testIsEighteenYearsThrowsParseException() {
        AgeHelper.isEighteenYears("18.09.2012");
    }

}
