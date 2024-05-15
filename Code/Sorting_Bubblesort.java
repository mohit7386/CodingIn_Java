
//Sorting array using bubble sort technique 
import java.util.*;

public class Sorting_Bubblesort {
    public static void printArray(int arr[], int size) {
        System.out.println("Sorted elements of the array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();

    }
    // In this technique we are comparing the elements of first position and second
    // postion and check it any one is largest then swap

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Traverse the each element of the arraya and checking the largest number
        for (int i = 0; i < arr.length; i++) { // i is for counting second loop is for do calculations perofrm
                                               // action
                                               // and sort the array
            for (int j = 0; j < arr.length - 1 - i; j++) { // for checking and swaping the elements of the array if they
                                                           // are in the wrong order till
                                                           // the second last element in the java and we are minus i
                                                           // because j ke saath i bhi increment hoga aur last element
                                                           // ki position change karega
                if (arr[j] > arr[j + 1]) {
                    // if the first element is greater then the first element then we are swapping
                    // both the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr, size); // calling the function
        sc.close();
        // Time Complexity of a bubble sort is O(n^2) -> Because of nested loops..

    }

}
