package toyStoreJava;


public class Programm {

    public static void main(String[] args) {
        Start start = new Start();
        start.startProgramm();
        System.out.printf("основной список:%s, призовой: %s",
                                    start.getStore().getAllToys(),
                                    start.getStore().getPrizeToys());
        


    }
}
