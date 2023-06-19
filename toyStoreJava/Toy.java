package toyStoreJava;

public class Toy implements Comparable<Toy>{
    private int id,number,frequencyOfFallingOut;
    private String nameToy;

    public int getId() {
        return id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public int getFrequencyOfFallingOut() {
        return frequencyOfFallingOut;
    }

    public String getNameToy() {
        return nameToy;
    }



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
