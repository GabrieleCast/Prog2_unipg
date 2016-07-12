package progii_polimorfismo;

/**
 *
 * @author GC
 */
public class Main 
{
    public static void main(String[] args)
    {
        Umanistici x=new Umanistici(10,"Carlo",10);
        Scientifici y=new Scientifici(10,"Massimo",10);
        Segreteria s=new Segreteria(10,20);
        
        System.out.println(x.nome+" biblioteche: "+x.biblioteche+" cfu: "+x.cfu+" tassa: "+x.tassaDiIscrizione());
        System.out.println(y.nome+" Tirocinio "+y.cfuTirocinio+" cfu: "+y.cfu+" tassa: "+y.tassaDiIscrizione());
        
        System.out.println("Metodo Array: "+s.who(2));

    }
}
