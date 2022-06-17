import java.util.Arrays;
import java.util.Random;

public class Main {

    public static final int ARRAY_SIZE = 50000;

    public static void main(String[] args) {
        Random random = new Random();
        int[] theArray = new int[ARRAY_SIZE];
        int[] checkArray = new int[ARRAY_SIZE];

        for(int i = 0; i < theArray.length; i++) {
            theArray[i] = random.nextInt();
        }

        System.arraycopy(theArray, 0, checkArray, 0, ARRAY_SIZE);
        System.out.println("Start user sort");
        long time = System.currentTimeMillis();
        gnomeSort(theArray);
        System.out.format("sorted: %.3f seconds\r\n", (System.currentTimeMillis()-time) / 1000d);
        System.out.println("Start java lib sort");
        time = System.currentTimeMillis();
        Arrays.sort(checkArray);
        System.out.format("sorted: %.3f seconds\r\n", (System.currentTimeMillis()-time) / 1000d);
        System.out.println("Check result");
        for(int i = 0; i < theArray.length; i++) {
            if(theArray[i] != checkArray[i]) {
                throw new RuntimeException("Error in index: "+i);
            }
        }
        System.out.println("OK");
    }

//Гномья сортировка ЖОВ
    public static void gnomeSort(int theArray[]) 
    {

            int n = theArray.length;
            for ( int index = 1; index < theArray.length; ) {
                if ( theArray[index - 1] <= theArray[index] ) {
                    ++index;
                } else {
                    int tempVal = theArray[index];
                    theArray[index] = theArray[index - 1];
                    theArray[index - 1] = tempVal;
                    --index;
                    if ( index == 0 ) {
                        index = 1;
                    }
                }
            }
    }
}