import java.util.Random;

public class Dado {

    public int dadoHeroi(){
        Random r1 = new Random();
        Random r2 = new Random();
        int maiorValor = Math.max(r1.nextInt(100),r2.nextInt(100));
        return maiorValor;
    }

    public int dadoBesta(){
        Random r = new Random();
        return r.nextInt(90);
    }
}
