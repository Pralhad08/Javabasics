import java.util.Arrays;

class Array{
    public static void main(String[] args) {
        //int[] array = new int[5];
        //array[0] = 1;
        //array [1] = 2;
        //System.out.println(Arrays.toString(array));
        int[] array = {1,5,2,4,3};
        System.out.println(array.length); // print length of array
        System.out.println(Arrays.toString(array));//print Array
        Arrays.sort(array);//sort
        System.out.println(Arrays.toString(array));

    }
}