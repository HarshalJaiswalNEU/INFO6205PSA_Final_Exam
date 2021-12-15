public class Pell {
    public Pell() {
    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is notsupported for negative n");
//      Tried with recursion but it was never ending
//        if(n == 0)
//            return 0;
//
//        if(n == 1)
//            return 1;
//
//        return 2*get(n-1) + get(n-2);
        //without recursion
        if (n <= 2)
            return n;
        long x = 1;
        long y = 2;
        long res =0;
        for (int i = 3; i <= n; i++) {
            res = 2 * y + x;
            x = y;
            y = res;
        }
        return res;
    }
}