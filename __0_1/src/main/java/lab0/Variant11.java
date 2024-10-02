package lab0;

public class Variant11 {

    // 1. Integer Task: Сума і добуток цифр тризначного числа
    public int[] integerNumbersTask(int number) {
        assert number >= 100 && number <= 999 : "Number must be three digits";
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        int sum = hundreds + tens + units;
        int product = hundreds * tens * units;
        return new int[]{sum, product};
    }

    // 2. Boolean Task: Перевірка однакової парності чисел A і B
    public boolean booleanTask(int A, int B) {
        return (A % 2 == B % 2);
    }

    // 3. If Task: Присвоєння нових значень змінним A і B
    public int[] ifTask(int A, int B) {
        if (A != B) {
            int max = Math.max(A, B);
            return new int[]{max, max};
        } else {
            return new int[]{0, 0};
        }
    }

    // 4. Case Task: Локатор і повороти
    public enum DIRECTION {
        NORTH, WEST, SOUTH, EAST
    }

    public DIRECTION switchTask(char initial, int N1, int N2) {
        DIRECTION[] directions = DIRECTION.values();
        int start = switch (initial) {
            case 'C' -> 0;
            case 'З' -> 1;
            case 'Ю' -> 2;
            case 'В' -> 3;
            default -> throw new IllegalArgumentException("Invalid initial direction");
        };

        int finalPos = (start + N1 + N2 + 4) / 4;
        return directions[finalPos];
    }

    // 5. For Task: Сума квадратів чисел
    public int forTask(int N) {
        int sum = 0;
        for (int i = N; i <= 2 * N; i++) {
            sum += i * i;
        }
        return sum;
    }

    // 6. While Task: Найменше K, для якого сума більша за N
    public int[] whileTask(int N) {
        int sum = 0;
        int K = 0;
        while (sum < N) {
            K++;
            sum += K;
        }
        return new int[]{K, sum};
    }

    // 7. Array Task: Виведення елементів масиву з номерами, кратними K
    public int[] arrayTask(int[] array, int K) {
        return java.util.stream.IntStream.range(0, array.length)
                .filter(i -> (i + 1) % K == 0)
                .map(i -> array[i])
                .toArray();
    }

    // 8. Matrix Task: Виведення матриці по черзі
    public int[] matrixTask(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        int[] result = new int[M * N];
        int index = 0;
        for (int i = 0; i < M; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < N; j++) {
                    result[index++] = matrix[i][j];
                }
            } else {
                for (int j = N - 1; j >= 0; j--) {
                    result[index++] = matrix[i][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Variant11 task execution.");
    }
}
