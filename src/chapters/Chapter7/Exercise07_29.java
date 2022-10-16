package chapters.Chapter7;

public class Exercise07_29 {
    public static void main(String[] args) {
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};
        String[] pickedCards = new String[5];

        int picks = 0 ;
        while (picks < 5 ){
            picks = pickFourCardFromDeck(suits,ranks,pickedCards , picks);

        }

        printArray(pickedCards);
    }

    public static int pickFourCardFromDeck(String[] suits , String[] ranks , String[] pickedCards ,int picks){
        int card1 = (int)(Math.random() * 52 );
        int card2 = (int)(Math.random() * 52 );
        int card3 = (int)(Math.random() * 52 );
        int card4 = (int)(Math.random() * 52 );

        int sum = (card1 % 13) +  (card2 % 13) +  (card3 % 13) +  (card4 % 13) + 4 ;
        if(sum == 24 ){
            pickedCards[picks] = ranks[card1 % 13] + " of " + suits[ card1 / 13 ] + "\n"  +
                    ranks[card2 % 13] + " of " + suits[ card2 / 13 ] + "\n"  +
                    ranks[card3 % 13] + " of " + suits[ card3 / 13 ] + "\n"  +
                    ranks[card4 % 13] + " of " + suits[ card4 / 13 ] +  "\n" ;
            return ++picks;
        }else {
            return picks;
        }

    }

    public static void printArray(String[] cards ){
        for (int i = 0; i < cards.length ; i++) {

            System.out.print((i+ 1) + ". pick -------> " + cards[i]);

        }
    }
}
