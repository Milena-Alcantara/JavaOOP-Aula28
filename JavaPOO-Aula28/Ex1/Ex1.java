package Ex1;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o tipode lâmpada que deseja criar");
        System.out.println("1 - Incandescente \t 2- Fluorescente");
        System.out.println(FabricaLampada.construirLampada(input.nextInt()));





    }
}
