import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }
        System.out.println("before:");
        print(numbers);

        Quicksort(numbers, 0, numbers.length -1);

        System.out.println("\nafter:");
        print(numbers);
    }


    public static void Quicksort(int numbers[], int left, int right)
    {
        int pivot = numbers[left];

        int i = left;
        int j = right;
        int aux;

        while(i<j)
        {
            while (numbers[i] <= pivot && i < j)
                i++;

            while (numbers[j] > pivot)
                j--;

            if (i<j)
            {
                aux = numbers[i];
                numbers[i]= numbers[j];
                numbers[j]=aux;
            }
        }
        numbers[left] = numbers[j];
        numbers[j] = pivot;

        if (left < j-1)
            Quicksort(numbers,left,j-1);

        if (j+1 < right)
            Quicksort(numbers,j+1,right);
    }

    public static void print(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

}