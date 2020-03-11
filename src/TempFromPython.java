import java.util.Arrays;

public class TempFromPython {

    int[] tab;

    public int[] check(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 == 0) {
                tab[i] += 1;
            } else if (tab[i] < tab.length) {
                tab[i] += tab[tab[i]];
            }
        }
        return this.tab = tab;
    }

    @Override
    public String toString() {
        return "TempFromPython{" +
                "tab=" + Arrays.toString(tab) +
                '}';
    }
}

class test {
    public static void main(String[] args) {
        int[] a = new int[]{9, 8, 3, 1, 5, 4};
        TempFromPython temp = new TempFromPython();
        temp.check(a);
        System.out.println(temp.toString());
    }
}
