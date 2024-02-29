package ObserverX;

public class Bd implements Observer{

    public void enviar (String analise){
        System.out.println(analise);
    }

    @Override
    public void mudouA(int a) {
        System.out.println("gravou no banco, "+a);
    }

}
