public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double[] array2 = {1.57, 7.654, 9.986};

        int[] myArray = new int[5];
        myArray[0] = 7;
        myArray[1] = 77;
        myArray[2] = 777;
        myArray[3] = 7777;
        myArray[4] = 77777;


        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i != array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if (i != myArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = array1.length-1; i>=0; i--) {
            System.out.print(array1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = array2.length-1; i>=0; i--) {
            System.out.print(array2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = myArray.length-1; i>=0; i--) {
            System.out.print(myArray[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 1) {
                array1[i]++;
            }
            System.out.print(array1[i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }

        }

    }