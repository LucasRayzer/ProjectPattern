package observer4;

public class Assinante implements Observador{
    private String nome;
    private String endereco;

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public Assinante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    @Override
    public void lancouEdicao(Revista rev, Edicao edi) {
        System.out.println("Nome assinante: "+nome+"\n"+"Nome Revista: " +rev.getNome()+
        "\n"+"Numero edição"+ edi.getNumero());
       
    }
    
    
}
