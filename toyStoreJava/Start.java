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
        for (int i = 1; i < 4; i++) {
            menu.choiceCommand(i); // выполняем команды
        }
        
    }

}
