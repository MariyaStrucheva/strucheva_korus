package common;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.Period;

@UtilityClass
public class AgeHelper {

    /**
     * Возвращает true если 18 лет, false - меньше 18 лет
     *
     * @param birthdayStr - строка с датой рождения в формате "yyyy-MM-dd"
     * @return
     */
    public static boolean isEighteenYears(String birthdayStr) {
        LocalDate birthdayDate = LocalDate.parse(birthdayStr);
        LocalDate currentDate = LocalDate.now();

        return Period.between(birthdayDate, currentDate).getYears() >= 18;
    }
}
