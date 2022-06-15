public class Main {
    public static void main(String[] args) {
        Baralho baralho_completo = new Baralho(true);
        try{
            baralho_completo.addCarta("copas",10);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        baralho_completo.printBaralho();
        baralho_completo.embaralhar();
        baralho_completo.printBaralho();
        System.out.println("-------------------------");
        Baralho novo_baralho = new Baralho(false);
        novo_baralho.addCarta("copas",1);
        novo_baralho.addCarta("copas",2);
        novo_baralho.addCarta("copas",3);
        novo_baralho.addCarta("copas",7);
        novo_baralho.addCarta("copas",8);
        novo_baralho.printBaralho();
        novo_baralho.embaralhar();
        novo_baralho.printBaralho();

    }
}
