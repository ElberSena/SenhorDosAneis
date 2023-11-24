
public class Heroi extends Personagem {


    public Heroi(String nome, String tipo, int vida, int armadura) {
        super(nome, tipo, vida, armadura);

    }

    @Override
    public int atacar(Personagem personagem, int dado) {
        int valor = personagem.armadura - dado;
        if (valor > 0){
            return valor;
        } else return - valor;

    }


    @Override
    public String toString() {
        return nome +
                " (Vida=" + vida +
                " Armadura=" + armadura + ")";
    }


}
