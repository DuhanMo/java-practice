package silsub5.model.vo;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Lotto {
    private int[] lotto = new int[6];

    {
        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int) (Math.random() * 45 + 1);

            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }


        }
        Arrays.sort(lotto);

    }

    public Lotto() {
    }

    public int[] getLotto() {
        return lotto;
    }

    public void setLotto(int[] lotto) {
        this.lotto = lotto;
    }

    public void information() {

        for (int value : lotto) {
            System.out.print(value + " ");
        }
        System.out.println();

    }
}
