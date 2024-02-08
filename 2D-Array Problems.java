
# input /output for 2D array 
import java.util.*;
public class twoDarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the Size of Rows and Columns :");
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int [rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Matrix is ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

    }
}

OUTPUT :
Enter the Size of Rows and Columns :
3
3
1 2 3
4 5 6
7 8 9
The Matrix is
1 2 3
4 5 6
7 8 9

# Searching a key element in 2D array 
import java.util.*;
public class twoDarray {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the Size of Rows and Columns :");
        int rows=sc.nextInt();
        int col=sc.nextInt();
        int arr[][]=new int [rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter the Element for searching : ");
        int key=sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==key){
                    System.out.println("Element is present in index "+ i+","+j);
                }
            }
           
        }

    }
}
OUTPUT:
Enter the Size of Rows and Columns :
2
3
1 2 3
4 5 6
Enter the Element for searching : 6
Element is present in index 1,2

#
