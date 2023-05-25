package Ex2;

public class SegurodeVida extends Conta implements CalculodeTributos {

    @Override
    public double calcularTributo() {
        System.out.println("O valor da taxa é R$ 42");
        saldo -= 42;
        System.out.println("Seguro debitado com sucesso, seu saldo atual:");
        return saldo;
    }
}
