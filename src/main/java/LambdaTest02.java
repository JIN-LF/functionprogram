import sun.tools.jstat.Operator;

import java.util.function.IntBinaryOperator;

/**
 * @author jinlongfei
 * @date 2022/4/21 12:31
 */
public class LambdaTest02 {

    public static void main(String[] args) {
        //alt+enter可以切换内部类和lambda表达式
        int i = calculateNum(new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left + right;
            }
        });
        System.out.println("传统写法--->"+i);


        int i1 = calculateNum((int left, int right) -> {return left + right;});
        int i2 = calculateNum(Integer::sum);
        System.out.println("Lambda表达式写法--->"+i1);
        System.out.println("Lambda表达式写法2--->"+i2);

    }

    public static int calculateNum(IntBinaryOperator operator){
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a, b);
    }
}
