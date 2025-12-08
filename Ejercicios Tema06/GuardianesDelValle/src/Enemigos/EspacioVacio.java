package Enemigos;
/**
 * INFECTEMOS LA RED
 * 
 * Ahora vemos cómo Malware extiende sus tentáculos y expande el mal sin que 
 * nadie detecte lo que hay debajo.
 * Malware se mostrará tal y como es, pero su comportamiento variará dependiendo
 * de lo que esconda bajos sus patitas:
 * ¿Será un virus?
 * ¿Un troyano?
 * ¿Un gusano?...
 * 
 * @author Nullshade
 */
public class EspacioVacio {
    
     public static void main(String[] args) {
         
         //POLIMORFISMO
         Malware malwareNullshade;
         
         malwareNullshade = new Virus(30, "ViralHex", 99, "Exponencial", "Los bordes del Virus tiemblan en patrones hexadecimáles dejando estelas amarillas y líneas duplicadas.");
         malwareNullshade.infectar();
         malwareNullshade.propagarse();
         malwareNullshade.mutar();
         
         malwareNullshade = new Troyano(false, "ShadowCrawler", 90, "Exponencial", "Su cuerpo parpadea entre dos versiones de sí mismo.");
         malwareNullshade.mutar();
         
         malwareNullshade = new Gusano(10, "DeepWyx", 95, "Lineal", "Cuándo emerge o desaparece, el suelo del espacio vacío se deforma en un túnel espiralado que dura unos segundos.");
         malwareNullshade.mutar();
         
//         //INSTANCEOFF
//         System.out.println(malwareNullshade instanceof Malware);
//         System.out.println(malwareNullshade instanceof Virus);
//         System.out.println(malwareNullshade instanceof Troyano);
         
         if(malwareNullshade instanceof Virus){
             System.out.println("Virus");
         }else if(malwareNullshade instanceof Troyano){
             System.out.println("Troyano");
         }else if(malwareNullshade instanceof Gusano){
             System.out.println("Gusano");
         }else
             System.out.println("Tipo de malware desconocido"); 
         
     }
    
}
