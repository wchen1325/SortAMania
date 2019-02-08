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

        return index;
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
        int[] medians = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            SortingMethods.mergeSort(arr[i]);
            medians[i]= SortingUtil.intMedian(arr[i]);
        }
        SortingMethods.mergeSort(medians);
        System.out.println("sorted medians of array.");
        SortingUtil.printArray(medians);
        int arrMedium = SortingUtil.intMedian(medians);
        return arrMedium;
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
