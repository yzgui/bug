package basic.array;

public class ArrayDemo {
    public int getSum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += i;
        }
        return sum;
    }
}
