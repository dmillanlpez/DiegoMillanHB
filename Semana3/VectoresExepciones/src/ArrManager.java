public class ArrManager {

    // Constructor
    public ArrManager(int tamanyo){
        this.arr = new int[tamanyo];
    }

    public void add(int valor){
        arr[arr.length -1] = valor;
    }

    public int get(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index > arr.length){
            throw new IndexOutOfBoundsException("El indice que has introducido es invalido --> " + index);
        }
        return arr[index];
    }

    // Atributo
    private int [] arr;
}
