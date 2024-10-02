package lab0;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Variant11Test {

    public static final double EPS = 0.0000001;

    // 1. Integer Task: Тест на тризначне число
    @Test(dataProvider = "integerProvider")
    public void testIntegerNumbersTask(int input, int[] expected) {
        assertEquals(new Variant11().integerNumbersTask(input), expected);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][] {
                {123, new int[]{6, 6}},
                {456, new int[]{15, 120}},
                {789, new int[]{24, 504}}
        };
    }

    // 2. Boolean Task: Тест на перевірку парності
    @Test(dataProvider = "booleanProvider")
    public void testBooleanTask(int A, int B, boolean expected) {
        assertEquals(new Variant11().booleanTask(A, B), expected);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] {
                {4, 8, true},
                {3, 7, true},
                {2, 5, false}
        };
    }

    // 3. If Task: Тест на порівняння A і B
    @Test(dataProvider = "ifProvider")
    public void testIfTask(int A, int B, int[] expected) {
        assertEquals(new Variant11().ifTask(A, B), expected);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][] {
                {5, 10, new int[]{10, 10}},
                {3, 3, new int[]{0, 0}},
                {7, 2, new int[]{7, 7}}
        };
    }

    // 4. Case Task: Тест на локатор і повороти
    @Test(dataProvider = "switchProvider")
    public void testSwitchTask(char initial, int N1, int N2, Variant11.DIRECTION expected) {
        assertEquals(new Variant11().switchTask(initial, N1, N2), expected);
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][] {
                {'C', 1, -1, Variant11.DIRECTION.WEST},
                {'З', 2, 0, Variant11.DIRECTION.WEST},
                {'Ю', -1, -1, Variant11.DIRECTION.WEST}
        };
    }

    // 5. For Task: Тест на суму квадратів чисел
    @Test(dataProvider = "forProvider")
    public void testForTask(int N, int expected) {
        assertEquals(new Variant11().forTask(N), expected);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][] {
                {3, 86},
                {5, 355},
                {1, 5}
        };
    }

    // 6. While Task: Тест на найменше K і суму
    @Test(dataProvider = "whileProvider")
    public void testWhileTask(int N, int[] expected) {
        assertEquals(new Variant11().whileTask(N), expected);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][] {
                {10, new int[]{4, 10}},
                {15, new int[]{5, 15}},
                {21, new int[]{6, 21}}
        };
    }

    // 7. Array Task: Тест на виведення елементів масиву
    @Test(dataProvider = "arrayProvider")
    public void testArrayTask(int[] array, int K, int[] expected) {
        assertEquals(new Variant11().arrayTask(array, K), expected);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][] {
                {new int[]{1, 2, 3, 4, 5, 6}, 2, new int[]{2, 4, 6}},
                {new int[]{10, 20, 30, 40, 50}, 3, new int[]{30}},
                {new int[]{5, 10, 15, 20}, 4, new int[]{20}}
        };
    }

    // 8. Matrix Task: Тест на виведення матриці по черзі
    @Test(dataProvider = "matrixProvider")
    public void testMatrixTask(int[][] matrix, int[] expected) {
        assertEquals(new Variant11().matrixTask(matrix), expected);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        return new Object[][] {
                {new int[][]{{1, 2}, {3, 4}}, new int[]{1, 2, 4, 3}},
                {new int[][]{{5, 6, 7}, {8, 9, 10}}, new int[]{5, 6, 7, 10, 9, 8}}
        };
    }
}
