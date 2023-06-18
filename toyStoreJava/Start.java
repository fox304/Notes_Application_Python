package toyStoreJava;

public class Start {
    
    private Store store = new Store();
    private Menu menu = new Menu(store);

    public Store getStore() {
        return store;
    }
    
    public void startProgramm() {
        store.originStore();
        boolean flag = true;
        while (flag) {
            
            int a = menu.printMenu();  // выясняем номер команды
            flag = menu.choiceCommand(a); // выполняем команду
            

        }
        
    
    }

}
