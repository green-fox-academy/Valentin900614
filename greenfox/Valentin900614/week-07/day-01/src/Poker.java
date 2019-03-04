public class Poker {

    public static String compareHands(String hand1, String hand2){
        if (hand1.equals(hand2)){
            return "Cheat";
        }

        //"2S 3S 4S 5S 6S", "2H 3H 4H 5H 6H"

        String[] cards1 = splitHands(hand1);
        String[] cards2 = splitHands(hand2);


        if(isSequential(cards1) && isSequential(cards2)){
            return "Tie";
        } else if(isSequential(cards1)){
            return hand1;
        } else if (isSequential(cards2)){
            return hand2;
        }

        return "OK";

    }

    private static String[] splitHands(String hand){
        String[] cards = hand.split(" ");

        return cards;
    }

    private static boolean isNext(int first, int second){
        if(second == first+1){
            return true;
        } /*else if(first == '3'){
           return second == '4';
       } else if(first == '4'){
           return second == '5';
       } else if(first == '5'){
           return second == '6';
       }*/ else {
            return false;
        }
    }

    private static boolean isSequential(String[] cards){
        boolean isSequential = true;

        for (int i = 0; i < cards.length-1; i++) {

            if(!isNext(cards[i].charAt(0), cards[i+1].charAt(0))){
                isSequential = false;
            }
        }
        return isSequential;
    }

}
