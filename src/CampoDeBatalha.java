import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CampoDeBatalha {
    public static List<Heroi> herois = new ArrayList<>();
    public static List<Besta> bestas = new ArrayList<>();
    public static Dado dado = new Dado();
    public static int cont = 1;


    public static void removerHeroi (String removerHeroi){

        Iterator<Heroi> it = herois.iterator();
        while (it.hasNext()){
            Heroi i = it.next();
            if (i.getNome().equalsIgnoreCase(removerHeroi)){
                it.remove();
            }
        }
    }
    public static void removerBesta ( String removerBesta){

        Iterator<Besta> it = bestas.iterator();
        while (it.hasNext()){
            Besta i = it.next();
            if (i.getNome().equalsIgnoreCase(removerBesta)){
                it.remove();
            }
           // bestas.add(i);
        }
    }

    public static void main(String[] args) {

        herois.add(new Elfo ("Legolas", "Elfo", 150, 30));
        herois.add(new Humano("Aragon", "Humano", 150, 50));

        bestas.add(new Orque("Lutz", "Orques", 200, 60));
        bestas.add(new Troll("Ugluk", "Troll", 120, 30));

        do {

            System.out.println("Turno " + cont );

            for (int i = 0; i < herois.size() && i < bestas.size(); i++) {

                int valorDadoH = dado.dadoHeroi();
                int valorDadoB = dado.dadoBesta();
                int ataqueH = herois.get(i).atacar(bestas.get(i), valorDadoH);
                int ataqueB = bestas.get(i).atacar(herois.get(i), valorDadoB);

                System.out.println("Luta entre " + herois.get(i).toString() + " e " +
                        bestas.get(i).toString());

                System.out.println(" " + herois.get(i).nome + " saca " +
                        valorDadoH + " e tira " + ataqueH + " de vida a " + bestas.get(i).nome);
                bestas.get(i).setVida(bestas.get(i).vida - ataqueH);
                if (bestas.get(i).vida <= 0) {
                    System.out.println("Morre o " + bestas.get(i).tipo + " " + bestas.get(i).nome);
                    CampoDeBatalha.removerBesta(bestas.get(i).nome);
                    if (bestas.size() == 0) {
                        System.out.println(" *** VITÓRIA DOS HÉROIS *** ");
                        break;
                    }
                    continue;
                }

                System.out.println(" " + bestas.get(i).nome + " saca " +
                        valorDadoB + " e tira " + ataqueB + " de vida a " + herois.get(i).nome);
                herois.get(i).setVida(herois.get(i).vida - ataqueB);
                if (herois.get(i).vida <= 0) {
                    System.out.println("Morre o " + herois.get(i).tipo + " " + herois.get(i).nome);
                    CampoDeBatalha.removerHeroi(herois.get(i).nome);
                    if (herois.size() == 0) {
                        System.out.println(" *** VITÓRIA DAS BESTAS ***");
                        break;
                    }
                }
            }
            cont ++;
        }while (herois.size() > 0 &&  bestas.size() > 0);
    }

}
