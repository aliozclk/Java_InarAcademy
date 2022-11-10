package chapters.chapter7;

public class Exercise07_24 {
    public static void main(String[] args) {

        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};


        boolean[] suitControl = new boolean[4];
        int numOfPicks = 0 ;
        while (!allSuitsHere(suitControl)){
            int pickedCard = (int)( Math.random() * 52) ;
            String suit = suits[pickedCard / 13];
            suitControl[pickedCard / 13 ] = true;
            String rank = ranks[pickedCard % 13];
            System.out.println(rank + " of " + suit);
            numOfPicks++;
        }
        System.out.println("Number of picks: " + numOfPicks);


    }
    public static boolean allSuitsHere(boolean[] array){
        return array[0] && array[1] && array[2] && array[3];
    }
}
