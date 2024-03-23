package by.itstep.javatraining.revision.test;

import by.itstep.javatraining.revision.task.*;

public class TaskTester {

    public static String RIGHT = "completed successfully. WELL DONE!!!";
    public static String WRONG = "was not running successfully. Something was WRONG!";

    private static String getResult(String task, boolean result) {
        return task + " " + (result ? RIGHT : WRONG);
    }

    public static String testingTask01() {

        boolean result = Task01.start(3, 14) == 4
                && Task01.start(4, 24) == 6
                && Task01.start(3, 20) == 6
                && Task01.start(10, 20) == 2
                && Task01.start(16, 1) == 0
                && Task01.start(3, 3) == 1
                && Task01.start(6, 20) == 3
                && Task01.start(7, 20) == 2
                && Task01.start(1, 20) == 20
                && Task01.start(0, 20) == -1
                && Task01.start(-3, 1) == -1
                && Task01.start(7, 0) == -1
                && Task01.start(7, -20) == -1;

        return getResult("Task 01", result);
    }

    public static String testingTask02() {

        boolean result = Task02.start(5, 27) == 2
                && Task02.start(2, 30) == 0
                && Task02.start(3, 1) == 1
                && Task02.start(10, 20) == 0
                && Task02.start(3, 20) == 2
                && Task02.start(3, 3) == 0
                && Task02.start(6, 20) == 2
                && Task02.start(7, 20) == 6
                && Task02.start(1, 20) == 0
                && Task02.start(0, 20) == -1
                && Task02.start(-3, 1) == -1
                && Task02.start(7, 0) == -1
                && Task02.start(7, -20) == -1;

        return getResult("Task 02", result);
    }

    public static String testingTask03() {

        boolean result = Task03.start(456) == 5
                && Task03.start(1234567) == 6
                && Task03.start(-1234567) == 6
                && Task03.start(3) == 0
                && Task03.start(-3) == 0
                && Task03.start(1000) == 0
                && Task03.start(-1000) == 0
                && Task03.start(111111) == 1
                && Task03.start(-111111) == 1
                && Task03.start(999999) == 9
                && Task03.start(-999999) == 9
                && Task03.start(90) == 9
                && Task03.start(-90) == 9
                && Task03.start(0) == 0;

        return getResult("Task 03", result);
    }

    public static String testingTask04() {

        boolean result = Task04.start(456) == 4
                && Task04.start(1234567) == 5
                && Task04.start(-1234567) == 5
                && Task04.start(3) == 0
                && Task04.start(-3) == 0
                && Task04.start(10) == 0
                && Task04.start(-10) == 0
                && Task04.start(100) == 1
                && Task04.start(-100) == 1
                && Task04.start(1000) == 0
                && Task04.start(-1000) == 0
                && Task04.start(111111) == 1
                && Task04.start(-111111) == 1
                && Task04.start(999999) == 9
                && Task04.start(-999999) == 9
                && Task04.start(0) == 0;

        return getResult("Task 04", result);
    }

    public static String testingTask05() {

        boolean result = Task05.start(1) == 2
                && Task05.start(2) == 4
                && Task05.start(3) == 4
                && Task05.start(5) == 6
                && Task05.start(18) == 20
                && Task05.start(1111) == 1112
                && Task05.start(9000) == 9002
                && Task05.start(9999) == 10000
                && Task05.start(-1) == 0
                && Task05.start(0) == 0;

        return getResult("Task 05", result);
    }

    public static String testingTaskX() {

        boolean result = TaskX.start(5, 9) == 1
                && TaskX.start(5, 8) == 2
                && TaskX.start(5, 7) == 3
                && TaskX.start(5, 6) == 4
                && TaskX.start(5, 5) == 0
                && TaskX.start(5, 4) == 1
                && TaskX.start(5, 3) == 2
                && TaskX.start(5, 2) == 3
                && TaskX.start(5, 1) == 4
                && TaskX.start(4, 20) == 0
                && TaskX.start(1, 5) == 0
                && TaskX.start(0, 20) == -1
                && TaskX.start(-3, 1) == -1
                && TaskX.start(7, 0) == -1
                && TaskX.start(7, -20) == -1;

        return getResult("Task X ", result);
    }
}
