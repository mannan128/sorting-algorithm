package selectionsort;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {6,3,8,2,9,4,1};

        slectionSort(arr);

        for (int x : arr){
            System.out.print(x);
        }
    }

    private static void slectionSort(int[] arr) {

        for (int x=0; x<arr.length-1; x++){
            int min = x;
            for (int y=x+1; y<arr.length; y++){
                if (arr[min] > arr[y]){
                    min = y;
                }
            }
            int temp = arr[x];
            arr[x] = arr[min];
            arr[min] = temp;
        }
    }
}
