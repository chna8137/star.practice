public class Dia {

        public static void main(String[] args) {

            for (int i = 0; i < 4; i++) {
                for(int s = i; s < 3; s++)
                    System.out.print(" ");
                for (int k = 0; k <= i*2; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            for (int i = 5; i < 8; i++) {
                for(int c = 10-i; c < 6; c++)
                    System.out.print(" ");
                for (int j = 15; j > i*2; j--) {
                    System.out.print("*");
                }
                System.out.println();

            }
        }
    }




