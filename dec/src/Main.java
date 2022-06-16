import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Dec dec = new Dec();
        for(int i=0;i<10;i++){
            dec.pushFront(null);
        }

        Random rnd = new Random();

        System.out.println("Пустые элементы" + dec._items);

        while(!dec.isFull()){
            if(dec.popBack() == null){
                dec.pushFront(rnd.nextInt(10));
            }
        }

        System.out.println("Элементы" + dec._items);

        System.out.println("Количество " + dec.Count);

        for(int i=0;i<dec.Count;i++){
            System.out.println("Элемент "+ i +" :" + dec._items.get(i));
        }
    }
}