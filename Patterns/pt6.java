public class pt6 {
    public static void iTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        iTriangle(5);
    }
}
// 12345
// 1234
// 123
// 12
// 1