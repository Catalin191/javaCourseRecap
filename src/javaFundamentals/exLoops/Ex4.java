package javaFundamentals.exLoops;

//**Draw rectangle empty inside (only edges).

public class Ex4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++){
                for (int j = 0; j <= 6; j++) {
                    if ((i == 0 || i == 4) || (j == 0 || j == 6)) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
            System.out.println("");
        }

    }
}