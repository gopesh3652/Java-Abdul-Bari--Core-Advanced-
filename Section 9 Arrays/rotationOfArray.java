// left rotation of array

public class rotationOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int temp = arr[0];
        System.out.println("\nArray before rotation : ");
        // printArray(arr, arr.length);
        for (int k : arr) {
            System.out.print(k + "\t");
        }
        System.out.println();
        
        // int n = 9;
        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                arr[arr.length-1] = temp;
            }
            else {
                arr[i] = arr[i+1];
            }
        }
        System.out.println("\nArray after rotation : ");
        // printArray(arr, arr.length);
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        System.out.println();
    }
}