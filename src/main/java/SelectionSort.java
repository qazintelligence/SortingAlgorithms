import java.util.Random;

public class SelectionSort {
    public static void main(String a[]){
        Random rand = new Random();
        int[] arr1 = new int[6];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = rand.nextInt(1000);
        }
        System.out.println("before:");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        selectionSort(arr1);

        System.out.println("after:");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }


}