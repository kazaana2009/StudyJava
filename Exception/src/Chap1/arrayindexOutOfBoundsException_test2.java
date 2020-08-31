package Chap1;

public class arrayindexOutOfBoundsException_test2 {
    public static void main(String[] args) {
        if (args.length == 2) {
            String data1 = args[0];
            String data2 = args[1];

            System.out.println("args[0] :" + data1);
            System.out.println("args[1] :" + data2);
        } else {
            System.out.println("테스트 실행");
            System.out.println("테스트 실행1");
            System.out.println("테스트 실행2");
        }
    }
}
