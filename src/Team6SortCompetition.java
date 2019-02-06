public class Team6SortCompetition extends SortCompetition {
    @Override
    public int challengeOne(int[] arr) {
        SortingMethods.mergeSort(arr);
        int medium = SortingUtil.intMedian(arr);

        return medium;
    }

    @Override
    public int challengeTwo(String[] arr, String query) {
        SortingMethods.mergeSort(arr);
        int index = SortingUtil.biSearchStr(arr, query);

        return 0;
    }

    @Override
    public int challengeThree(int[] arr)
    {
        SortingMethods.insertionSort(arr);
        int medium = SortingUtil.intMedian(arr);

        return medium;
    }

    @Override
    public int challengeFour(int[][] arr) {
        return 0;
    }

    @Override
    public int challengeFive(Comparable[] arr, Comparable query) {
        return 0;
    }

    @Override
    public String greeting() {
        return null;
    }
}
