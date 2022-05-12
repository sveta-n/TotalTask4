import java.util.Scanner;

public class TotalTask4 {

    private static final String HELP_WORD = "Подсказка";
    private static final String HINT = "Айтишный лук";
    private static final String RIGHT_ANSWER = "Заархивированный вирус";
    private static final String CONGRATS = "Правильно!";
    private static final String LOSE = "Обидно, приходи в другой раз";
    private static final String NEXT_TRY = "Подумай еще!";
    private static final String PUZZLE = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
    private static final String HINT_NOT_ALLOWED = "Подсказка уже недоступна";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(PUZZLE);
        String answer = scanner.nextLine();
        boolean hint = false;
        if (answer.equalsIgnoreCase(HELP_WORD)) {
            System.out.println(HINT);
            answer = scanner.nextLine();
            hint = true;
        }
        if (answer.equalsIgnoreCase(RIGHT_ANSWER)) {
            System.out.println(CONGRATS);
            System.exit(0);
        } else if (hint) {
            System.out.println(LOSE);
            System.exit(0);
        }
        System.out.println(NEXT_TRY);
        answer = scanner.nextLine();
        if (answer.equalsIgnoreCase(RIGHT_ANSWER)) {
            System.out.println(CONGRATS);
            System.exit(0);
        } else {
            if (answer.equalsIgnoreCase(HELP_WORD)) {
                System.out.println(HINT_NOT_ALLOWED);
            }
            System.out.println(NEXT_TRY);
            answer = scanner.nextLine();
        }
        if (answer.equalsIgnoreCase(RIGHT_ANSWER)) {
            System.out.println(CONGRATS);
            System.exit(0);
        } else {
            if (answer.equalsIgnoreCase(HELP_WORD)) {
                System.out.println(HINT_NOT_ALLOWED);
            }
            System.out.println(LOSE);
        }
    }
}
