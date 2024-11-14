package homework_46;
/*
Task 2
Написать метод, принимающий список из нескольких дат типа LocalDate и возвращающий количество дней
между самой ранней и поздней датами в этом списке
 */

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class DateCalculator {
    public static long daysBetweenEarliestAndLatest(List<LocalDate> dates) {
        if (dates == null || dates.isEmpty()) {
            throw new IllegalArgumentException("The list of dates cannot be null or empty.");
        }

        // Находим самую раннюю и самую позднюю даты в списке
        LocalDate earliestDate = dates.stream().min(LocalDate::compareTo).orElseThrow();
        LocalDate latestDate = dates.stream().max(LocalDate::compareTo).orElseThrow();

        // Вычисляем количество дней между самой ранней и самой поздней датами
        return ChronoUnit.DAYS.between(earliestDate, latestDate);
    }

    public static void main(String[] args) {
        // Пример использования метода
        List<LocalDate> dates = List.of(
                LocalDate.of(2024, 10, 25),
                LocalDate.of(2024, 12, 5),
                LocalDate.of(2024, 11, 15)
        );

        long daysDifference = daysBetweenEarliestAndLatest(dates);
        System.out.println("Number of days between the earliest and latest dates: " + daysDifference);
    }

}
