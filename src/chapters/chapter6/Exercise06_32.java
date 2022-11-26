package chapters.chapter6;

public class Exercise06_32 {
    public static void main(String[] args) {
        int winCount = 0;
        int count = 0;
        while (count <= 10_000) {
            int dice1 = diceRoll();
            int dice2 = diceRoll();

            int diceSum = dice2 + dice1;

            System.out.println("You rolled :" + dice1 + " + " + dice2 + " = " + diceSum);
            if (isCraps(diceSum)) {
                lose();
            } else if (isNatural(diceSum)) {
                win();
                winCount++;

            } else {
                dice2 = diceRoll();
                dice1 = diceRoll();
                System.out.println("Point is " + diceSum);
                System.out.println("You rolled :" + dice1 + " + " + dice2 + " = " + (dice1 + dice2));
                if (diceSum == dice2 + dice1) {
                    win();
                } else {
                    lose();
                }
            }

            count++;
        }
        System.out.println("Number of win : " + winCount);
    }
    public static int diceRoll(){

        return (int) (Math.random() * 7 );
    }

    public static boolean isCraps(int num){
        return num == 2 || num == 3 || num == 12 ;
    }

    public static boolean isNatural(int num){
        return num == 7 || num == 11;
    }

    public static void win(){
        System.out.println("You win.");
    }
    public static void lose(){
        System.out.println("You lose.");
    }
}
