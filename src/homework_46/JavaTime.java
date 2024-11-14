package homework_46;
/*
Task 1
Получить и вывести на экран:
текущую дату
текущий год, месяц и день
Создать дату, например Ваш день рождения и вывести на экран
Создать две даты и проверить на равенство
Получить и вывести на экран:
текущее время
текущее время + 3 часа
Создать дату:
которая на неделю позже сегодняшней
которая была на год раньше сегодняшней используя метод minus
которая на год позже сегодняшней
tomorrow и yesterday и проверить находятся ли они до или после сегодняшней
 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class JavaTime {

    public static void main(String[] args) {

        System.out.println("*********** Получить и вывести на экран текущую дату ***************");
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);

        System.out.println("*********** Получить и вывести на экран текущий год, месяц и день ***************");
        System.out.println("Year: " + today.getYear() + "\nMonth: " + today.getMonth() + "\nDay: " + today.getDayOfMonth());

        System.out.println("*********** Создать дату, например Ваш день рождения и вывести на экран ***************");
        LocalDate birthday = LocalDate.of(1989, 5, 6);
        System.out.println("My birthday is: " + birthday);

        System.out.println("*********** Создать две даты и проверить на равенство (Я посчитаю количество дней до моего дня рождения ***************");

        // Определяем дату следующего дня рождения
        LocalDate nextBirthday = LocalDate.of(today.getYear(), birthday.getMonth(), birthday.getDayOfMonth());

        // Если день рождения уже прошел в этом году, берем следующий год
        if (today.isEqual(birthday)) {
            System.out.println("Today is My Birthday!!!");
        } else {

            System.out.println("Sorry, your Birthday is not today.");
        }
        if (today.isAfter(nextBirthday)) {
            nextBirthday = nextBirthday.plusYears(1);
            // Вычисляем количество дней до следующего дня рождения
            long daysUntilBirthday = ChronoUnit.DAYS.between(today, nextBirthday);
            System.out.println("Days left until the next birthday: " + daysUntilBirthday);
        }
        System.out.println("*********** Получить и вывести на экран:\n" +
                "        текущее время\n" +
                "        текущее время + 3 часа ***************");

        LocalTime time = LocalTime.now(); // возвращает текущее время
        System.out.println("Now is " + time);
        System.out.println("Time in 3 hours is " + time.plusHours(3));


        System.out.println("*********** Создать дату, которая на неделю позже сегодняшней ***************");
        LocalDate date1 = today.plusWeeks(1);
        System.out.println("That is one week after today: " + date1);

        System.out.println("*********** Создать дату, которая была на год раньше сегодняшней используя метод minus ***************");
        LocalDate date2 = today.minusYears(1);
        System.out.println("That is one year before today: " + date2);

        System.out.println("*********** Создать дату, которая на год позже сегодняшней ***************");
        LocalDate date3 = today.plusYears(1);
        System.out.println("That is one year after today: " + date3);

        System.out.println("*********** Создать дату: tomorrow и yesterday и проверить находятся ли они до или после сегодняшней ***************");
        LocalDate tommorow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);
        System.out.println("Today: " + today);
        System.out.println("Tomorrow: " + tommorow);
        System.out.println("Yesterday: " + yesterday);
        if (tommorow.isAfter(today)){
            System.out.println("Tomorrow is after today.");
        }
        if (yesterday.isBefore(today));
        System.out.println("Yesterday is before today.");


    }
}
