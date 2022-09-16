import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        int firstWeight = weights[0];
        int secondWeight = weights[1];
        int thirdWeight = weights[2];
        System.out.println(Arrays.toString(weights));


        double[] doubleValues = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(doubleValues));

        int[] speeds = new int[] {10, 20, 40, 70, 110};
        System.out.println(Arrays.toString(speeds));

        int[] reverse = new int[weights.length];
        int count = 0;
        for (int i = 1; i <= weights.length; i++) {
            reverse[count++] = weights[weights.length - i];
        }
        System.out.println(Arrays.toString(reverse));


        int length = 0;
        for (double element : doubleValues)
        {
            length++;
        }
        for (int i = length - 1; i >= 0; i--)
        {
            System.out.print(doubleValues[i] + ", ");
        }


        for(int u=0, j = 1; u<weights.length; u++){
            if( weights[u]%2 ==0) {
                System.out.println(weights[u]);
            }  else {
                System.out.println(weights[u] + j);
            }

        }



        }

    }