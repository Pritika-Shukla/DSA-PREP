public class factotial {
    static void func(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) { 
            fact *= i;
        }
        System.out.println(fact);
    }
    public static void main (String args[]){
        func(5);
    }
}
