package subneteo;

import javax.swing.JOptionPane;

public class Data {

    private String ip;
    private String noSubredes,hostNumber;
    CheckUp check = new CheckUp();
    Calculus subneteo = new Calculus();

    public Data() {

    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNoSub() {
        return noSubredes;
    }

    public void setNoSub(String noSubred) {
        this.noSubredes = noSubred;
    }

    public String getHostNumber() {
        return hostNumber;
    }

    public void setHostNumber(String hostNumber) {
        this.hostNumber = hostNumber;
    }
    

    public boolean validar() {
        boolean status = false;

        if ((check.checkUpIp(ip) && check.checkUpSub(noSubredes)) || (check.checkUpIp(ip) && check.checkUpHost(hostNumber))) {
            subneteo.subnetear(ip, noSubredes,hostNumber);
            status = true;
        } else {
            System.out.println("subneteo.Data.validar()");
            status = false;
            
        }
        return status;
    }
    
}