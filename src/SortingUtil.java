public class SortingUtil {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void swap(double[] arr, int i, int j){
        double temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void swap(String[] arr, int i, int j){
        String temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }





    public static int[] randIntArr(int count){
        int[] arr = new int[count];
        for(int i = 0; i<arr.length;i++){
            arr[i] = (int)(Math.random() * 10001);
        }
        return arr;
    }

    public static double[] randDoubleArr(int count, double max){
        double[] arr = new double[count];
        for(int i = 0; i<arr.length;i++){
            arr[i] = Math.random() * max;
        }
        return arr;
    }

    public static String[] randomStringArr(int num, int length){

        String [] arr = new String [num];
        while (num > 0)
        {

            int i = 0;
            String s = "";
            while (i < length)
            {

                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }





    public static int[] copyIntArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        for(int i = 0; i<arr.length;i++){
            arr1[i]=arr[i];
        }
        return arr1;
    }

    public static double[] copyDoubleArray(double[] arr) {
        double[] arr1 = new double[arr.length];
        for(int i = 0; i<arr.length;i++){
            arr1[i]=arr[i];
        }
        return arr1;
    }

    public static boolean checkSum(int[] before, int[] after){
        int bSum=0;
        int aSum=0;
        /*if (!(before.length==after.length)){
            return false;
        }*/
        for(int i =0; i <before.length -1; i++){
            bSum=bSum+before[i];
            aSum=aSum+after[i];
        }
        return(aSum==bSum);
    }

    public static boolean checkSum(double[] before, double[] after){
        double bSum=0;
        double aSum=0;
        /*if (!(before.length==after.length)){
            return false;
        }*/
        for(int i =0; i <before.length -1; i++){
            bSum=bSum+before[i];
            aSum=aSum+after[i];
        }
        return(aSum==bSum);
    }





    public static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(double[] arr){
        for(int i = 0; i < arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }


    public static boolean isSorted(String[] arr){
        for(int i = 0; i < arr.length-1; i++){
            if (arr[i].compareTo(arr[i+1]) > 0){
                return false;
            }
        }
        return true;
    }






    public static void printArray(int[] arr){
        String str ="";
        for (int i = 0; i<arr.length;i++){
            str=str + String.valueOf(arr[i]) + ", ";
        }
        System.out.println(str);
    }

    public static void printArray(double[] arr){
        String str ="";
        for (int i = 0; i<arr.length;i++){
            str=str + String.valueOf(arr[i]) + ", ";
        }
        System.out.println(str);
    }

    public static void printArray(String[] arr){
        String str ="";
        for (int i = 0; i<arr.length;i++){
            str=str + arr[i] + ", ";
        }
        System.out.println(str);
    }


}
