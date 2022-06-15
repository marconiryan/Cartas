import java.util.LinkedList;
import java.util.Random;

public class Baralho {
    LinkedList<Cartas> baralho;
    public Baralho(boolean baralho_completo){
        baralho = new LinkedList<>();
        if(baralho_completo){
            initBaralho();
        }
    }
    private boolean isCartaInBaralho(Cartas atual){
        for(Cartas carta: baralho){
            if(carta.getNaipe().equals(atual.getNaipe()) && carta.getNumero() == atual.getNumero()){
                return true;
            }
        }
        return false;
    }
    public void embaralhar(){
        Random random = new Random();
        for(Cartas carta: baralho){
            int numero_aleatorio =  random.nextInt(baralho.size());
            int index_atual = baralho.indexOf(carta);
            Cartas temp = baralho.get(numero_aleatorio);
            baralho.set(numero_aleatorio,carta);
            baralho.set(index_atual,temp);
        }
    }
    public void addCarta(String naipe,int numero){
        Cartas nova = new Cartas(naipe,numero);
        if(isCartaInBaralho(nova)){
            throw new RuntimeException("Essa carta ja existe no baralho!");
        }
        baralho.add(nova);
    }
    private void naipeCompleto(String naipe){
        for(int i = 1; i < 14;i++){
            baralho.add(new Cartas(naipe,i));
        }
    }
    private void initBaralho(){
        naipeCompleto("copas");
        naipeCompleto("espadas");
        naipeCompleto("ouros");
        naipeCompleto("paus");
    }
    public void printBaralho(){
        for(Cartas carta: baralho){
            switch (carta.getNumero()){
                case 1 -> System.out.printf("|As de %s|\n",carta.getNaipe());
                case 11 -> System.out.printf("|Valete de %s|\n",carta.getNaipe());
                case 12 -> System.out.printf("|Dama de %s|\n",carta.getNaipe());
                case 13 -> System.out.printf("|Rei de %s|\n",carta.getNaipe());
                default ->  System.out.printf("|%d de %s|\n",carta.getNumero(),carta.getNaipe());
           }
        }
        System.out.println("------------------------");
    }

}
