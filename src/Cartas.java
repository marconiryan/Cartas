public class Cartas {
    private final String naipe;
    private final int numero;

    
    public Cartas(String naipe, int numero){
        this.naipe = setNaipe(naipe);
        this.numero = setNumero(numero);
    }
    private String setNaipe(String naipe){
        naipe = naipe.toLowerCase();
        boolean isNaipe = naipe.equals("copas") || naipe.equals("espadas") || naipe.equals("ouros") || naipe.equals("paus");
        if(!isNaipe){
            throw new RuntimeException("Naipe Inválido");
        }
        return naipe;
    }
    private int setNumero(int numero){
        if(numero <=0 || numero >=14){
            throw new RuntimeException("Numero Inválido");
        }
        return numero;
    }
    public String getNaipe() {
        return naipe;
    }

    public int getNumero() {
        return numero;
    }
}
