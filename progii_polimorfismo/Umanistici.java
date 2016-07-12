
package progii_polimorfismo;

/**
 *
 * @author GC
 */
public class Umanistici extends Universitari
{
    int biblioteche;
    public Umanistici(int biblioteche, String nome, int cfu) {
        super(nome, cfu);
        this.biblioteche = biblioteche;
    }
    @Override
    public int tassaDiIscrizione() 
    {
        int tassa;
        tassa=(50+cfu)+(10*biblioteche);
        return tassa;
    }
    
}
