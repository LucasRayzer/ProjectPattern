package observer4;

public class main {
    public static void main(String[] args) {

        Assinante A1 = new Assinante("A1","1");
        Assinante A2 = new Assinante("A2","1");
        Assinante A3 = new Assinante("A3","1");
        Assinante A4 = new Assinante("A4","1");
    
        Website web = new Website();
        
        Artigo Ar1 = new Artigo("Ar1");
        Artigo Ar2 = new Artigo("Ar2");
        Artigo Ar3 = new Artigo("Ar3");
        Artigo Ar4 = new Artigo("Ar4");
        Artigo Ar5 = new Artigo("Ar5");
        
        Edicao r1e = new Edicao(1);
        r1e.adicionarArtigo(Ar1);
        r1e.adicionarArtigo(Ar2);
        r1e.adicionarArtigo(Ar3);

        Revista r1 = new Revista("R1");
        r1.anexar(A1);
        r1.anexar(A2);
        r1.anexar(web);

        Edicao r2e = new Edicao(2);
        r2e.adicionarArtigo(Ar4);
        r2e.adicionarArtigo(Ar5);
       
        Revista r2 = new Revista("R2");
        r2.anexar(A3);
        r2.anexar(A4);
        r2.anexar(web);

       
        A1.lancouEdicao(r1, r1e);

        web.lancouEdicao(r1, r1e);
        web.lancouEdicao(r2, r2e);
    }
  
}
