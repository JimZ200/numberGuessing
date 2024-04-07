package JimsPackage;

public class Cards {

    private int finalResult;

    public Cards(){
        this.finalResult = 0;
    }

    public int getFinalResult(){
        return finalResult;
    }
    public void setFinalResult(int finalResult){
        this.finalResult = finalResult;
    }
    public void updateResult(int[][] a){
        this.finalResult += a[0][0];
    }

    int[][] cardSets1 = {{32,33,34,35,36,37,38,39},
                        {40,41,42,43,44,45,46,47},
                        {48,49,50,51,52,53,54,55},
                        {56,57,58,59,60,61,62,63}};

    int[][] cardSets2 = {{16,17,18,19,20,21,22,23},
                        {24,25,26,27,28,29,30,31},
                        {48,49,50,51,52,53,54,55},
                        {56,57,58,59,60,61,62,63}};

    int[][] cardSets3 = {{8,9,10,11,12,13,14,15},
                        {24,25,26,27,28,29,30,31},
                        {40,41,42,43,44,45,46,47},
                        {56,57,58,59,60,61,62,63}};

    int[][] cardSets4 = {{4,5,6,7,8,12,13,14,15},
                        {20,21,22,23,28,29,30,31},
                        {36,37,38,39,44,45,46,47},
                        {52,53,54,55,60,61,62,63}};

    int[][] cardSets5 = {{2,3,6,7,10,11,14,15},
                        {18,19,22,23,26,27,30,31},
                        {34,35,38,39,42,43,46,47},
                        {50,51,54,55,58,59,62,63}};

   int[][] cardSets6 = {{1,3,5,7,9,11,13,15},
                        {17,19,21,23,25,27,29,31},
                        {33,35,37,39,41,43,45,47},
                        {49,51,53,55,57,59,61,63}};

    public void print(){
        System.out.println("In the game Y reps yes and N rep no; no need for uppercase lowercase also works");
        System.out.println("Pick a number between 0-63");
        System.out.println("After picking a number enter yes");
    }

    public void printMessage(){
        System.out.println("Is the number you picked in this set ?");
    }

    public void printCard(int[][] list){
        for (int[] i: list) {
            for(int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void printMessageAndCards(int[][] list){
        printMessage();
        printCard(list);
    }
    public void valid(){
        System.out.println("Enter a valid option: yes");
    }

    public void printFinalMessage(int num){
        System.out.println("The number you picked is: " + num);
        System.out.println("Pick another one and enter 'yes' or enter 'done' to exit");
        setFinalResult(0);
    }

}
