
import java.util.Scanner;
import java.util.Random;
public static Scanner cin = new Scanner(System.in);
public static Random random = new Random();

public static int getArraySize (){
    System.out.println("Please enter size for your array:");
    int size= cin.nextInt();
    while (size<1){
        System.out.println("array size can not be less than 0!! try again:");
        size= cin.nextInt();
    }
    return size;
}
public static int[] getArray (int size){
        int[] array= new int[size];
        for (int i = 0; i< array.length;i++){
            System.out.println("Pleas enter element of array №"+i);
            array[i]=cin.nextInt();
        }
        return array;
    }
public static int[] getRandomArray (int size){
    int[] array= new int[size];
    for (int i = 0; i< array.length;i++){
        array[i]= random.nextInt();
    }
    return array;
}
public static void arrayOutput (int[] array){
    System.out.println("Here is your array :\n");
    System.out.println(Arrays.toString(array));
}
public static int arraySum (int[] array){
    int sum=0;
    for (int i = 0; i< array.length;i++){
        sum += array[i];
    }
    return sum;
}
public static void arrayLargest (int []array){
    int largest=array[0];
    for (int i = 1; i< array.length;i++){
        if (largest<array[i]){
            largest=array[i];
        }
    }
    System.out.println("Here is your Largest number in array :"+largest);
}
static void main(String[] args)  {

    int size=getArraySize();
    int[] user_array = getArray(size);
    arrayOutput(user_array);

    System.out.println("Sum of your array:"+arraySum(user_array));
    arrayLargest(user_array);


    int randSize = getArraySize();
    int[] rand_arr= getRandomArray(randSize);
    arrayOutput(rand_arr);

    System.out.println("Sum of your array:"+arraySum(rand_arr));
    arrayLargest(rand_arr);


}
