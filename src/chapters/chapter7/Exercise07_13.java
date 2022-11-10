package chapters.chapter7;

public class Exercise07_13 {
    public static void main(String[] args) {
        int[] numbers = new int[54];
        for (int i = 0; i < numbers.length + 10; i++) {
            int num = getRandom(numbers);
            numbers[num - 1] = num;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
        }

    }

    public static int getRandom(int... numbers) {
        int rand = 0;
        for (int i = 0; i < numbers.length; i++) {
            rand = (int) (Math.random() * 54) + 1;
            if (numbers[rand - 1] == 0) {
                return rand;

            }

        }

        return rand;

    }
}
