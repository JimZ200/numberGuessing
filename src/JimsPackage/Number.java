package JimsPackage;
import java.util.Scanner;
public class Number {
    public void guessingGame() {
        Scanner in = new Scanner(System.in);
        Cards cards = new Cards();

        cards.print();
        while (in.hasNext()) {

            String option = in.next();

            if (option.equalsIgnoreCase("yes")) {
                cards.printMessageAndCards(cards.cardSets1);
                String message = in.next();

                if (message.equalsIgnoreCase("y")) {
                    cards.updateResult(cards.cardSets1);

                }
                in.nextLine();

                cards.printMessageAndCards(cards.cardSets2);
                String message2 = in.next();
                if (message2.equalsIgnoreCase("y")) {
                    cards.updateResult(cards.cardSets2);

                }

                cards.printMessageAndCards(cards.cardSets3);
                String message3 = in.next();
                if (message3.equalsIgnoreCase("y")) {
                    cards.updateResult(cards.cardSets3);

                }

                cards.printMessageAndCards(cards.cardSets4);
                String message4 = in.next();
                if (message4.equalsIgnoreCase("y")) {
                    cards.updateResult(cards.cardSets4);

                }

                cards.printMessageAndCards(cards.cardSets5);
                String message5 = in.next();
                if (message5.equalsIgnoreCase("y")) {
                    cards.updateResult(cards.cardSets5);

                }

                cards.printMessageAndCards(cards.cardSets6);
                String message6 = in.next();
                if (message6.equalsIgnoreCase("y")) {
                    cards.updateResult(cards.cardSets6);

                }

                cards.printFinalMessage(cards.getFinalResult());

            } else if (option.equals("done")) {
                cards.exit();
                break;

            } else {
                cards.valid();
            }

        }

        in.close();
    }
}



//}