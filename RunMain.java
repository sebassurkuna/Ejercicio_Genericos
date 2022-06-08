import java.util.Scanner;

public class RunMain {

    public static void main(String[] args) {
        var entradaTeclado = new Scanner(System.in);
        System.out.println("Primer número: ");
        float numero1 = entradaTeclado.nextFloat();
        System.out.println("Segundo número: ");
        float numero2 = entradaTeclado.nextFloat();
        CalculadoraBasica<Float,Float> nuevaOp = new CalculadoraBasica<>();
        nuevaOp.getSuma(numero1, numero2);
        nuevaOp.getResta(numero1, numero2);
        nuevaOp.getMul(numero1, numero2);
        nuevaOp.getDiv(numero1, numero2);
    }
}