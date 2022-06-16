//Гномья сортировка ЖОВ
public class Main
{
    public void gnomeSort(int theArray[]) {

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


    /* Вспомогательная функция для вывода на экран массива размера n */
    static void printArray(int theArray[])
    {
        int n = theArray.length;
        for (int i=0; i<n; ++i)
            System.out.print(theArray[i]+" ");
        System.out.println();
    }

    // Управляющая программа
    public static void main(String args[])
    {
        int theArray[] = {12, 11, 13, 5, 6, 7};
        int n = theArray.length;

        Main ob = new Main();
        ob.gnomeSort(theArray);

        System.out.println("Отсортированный массив выглядит так:");
        printArray(theArray);
    }
}