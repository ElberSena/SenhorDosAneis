public class Orque extends Besta{
    public Orque(String nome, String tipo, int vida, int armadura) {
        super(nome, tipo, vida, armadura);
    }

    @Override
    public int atacar(Personagem personagem, int dado) {
        int valor = (personagem.armadura - (personagem.armadura * 10 / 100)) - dado;
        if (valor > 0){
            return valor;
        } else return - valor;
    }
}
