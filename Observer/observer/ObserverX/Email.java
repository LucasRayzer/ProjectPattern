package ObserverX;

public class Email implements Observer{
    public void gravar (){
        System.out.println("gravaa");
    }

    @Override
    public void mudouA(int a) {
        System.out.println("Ó  " + a );
    }
}
