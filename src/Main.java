public class Main {
    public static void main(String[] args) {
        System.out.println(isSquare(8));
    }

    static int isSquare(int n) {
        int sqrt = 0;
        if (n > 0) {
            for (int i = 1; i <=n; i++) {
                if (i * i == n) return 1;
            }

        }
return 0;
    }
}