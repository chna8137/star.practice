public class Star {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }


        for (int i = 6; i < 11; i++) {
            for (int j = 11; j > i; j--) {


                System.out.print("*");
            }
            System.out.println();

        }
    }
}






