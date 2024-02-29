package ObserverX;

public class Main {
    public static void main(String[] args) {

        Observada obsA = new Observada();
        Bd conecta =  new Bd();
        Email envia = new Email();

        //não esquecer esta parte, de anexar!

        obsA.anexar(conecta);
        obsA.anexar(envia);
        obsA.setA(10);
    }
}
