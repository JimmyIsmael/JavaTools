package encriptacion;

/**
 *
 * @author jipena
 */
public class ClaseEncriptacion {
    
    public static String EncriptarTexto (String texto){
     /*Declaro las variables matematicas a usar */
     int multiplicador=6;double base=2;double exponente=2;
     
     /*Se convierte en un arreglo de caracteres */
     char[] aCaracteres = texto.toCharArray();
     
      for(int i=0;i<aCaracteres.length;i++)
           {
               //System.out.println("antes Enc");
               //System.out.println((int)aCaracteres[i]);
               float mult=aCaracteres[i]*(char)multiplicador;
               float div=mult/(char)(Math.pow(base, exponente)); 
               int redondeado=(Math.round(div));
                aCaracteres[i]=(char)(redondeado); 
                System.out.println("Redondeado Encriptado "+redondeado);
                 //System.out.println("Desp Enc");
               //System.out.println((int)aCaracteres[i]);
           }
            String encriptado =String.valueOf(aCaracteres);
 
     return encriptado;
        
    }
    
    public static String DesncriptarTexto (String texto){
        
        /*Declaro las variables matematicas a usar */
     int multiplicador=6;double base=2;double exponente=2;
     
     
     /*Se convierte en un arreglo de caracteres */
     char[] aCaracteres = texto.toCharArray();
     
      for(int i=0;i<aCaracteres.length;i++)
           {
               //System.out.println("Antes Des");
               //System.out.println((int)aCaracteres[i]);
               
               int redondeado=(Math.round(
                        (aCaracteres[i]*(char)(Math.pow(base, exponente))/(char)multiplicador)
                        ));   
               aCaracteres[i]=(char)(redondeado);
               System.out.println("Redondeado Desncriptado "+redondeado);
                //System.out.println("Despues Des");
               //System.out.println((int)aCaracteres[i]);
           }
            String desencriptado =String.valueOf(aCaracteres);
 
     return desencriptado; 
    }

    
}
