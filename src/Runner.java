public class Runner {
    public static void main(String[] args){
        SortCompetition team6 = new Team6SortCompetition();
        int[] randIntArr = randomIntsArr(10000);
        String[] randSringArr = randomStringArr(10000, 5);
        System.out.println("unsorted");
        printArr(randIntarr);

        long time = System.currentTimeMillis();
        int median = team6.challengeOne(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals; " + median);

        System.out.println("Sorted");
        printArr(randIntArr);
    }
}
