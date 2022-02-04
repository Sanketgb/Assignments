class BubbleSort{

    public static int[] bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

public class Assignment1Q8 {
    public static void main(String args[]) {
        
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};

        System.out.println("Array before sorting :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
        int newarr[]= BubbleSort.bubbleSort(arr);
        
        System.out.println("\n\nArray after sorting :");
        for(int i=0;i<newarr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}