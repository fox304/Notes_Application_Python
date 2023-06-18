package toyStoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store {
    private List<Toy> listAllToys = new ArrayList<>();

    public List<Toy> getAllToys() {
        return listAllToys;
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
    }

}
