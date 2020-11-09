package subneteo;

import static java.lang.Float.parseFloat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class CheckUp {

    boolean status = false;
    float subNewV = 0.0f; // primer sub validación
    int subNew = 0;
    // regex
    Matcher ipMatcher, subMatcher,maho;
    Pattern ipPattern, subPattern,paho;
    boolean varho = true;
    
    // Octetos clasificación
    String[] octetos;
    String octeto1, octeto2, octeto3, octeto4;
    int long1, long2, long3, long4;

    public CheckUp() {

    }

    public boolean checkUpIp(String ipAdress) {
        System.out.println("IP recibida en checkUP " + ipAdress);
        ipPattern = Pattern.compile("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$");
        ipMatcher = ipPattern.matcher(ipAdress);

        if (ipMatcher.matches()) {

            status = true;
            octetos = ipAdress.split("\\.");

            octeto1 = String.valueOf(octetos[0]);
            long1 = Integer.valueOf(octeto1);

            octeto2 = String.valueOf(octetos[1]);
            long2 = Integer.valueOf(octeto2);

            octeto3 = String.valueOf(octetos[2]);
            long3 = Integer.valueOf(octeto3);

            octeto4 = String.valueOf(octetos[3]);
            long4 = Integer.valueOf(octeto4);

            if (long1 > 255 || (long1 != 0 && long2 != 0 && long3 != 0 && long4 != 0)) {
                JOptionPane.showMessageDialog(null, "IP fuera de rango o inválida", "IP inválida", 0);
                status = false;
            }

        } else {
            System.out.println("else 3");
            JOptionPane.showMessageDialog(null, "IP fuera de rango o inválida", "IP inválida", 0);
            status = false;
        }

        return status;
    }

    public boolean checkUpSub(String noSubredes) {

        subPattern = Pattern.compile("[0-9]{1,3}");
        subMatcher = subPattern.matcher(noSubredes);

        if (subMatcher.matches()) {
            status = true;
            subNewV = Float.parseFloat(noSubredes);
            subNew = Math.round(subNewV);

            if (subNew <= 0 || subNew > 128) {

                JOptionPane.showMessageDialog(null, "No se pueden generar ese número de subredes", "ERROR", 0);
                status = false;
                
            }else{
                status=true;
            }

            
        }

        return status;
    }
    
    public boolean checkUpHost(String noHost){
        
        paho = Pattern.compile("[0-9]{1,7}");
        maho = paho.matcher(noHost);        
        if(maho.matches()){            
            varho=true;
            float subflo=parseFloat(noHost); 
            long vhost= Math.round(subflo);        
            if(vhost==0){
                varho=false;
                JOptionPane.showMessageDialog(null, "¡Introduce un numero de host mayor a 0!\n\n", "Host erroneo",0);
            }else if (vhost>8388608) {
                varho=false;
                JOptionPane.showMessageDialog(null, "¡El numero maxímo de host permitidas es de 8,388,608!\n\n", "Host erroneo",0);
            }else{
                varho=true;
            }
        }else{
            varho=false;
            JOptionPane.showMessageDialog(null, "¡Introduce un valor numerico válido para el host!\n\n", "Host erroneo",0);
        }    
        
        return varho;    
        
    }

}
