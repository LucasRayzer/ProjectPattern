package observer4;

public class Website implements Observador {
    private String url;

    public void setUrl(String url) {
        this.url = url;
    }
    public String getUrl() {
        return url;
    }
    @Override
    public void lancouEdicao(Revista rev, Edicao edi) {
        System.out.println("Nome Revista: " +rev.getNome()+
        "\n"+"Numero edição"+ edi.getNumero()+"\n"+
        "Título artigo: "+edi.getArtigos());
       
       }
    
}
