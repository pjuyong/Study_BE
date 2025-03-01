package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // 인스턴스 생성을 막음
    }

    public static int sum(int[] array) {
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
             arraySum += array[i];
        }
        return arraySum;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int startMin = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < startMin) {
                startMin = array[i];
            }
        }
        return startMin;
    }

    public static int max(int[] array) {
        int startMax = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > startMax) {
                startMax = array[i];
            }
        }
        return startMax;
    }
}
