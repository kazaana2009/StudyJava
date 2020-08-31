package Chap2;

public class tryCatchFinal_test {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String2");

        } catch (ClassNotFoundException e) {
            System.out.println("클래스를 찾을 수 없습니다.");
        } finally {
            System.out.println("끝");
        }


    }
}
