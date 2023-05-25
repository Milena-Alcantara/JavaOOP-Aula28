package Ex1;

public class Incandescente implements Lamapada {


    @Override
    public String ligar() {
        return "Lampada ligada - ON";
    }

    @Override
    public String desligar() {
        return "Lâmpada desligada - OFF";
    }
}
