public class Runner {
    public static void main(String[] args){
        SortCompetition team6 = new Team6SortCompetition();
        int[] randIntArr = SortingUtil.randomIntsArr(50000);

        String[] randSringArr = SortingUtil.randomStringArr(10000, 5);

        System.out.println("unsorted");
        SortingUtil.printArray(randIntArr);

        long time = System.currentTimeMillis();

        int median = team6.challengeOne(randIntArr);

        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.001 + " Seconds");
        System.out.println("Median equals; " + median);

        System.out.println("Sorted");
        SortingUtil.printArray(randIntArr);
    }
}
