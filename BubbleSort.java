public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        bubbleSort(array);
        
        System.out.println("Sorted array:");
        for (int val : array) {
            System.out.print(val + " ");
        }
    }
    static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
