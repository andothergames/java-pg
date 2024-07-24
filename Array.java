import java.util.Arrays;
//sdk import methods in

public class Array {
    public static void main(String[] args) {
        // make hard coded array
        int[] myArray = { 1, 2, 3, 4 };
        System.out.println(myArray);
        // make empty array to fill later but determine size
        int[] myOtherArray = new int[5];
        System.out.println(myArray[0]);
        myArray[0] = 4;
        System.out.println(myArray[0]);
        for (int i = 0; i < myOtherArray.length; i++) {
            myOtherArray[i] = i * 10;
        }
        System.out.println(Arrays.toString(myOtherArray));

        for (int x : myOtherArray) {
            System.out.println(x);
        }
    }

}
