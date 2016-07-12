package progii_polimorfismo;
/**
 *
 * @author GC
 */
public abstract class  Universitari
{
   String nome;
   int cfu;
   
    public Universitari(String nome, int cfu) 
    {
        this.nome = nome;
        this.cfu = cfu;
    }
    
    public abstract int tassaDiIscrizione();
   
}
