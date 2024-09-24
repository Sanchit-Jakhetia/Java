public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5, 2, 4, 6, 1, 3};
        selectionSort(array);
        System.out.println("Sorted array:");
        for (int val : array) {
            System.out.print(val + " ");
        }
    }
    static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }
}
