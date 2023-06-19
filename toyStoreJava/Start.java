package toyStoreJava;

public class Start {
    
    private Store store = new Store();
    private Menu menu = new Menu(store);

    public Store getStore() {
        return store;
    }
    
    public void startProgramm() {
        menu.printMenu();
        store.originStore();
        for (int i = 1; i < 5; i++) {
            menu.choiceCommand(i); // выполняем команды
        }
        System.out.println();
        System.out.println("Выпадение призовых игрушек записано в файл");
        System.out.println();
        
    }

}
