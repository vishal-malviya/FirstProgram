package array;

public class ShallowCopy {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] arr2 = arr;//shallow copy same address
        int[] arr3 = new int[arr.length];//deep copy diff address
    }
}
