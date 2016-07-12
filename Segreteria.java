package progii_polimorfismo;
//import java.util.Random;IMPORTANTE IMPORTARE PER RANDOMIZZARE EVENTUALI VARRIABILI BOOLEAN vedi commenti con*

/**
 *
 * @author GC
 */
public class Segreteria 
{
Universitari [] V;//vettore V di tipo Universitari per ereditare scientifici e umanistici

    public Segreteria(int n, int m) 
    {
     V=new Universitari[n+m]; //costruttore del vettore
     //Random r=new Random();IMPORTATO SOPRA* 
     
     for(int i=0; i<n; i++)//per "i" volte
     {
         V[i]=new Umanistici((int)(Math.random()*10),"Umanistico "+i,(int)(Math.random()*20));
         //riempie il vettore con un oggetto di classe Umanistici con dati generati a caso Math.random()
         //OGNI CICLO "i" VIENE INCREMENTATO (per natura del for), E IL VETTORE VIENE RIEMPITO OGNI VOLTA
         //IN POSIZIONE "i", PERTANTO LA POSIZIONE NEL VETTORE VERRà INCREMENTATA INSIEME AL FOR.
     }
    for(int i=0; i<n+m; i++)
    {
         V[i]=new Scientifici(/*r.nextBoolean()*/(int)(Math.random()*20),"Scientifico "+i,(int)(Math.random()*20));//se la variabile dovesse essere un random boolean*
    }
    }//fine metodo costruttore

    Segreteria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   public int who(int x)//dato il parametro x
   {
       int minTax=0;
       for(int i=0; i<V.length; i++)//per tutta la lunghezza del vettore --> V.length
       {
           if(V[i].cfu>x)//se l'oggetto in posizione "i" ha da sostenere più cfu del parametro x
           {
               minTax++;//allora incrementa minTaz
           }
       }
       return minTax;//riporto minTax e vedo quanti hanno sotenuto meno cfu di quelli indicati dalla x
   }
}
