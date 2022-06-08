public class CalculadoraBasica <T,V> {
    private T elementoUno;
    private V elementoDos;

    public V getElementoDos() {
        return elementoDos;
    }

    public void setElementoDos(V elementoDos) {
        this.elementoDos = elementoDos;
    }

    public T getElementoUno() {
        return elementoUno;
    }

    public void setElementoUno(T elementoUno) {
        this.elementoUno = elementoUno;
    }

    public CalculadoraBasica(){
        elementoUno=getElementoUno();
        elementoDos=getElementoDos();
    }

    public float getSuma(T elementoUno, V elementoDos){
        return (float) elementoUno + (float) elementoDos; 
    }

    public float getResta(T elementoUno, V elementoDos){
        return (float) elementoUno - (float) elementoDos; 
    }

    public float getMul(T elementoUno, V elementoDos){
        return (float) elementoUno * (float) elementoDos; 
    }

    public float getDiv(T elementoUno, V elementoDos){
        if ((float) elementoDos ==0) {
            System.out.println("No se puede dividir entre 0!!!");
            return 0;
        }else {
            return (float) elementoUno / (float) elementoDos;
        }
         
    }

    /* , BigInteger, Byte, Double, Float, Integer, Long, and Short*/
}
