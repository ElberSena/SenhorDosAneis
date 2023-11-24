public class Elfo extends Heroi{
    public Elfo(String nome, String tipo, int vida, int armadura) {
        super(nome, tipo, vida, armadura);
    }


    @Override
    public int atacar(Personagem personagem, int dado) {
        int valor;
        if (personagem.tipo.equalsIgnoreCase("Orques")) {
           valor = personagem.armadura - (dado + 10);
            } else {
            valor = personagem.armadura - dado;
        }
        if (valor > 0){
            return valor;
        } else return - valor;
    }
}
