import java.util.List;
import java.util.ArrayList;

public class p2 {
    public static List<Integer> hailstoneSequence(int n) {
        List<Integer> list = new ArrayList<Integer>();

        while (n != 1) {
            list.add(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        list.add(n); // 把最后一个1加入列表
        return list;
    }

    public static void main(String[] args) {
        System.out.println(hailstoneSequence(6));
        
    }
}