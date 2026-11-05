public class loopingNumber2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i += 1) {
            if (i % 2 == 0){
                System.out.print(i);
            }
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
