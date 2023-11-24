public class Hobbit extends Heroi{
    public Hobbit(String nome, String tipo, int vida, int armadura) {
        super(nome, tipo, vida, armadura);
    }

    @Override
    public int atacar(Personagem personagem, int dado) {
        int valor;
        if (personagem.tipo.equalsIgnoreCase("Tolls")) {
            valor = personagem.armadura - (dado - (dado * 5 / 100));
        } else {
            valor =  personagem.armadura - dado;
        }
        if (valor > 0){
            return valor;
        } else return - valor;
    }
}
