public class WarehouseManagement {

    public static void main(String[] args) {

        
        int[] stock = {50, 20, 75, 30, 20, 90, 50, 60};

        
        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int quantity : stock) {
            if (quantity > max) {
                max = quantity;
            }
            if (quantity < min) {
                min = quantity;
            }
            total += quantity;
        }

        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + total);

        
        System.out.println("\nDuplicate Quantities:");
        boolean foundDuplicate = false;

        for (int i = 0; i < stock.length; i++) {
            for (int j = i + 1; j < stock.length; j++) {
                if (stock[i] == stock[j]) {
                    System.out.println(stock[i]);
                    foundDuplicate = true;
                    break;
                }
            }
        }

        if (!foundDuplicate) {
            System.out.println("No duplicates found.");
        }

        
        int k = 3;

        rotateArray(stock, k);

        System.out.println("\nStock Array after Rotation by " + k + " positions:");

        for (int item : stock) {
            System.out.print(item + " ");
        }

        
        int[][] shelf = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\n\nOriginal Shelf Grid:");

        printMatrix(shelf);

        int[][] transpose = transposeMatrix(shelf);

        System.out.println("\nTransposed Shelf Grid:");

        printMatrix(transpose);
    }

    
    public static void rotateArray(int[] arr, int k) {

        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    
    public static int[][] transposeMatrix(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    
    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}