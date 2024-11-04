package homework_38;

// Создайте отдельный класс, реализующий Comparator,
// чтобы сортировать объекты класса Sportsman по другому критерию, например, по score.

import java.util.Comparator;

public class SportsmanScoreComparator implements Comparator<Sportsman> {

// сравниваем спортсменов по баллам, от большего к меньшему
    @Override
    public int compare(Sportsman sportsman1, Sportsman sportsman2) {
        return (int) (sportsman2.getScore() - sportsman1.getScore());
    }
}
