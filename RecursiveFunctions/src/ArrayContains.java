import java.util.Arrays;

/*
    Given an array of ints, compute recursively if the array contains somewhere a value
    followed in the array by that value times 10. We’ll use the convention of considering
    only the part of the array that begins at the given index. In this way, a recursive call
    can pass index+1 to move down the array. The initial call will pass in index as 0.
 */
public class ArrayContains
{
    static boolean arrayContains(int[] arr, int index)
    {
        // System.out.println("Index: " + index);
        // System.out.println("Array Length: " + (arr.length - 1));

        // As we are increasing the index we have to check if it is greater or equal to array length - 1 to avoid a stack overflow
        if(index >= arr.length - 1){
            return false;
        } else {
            // Checks if next index in array is 10 times greater than current, return true
            if (arr[index] * 10 == arr[index + 1]){
                return true;
            } else {
                // else increment index and check the next two elements in array
                return arrayContains(arr,  ++index
                );
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arrayofIntsTestTrue = {1, 2, 3, 30, 5};
        System.out.println("Testing True Case");
        System.out.println("Array: " + Arrays.toString(arrayofIntsTestTrue));
        System.out.println(arrayContains(new int[]{1, 2, 3, 30, 5}, 0));


        System.out.println("\nTesting False Case");
        int[] arrayofIntsTestFalse = {1, 2, 3, 20, 5};
        System.out.println("Array: " + Arrays.toString(arrayofIntsTestFalse));
        System.out.println(arrayContains(arrayofIntsTestFalse, 0));
    }
}
