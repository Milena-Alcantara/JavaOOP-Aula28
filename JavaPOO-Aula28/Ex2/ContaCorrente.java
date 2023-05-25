package Ex2;

public class ContaCorrente extends Conta implements CalculodeTributos {


    @Override
    public double calcularTributo() {
        System.out.println("O valor do tributo para Conta Corrente "+(saldo*0.01));
        System.out.println("Seu saldo será: ");
        return saldo -=saldo*0.01;
    }
}
