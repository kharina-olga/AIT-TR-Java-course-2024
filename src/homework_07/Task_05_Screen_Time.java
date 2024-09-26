package homework_07;
/*
Task 5 * (Опционально)
Используйте оператор switch для решения задачи:

Ваш ребенок принес оценку за контрольную работу по математике. В школе 12-балльная система. Запишите в переменную случайное число от 0 до 12.

Вы разрешаете ребенку смотреть телевизор не более 60 минут в день. На сегодня у него осталось 45 минут.

Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
Оценка от 7 до 9 баллов: похвалите ребенка и добавьте 45 минут.
Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
Оценка 3 балла: огорчитесь и вычтите 30 минут.
Оценка меньше 3 баллов: запретите телевизор на сегодня.
Выведите на экран оставшееся время для просмотра ТВ.

P.S. Проконтролируйте, чтобы ребенок не смотрел ТВ больше 60 минут в день.
 */

import java.util.Random;

public class Task_05_Screen_Time {

    public static void main(String[] args) {

            // генерируем оценку
            Random random = new Random();
            int mark = random.nextInt(0, 12);  //Запишите в переменную случайное число от 0 до 12.
            System.out.println("Today I got " + mark + "! " + "How long can I watch cartoons?");
            //   int timeForTV = 45; // На сегодня у него осталось 45 минут.

            // some test code
            // генерируем оставшееся время на сегодня
            int screenTime = random.nextInt(0, 60);
            System.out.println("I have " + screenTime + " minutes left for the screen time for today.");

            // выбираем вариант согласно условиям
            switch (mark) {
                // Если оценка от 10 до 12 баллов: скажите ребенку, как вы рады, и добавьте к оставшемуся времени 1 час.
                case 10, 11, 12: {
                    System.out.println("Good job!");
                    screenTime = screenTime + 60;
                    break;
                }
                case 7, 8, 9: {
                    System.out.println("Good job!");
                    screenTime = screenTime + 45;
                    break;
                }
                // Оценка от 4 до 6 баллов: нейтрально отнеситесь и добавьте 15 минут.
                case 4, 5, 6: {
                    System.out.println("Good!");
                    screenTime = screenTime + 15;
                    break;
                }
                // Оценка 3 балла: огорчитесь и вычтите 30 минут
                case 3: {
                    System.out.println("Very bad!");
                    screenTime = screenTime - 30;
                }
                break;

                // Оценка меньше 3 баллов: запретите телевизор на сегодня.
                case 2, 1, 0: {
                    System.out.println("Very bad!");
                    screenTime = 0;
                }
                break;
            }

            if (screenTime <= 60 && screenTime > 0) {
                System.out.println("You can watch TV " + screenTime + " minutes.");
            } else if (screenTime <= 0 ) {
                screenTime = 0;
                System.out.println("Sorry, but you are not allowed to watch TV today.");
            } else {
                screenTime = 60;
                System.out.println("You can watch TV " + screenTime + " minutes.");
            }

    } // end of main

} // end of class
