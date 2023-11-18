// package Section 9 Arrays;

public class Insertion {

    static void printArray(int[] arr, int size) {
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void elementInsertion(int[] arr, int n, int index, int element) {

        for(int i = n; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = element;
    }

    static void elementDeletion(int[] arr, int size) {
        
        for(int i = 1; i < size - 1; i++) {
           arr[i] = arr[i+1];
        }
       
    }
    
    public static void main(String[] args) {
        int[] a = new int[10];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        int index = 4;
        int n = 6;
        int element = 8;

        System.out.println("\nBefore Updation");
        printArray(a, a.length);

        elementInsertion(a, n, index, element);
//        n++;

        System.out.println("\nAfter Updation");
        printArray(a, a.length);

        elementDeletion(a, a.length);
//        n--;

        System.out.println("\nAfter Deletion");
        printArray(a, a.length);


    }
}