package Ex1;

public class FabricaLampada {
    public static String construirLampada(int opcao){
        switch (opcao){
            case 1:
               Incandescente lampadaNova = new Incandescente();
               return "Lâmpada criada"+ "\n" + lampadaNova.ligar() + "\n" + lampadaNova.desligar();


            case 2:
                Fluorescente lampadaNew = new Fluorescente();
                return "Lâmpada criada"+ "\n" + lampadaNew.ligar() + "\n" + lampadaNew.desligar();

            default:
               return "Tipo inválido";
        }

    }


}
