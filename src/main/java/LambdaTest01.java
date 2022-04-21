/**
 * @author jinlongfei
 * @date 2022/4/21 12:31
 */
public class LambdaTest01 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("传统写法。。。。。。");
            }
        }).start();



        new Thread(() -> System.out.println("Lambda表达式写法。。。。。。")).start();

    }
}
