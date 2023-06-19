package toyStoreJava;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Store {
    private Queue <Toy> prizeToys = new PriorityQueue<>(); 
    private int primaryLengthToy;
    private List<Toy> listAllToys,outputPrizeToys = new ArrayList<>();

    public List<Toy> getAllToys() {
        return listAllToys;
    }

    public Queue <Toy> getPrizeToys() {
        return prizeToys;
    }

    /**
     * создание первоначальной комплектации магазина игрушек
     */
    public void originStore() {
        Toy toy1 = new Toy(1, 3, 30, "альбомы");
        Toy toy2 = new Toy(2, 1, 40, "мячи");
        Toy toy3 = new Toy(3, 4, 20, "куклы");
        Toy toy4 = new Toy(4, 3, 60, "машинки");
        Toy toy5 = new Toy(5, 2, 80, "конструкторы");

        Toy[] arr = new Toy[] { toy1, toy2, toy3, toy4, toy5 };
    
        System.out.printf("1) Добавляем 5 видов игрушек в первоначальный список! Это %s, %s, %s, %s, %s !\n",
                                    toy1.getNameToy(),toy2.getNameToy(),toy3.getNameToy(),toy4.getNameToy(),toy5.getNameToy());
        listAllToys = new ArrayList<>(Arrays.asList(arr));
        primaryLengthToy = arr.length;  // первоначальная длина списка игрушек
    }

    /**
     * генерация случайной игрушки и числа ее выпадения 
     */
    public void addToyAndChangeWeight() {
        
        // частота выпадения игрушек случайно генерируется от 10% до 80% кратно десяти  

        Toy toy6 = new Toy(++primaryLengthToy, 3, 10 * (new Random().nextInt(8)+1), "тетради");
        Toy toy7 = new Toy(++primaryLengthToy, 4, 10 * (new Random().nextInt(8)+1), "фломастеры");
        Toy toy8 = new Toy(++primaryLengthToy, 2, 10 * (new Random().nextInt(8)+1), "карандаши");
        Toy toy9 = new Toy(++primaryLengthToy, 2, 10 * (new Random().nextInt(8)+1), "роботы");
        Toy toy10 = new Toy(++primaryLengthToy, 1, 10 * (new Random().nextInt(8)+1), "пластилин");
        
        Toy[] listToys = new Toy[] { toy6, toy7, toy8, toy9, toy10 };

        for (Toy toy : listToys) { // добавляем 5 видов игрушек в основной массив
            listAllToys.add(toy);
        
        }
        
        System.out.printf("   Добавляем еще пять видов игрушек!Это %s, %s, %s, %s, %s !\n",
                            toy6.getNameToy(),toy7.getNameToy(),toy8.getNameToy(),toy9.getNameToy(),toy10.getNameToy());
        
    }

    /**
     * выбор призовых игрушек
     */
    public void choiceOfPrice() {
        
        for (int i = 0; i < 4; i++) { // добавление 4х видов игрушек в призовой сектор случайным образом
            int x = new Random().nextInt(listAllToys.size());
            prizeToys.add(listAllToys.get(x)); // добавление призовой игрушки в PrimaryQueue

            listAllToys.remove(x); // удаление этой игрушки из основного списка  
        }

        System.out.println();
        System.out.println("2) В призовой сектор добавлено 4 вида игрушек! Это :");

        for (Toy toy : prizeToys) {
            System.out.println(toy);
        }

    }

    /**
     * получение призовой игрушки
     */
    public void getPrice() {
        System.out.println("3) Теперь разыграем игрушки в соответствии с их частотой выпадения");
        System.out.println("-----------------------------------------------------------------");
        while (!prizeToys.isEmpty()) {

            Toy toy = prizeToys.peek();
            System.out.printf("  Выпала: \n  ############################ \n%s\n  ############################ ", toy);

            outputPrizeToys.add(toy);   // упаковываем все кол-во призовых игрушек для вывода в файл

            if (toy.getNumber() > 1) {

                toy.setNumber(toy.getNumber()-1); //                  удаляем одну игрушку с конкретной категории
                System.out.printf("   Осталось  %s призовых игрушек %s !\n", toy.getNumber(), toy.getNameToy());
            } else {

                prizeToys.poll(); //                    удаляем всю категорию 
                System.out.printf("   Больше не осталось  призовых игрушек %s !\n", toy.getNameToy());
            }
        }
    }
    
    /**
     * запись в файл
     * @param toy - выпадающая игрушка
     */
    public void writeToFile() {
        try (FileWriter wr = new FileWriter("prizeToys.txt", false)) {
            for (Toy toy : outputPrizeToys) {
                wr.write(toy.toString());
                wr.append('\n');
            }
            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
