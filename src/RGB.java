import java.util.Arrays;
public class RGB {
    void printRGB(){
        for (int i = 0;  i < 255; i++) {
            for (int j = 0; j <255 ; j++) {
                for (int k = 0; k < 255; k++) {
                    int[] rgb = {i,j,k};
                    System.out.println(Arrays.toString(rgb));
                }
                System.out.println();
            }
        }
    }
}
