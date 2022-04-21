import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/**
 * @author jinlongfei
 * @date 2022/4/21 12:31
 */
public class LambdaTest03 {

    public static void main(String[] args) {
        printNum(value -> value%2==0);

    }

    public static void printNum(IntPredicate predicate){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i : arr) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }
}
