import java.util.Random

public class MathWork {
    private static Random rnd = new Random();
 public static void main(String[] args) {
    int[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 8, 9, 9, 10 }

    }
}
private static int [] divisible (int denominator, int max) {
    int[] res = new int[max+1];
    int count = 0;
    for(int i = 0; i<=max; ++i) {
        if(i % denominator == 0) {
            res[count] = i;
            count = count +1;
        }
    }
    return trim(res, count);
}
private static int[] trim(int[] array, int length)
{
    int[] res = new int [length];
    for(int i = 0; i<length; ++i) {
        res[i] = array[i];
    }
        return res;
    }
private static void opg3b(String[] args) {
    if(args.length !=3) {
        System.out.println("Usage: java MathWork denominator max");
        return;
    }
    int denominator = Integer.parseInt(args[0]);
    int max = Integer.parseInt(args[0]);
    int[] results = divisible(denominator, max);
    for(int i = 0; i < results.length; ++i) {
        System.out.println(results[i]+ "is divisible by " + denominator);
}
private static int random(int[] arr) {
    return arr[rnd.nextInt(arr.length)];
    int denominator = Integer.parseInt(args[0]);
    int max = Integer.parseInt(args[0]);
    int[] results = divisible(denominator, max);
    for(int i = 0; i < results.length; ++i) {
        System.out.println(results[i]+ "is divisible by " + denominator);
}
}
