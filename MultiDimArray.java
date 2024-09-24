class MultiDimArray {
    public static void main(String args[]) {
        //declaring and initializing 2D array
        int arr[][] = new int[][]{{1, 2, 5}, {2, 4, 3}, {4, 4, 4}};

        System.out.println("The Multi-Dimension Array is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}