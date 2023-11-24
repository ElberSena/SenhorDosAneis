import java.util.Objects;

public abstract class Personagem {
    protected String nome;
    protected String tipo;
    protected int vida;
    protected int armadura;

    public Personagem(String nome, String tipo, int vida, int armadura) {
        this.nome = nome;
        this.tipo = tipo;
        this.vida = vida;
        this.armadura = armadura;
    }

    public abstract int atacar(Personagem personagem, int dado);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personagem that = (Personagem) o;
        return vida == that.vida && armadura == that.armadura && nome.equals(that.nome) && tipo.equals(that.tipo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, tipo, vida, armadura);
    }

}
