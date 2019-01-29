import java.util.*;

public class Sieve {
    public static void main(String[] args) {
        for (Integer i : Sieve.sieve(100000)) {
            System.out.println(i);
        }
    }

    static public ArrayList<Integer> sieve(int A) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        if (A == 0 || A == 1) {
            return new ArrayList<Integer>();
        }
        for (int i = 0; i <= A; i++) {
            list.add(1);
        }
        list.set(0, 0);
        list.set(1, 0);
        for (int i = 2; i < list.size(); i++) {
            if (list.get(i) == 1) {
                for (int j = 2; i * j < list.size(); j++) {
                    list.set(i * j, 0);

                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                primes.add(i);
            }
        }
        return primes;
    }

}