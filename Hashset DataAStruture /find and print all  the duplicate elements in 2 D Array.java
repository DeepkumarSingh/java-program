import java.util.HashSet;
import java.util.Scanner;

public class FindDuplicateNumbersIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number of rows and columns for the 2D array
        System.out.print("Enter the number of rows: ");
        int numRows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int numCols = sc.nextInt();
        
        // Create the 2D array based on user input
        int[][] arr = new int[numRows][numCols];
        
        System.out.println("Enter the elements of the 2D array:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        // Create a HashSet to store unique elements
        HashSet<Integer> uniqueElements = new HashSet<>();
        
        System.out.println("Duplicate elements in the 2D array are:");
        
        // Traverse the 2D array and find duplicates
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                int currentElement = arr[i][j];
                
                if (!uniqueElements.add(currentElement)) {
                    // If the element is already in the HashSet, it's a duplicate
                    System.out.println(currentElement);
                }
            }
        }
        
       // sc.close();
    }
}

