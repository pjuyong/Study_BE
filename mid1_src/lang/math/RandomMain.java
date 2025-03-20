package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random(1); // seed가 같으면 Random의 결과가 같다.

        int randomInt = random.nextInt();
        System.out.println(randomInt);

        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10); //  0~9까지 출력
        System.out.println("0 - 9 : " + randomRange1);

        int randomRange = random.nextInt(10) + 1;
        System.out.println("1 - 10 : " + randomRange);
    }
}
