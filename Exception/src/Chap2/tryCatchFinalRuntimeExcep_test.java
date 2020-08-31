package Chap2;

public class tryCatchFinalRuntimeExcep_test {
    public static void main(String[] args) {
        String data1 =null;
        String data2 =null;

        try {
            data1 = args[0];
            data2 = args[1];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("오류 : "+e);
        }
    }
}
