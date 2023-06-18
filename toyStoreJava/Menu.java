package toyStoreJava;


public class Menu {

    Store store;


    public Menu(Store store) {
        this.store = store;
    }

    public int printMenu() {
        System.out.println("-------------------------------");
        System.out.println("1) Добавление новой игрушки и измениние частоты выпадения ");
        System.out.println("2) Метод выбора призовой игрушки");
        System.out.println("3) Получение призовой игрушки");
        System.out.println("----------------------------------");
        System.out.println("Сделайте свой выбор");
        int num = Errors.err();
        return num;

    }

    public boolean choiceCommand(int num) {
        boolean flag = true;

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
            case 4:
                System.out.println("Работа программы закончена");
                flag = false;

        }
        return flag;
        
    }

}
