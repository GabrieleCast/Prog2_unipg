package progii_polimorfismo;

/**
 *
 * @author GC
 */
public class Scientifici extends Universitari
{
    int cfuTirocinio;
    public Scientifici(int cfuTirocinio, String nome, int cfu)
    {
        super(nome, cfu);
        this.cfuTirocinio = cfuTirocinio;
    }
    @Override
    public int tassaDiIscrizione() 
    {
        int tassa;
        if(cfuTirocinio>5)
            {
                tassa=(40*cfu)+200;
            }
        else
            {
                tassa=(40*cfu);
            }
        return tassa;
    }
}