package silsub5.run;

import silsub5.model.vo.Lotto;

import java.util.Arrays;


public class Run {
    public static void main(String[] args) {
        Lotto l1 = new Lotto();
        l1.information();

        //로또 자동 5게임 구매시
//        System.out.println("=== 이번주 당첨 예상 번호 ===");
//        for (int i = 0; i<5; i++){
//
//            Lotto l1 = new Lotto();
//            System.out.print(i + 1 + "번째 예상 : ");
//            l1.information();
//        }

        int[] arr = l1.getLotto();
        Arrays.toString(arr);

    }
}
