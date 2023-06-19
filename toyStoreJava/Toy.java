package toyStoreJava;

public class Toy implements Comparable<Toy>{
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
        
        return String.format("\t игрушка: %s,\n\t id: %s,\n\t частота выпадения: %s,\n\t кол-во игрушек = %s.\n",
                                nameToy,id,frequencyOfFallingOut,number);
    }
    @Override
    public int compareTo(Toy o) {                                            // сравнение по частоте выпадения
        return Integer.compare(o.frequencyOfFallingOut, this.frequencyOfFallingOut);  
    }
}
