package toyStoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Store {
    private Queue <Toy> prizeToys = new PriorityQueue<>();
    private int primaryIdToy;
    private List<Toy> listAllToys = new ArrayList<>();

    public List<Toy> getAllToys() {
        return listAllToys;
    }

    public Queue <Toy> getPrizeToys() {
        return prizeToys;
    }

    public void addNewToy(Toy toy) {
        listAllToys.add(toy);
        
    }

    /**
     * создание первоначальной комплектации магазина игрушек
     */
    public void originStore() {
        Toy toy1 = new Toy(1, 5, 20, "album");
        Toy toy2 = new Toy(2, 10, 20, "ball");
        Toy toy3 = new Toy(3, 15, 20, "doll");
        Toy toy4 = new Toy(4, 3, 20, "children's car");
        Toy toy5 = new Toy(5, 8, 20, "building kit");

        Toy[] arr = new Toy[] { toy1, toy2, toy3, toy4, toy5 };
        // ArrayList<Toy> toysList = new ArrayList<>(Arrays.asList(arr));

        listAllToys = new ArrayList<>(Arrays.asList(arr));
        primaryIdToy = arr.length;  // первоначальная длина списка игрушек
    }

    /**
     * генерация случайной игрушки и числа ее выпадения 
     */
    public void addToyAndChangeWeight() {
        

        Toy toy6 = new Toy(++primaryIdToy, 3, 10 * (new Random().nextInt(8)+1), "copybook");
        Toy toy7 = new Toy(++primaryIdToy, 12, 10 * (new Random().nextInt(8)+1), "paints");
        Toy toy8 = new Toy(++primaryIdToy, 9, 10 * (new Random().nextInt(8)+1), "pencils");
        Toy toy9 = new Toy(++primaryIdToy, 4, 10 * (new Random().nextInt(8)+1), "robot");
        Toy toy10 = new Toy(++primaryIdToy, 5, 10 * (new Random().nextInt(8)+1), "car");
        
        Toy[] listToys = new Toy[] { toy6, toy7, toy8, toy9, toy10 };
        int x = new Random().nextInt(5);                         // случайный выбор игрушки
        listAllToys.add(listToys[x]);
        prizeToys.add(listToys[0]);
        

    }

    /**
     * выбор призовых игрушек
     */
    public void choiceOfPrice() {
        
        for (int i = 0; i < 4; i++) {
            int x = new Random().nextInt(listAllToys.size());
            
            
            prizeToys.add(listAllToys.get(x));         // добавление призовой игрушки в PrimaryQueue
            System.out.println(prizeToys);
            listAllToys.remove(x);                     // удаление этой игрушки из основного списка
            
        }


    }

    public void getPrice() {
        
    }

    
    
}
