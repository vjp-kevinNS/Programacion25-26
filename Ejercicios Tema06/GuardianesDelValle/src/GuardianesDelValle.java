
/**
 *
 * @author KevinNS
 */
public class GuardianesDelValle {


    public static void main(String[] args) {
        
        //Creamos el objeto. Creamos a Hack-man como Héroe
        Heroe hackman = new Heroe("Hack-man", 100, "Leer código como si fuese una corriente de energía y detectar vulnerabilidades en el mundo real.");
        System.out.println(hackman);
        System.out.println(hackman.getHabilidad());
        System.out.println("");
        //System.out.println(hackman.toString());
        
        //Creamos a Logkeep Sentinal
        Heroe logkeepSentinal = new Heroe("Logkeep Sentinal", 100, "Puede ver huellas fantasma de los eventos pasado en la red. Donde otros ven datos, él ve escenas.");
        System.out.println(logkeepSentinal);
        System.out.println(logkeepSentinal.getHabilidad());
        System.out.println("");
        //System.out.println(logkeepSentinal.toString());
        
        //Creamos a Firewalla
        Heroe firewalla = new Heroe("Firewalla", 100, "Levanta barreras que bloquean entidades corruptas, redirige ataques y encapsula amenazas.");
        System.out.println(firewalla);
        System.out.println(firewalla.getHabilidad());
        System.out.println("");
        //System.out.println(firewalla.toString());
        
        //Creamos a Pulse
        Heroe pulse = new Heroe("Pulse", 100, "Detecta anomalías antes de que orurra el ataque, es capaz de predecir movimientos de Nullshade y anticipar cual será el siguiente objetivo.");
        System.out.println(pulse);
        System.out.println(pulse.getHabilidad());
        System.out.println("");
        //System.out.println(pulse.toString());
        
        //Creamos a Patcher
        Heroe patcher = new Heroe("Patcher", 100, "Reescribe código dañado sin perder la esencia original");
        System.out.println(patcher);
        System.out.println(patcher.getHabilidad());
        System.out.println("");
        //System.out.println(patcher.toString());
        
        //Creamos a Rootcall
        Heroe rootcall = new Heroe("Roocall", 100, "Puede despertar procesos ancestrales, activar defensas ocultas y desatar funciones profundas no documentadas.");
        System.out.println(rootcall);
        System.out.println(rootcall.getHabilidad());
        System.out.println("");
        //System.out.println(rootcall.toString());
        
    }
    
}
