package toyStoreJava;


public class Menu {

    Store store;


    public Menu(Store store) {
        this.store = store;
    }

    public void printMenu() {
        System.out.println("как будет выполняться программа: ");
        System.out.println("-------------------------------");
        System.out.println("1) Добавление новой игрушки и измениние частоты выпадения ");
        System.out.println("2) Метод выбора призовой игрушки");
        System.out.println("3) Получение призовой игрушки");
        System.out.println("----------------------------------");
    }

    public void choiceCommand(int num) {

        switch (num) {
            case 1:
                store.addToyAndChangeWeight();
                break;
            case 2:
                store.choiceOfPrice();
                break;
            case 3:
                store.getPrice();
                break;
        }
        
    }

}
