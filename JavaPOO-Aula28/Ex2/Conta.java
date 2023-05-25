package Ex2;

import java.util.Scanner;

public class Conta {
    protected double saldo;
    public Conta(){
        this.saldo = 1000;
    }
    public static void decisao(){
        Scanner input = new Scanner(System.in);
        System.out.println("Informe a opção desejada");
        System.out.println("1- Conta Poupança \t 2- Conta Corrente \t 3- Seguro de Vida");

        switch (input.nextInt()){
            case 1:
            ContaPoupança contaPoupa = new ContaPoupança();
            contaPoupa.verificarPoupança();
            break;

            case 2:
            ContaCorrente contaUser = new ContaCorrente();
                System.out.println(contaUser.calcularTributo());
                break;

            case 3:
                System.out.println("Deseja contratar o Seguro de Vida?\n 1- Sim \t 2- Não");
                if (input.nextInt() == 1){
                    SegurodeVida novoSegurado = new SegurodeVida();
                    System.out.println(novoSegurado.calcularTributo());
                }else {
                    System.out.println("Seguro não contratado.");
                }
                break;

            default:
                System.out.println("Inválido");
                System.exit(0);

        }


}
}
