package toyStoreJava;

public class Toy {
    int id,number,frequencyOfFallingOut;
    String nameToy;

    public Toy(int id, int number, int frequencyOfFallingOut, String nameToy) {
        this.id = id;
        this.number = number;
        this.frequencyOfFallingOut = frequencyOfFallingOut;
        this.nameToy = nameToy;
    }
    @Override
    public String toString() {
        
        return String.format("игрушка '%s' ",nameToy);
    }
}
