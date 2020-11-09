package subneteo;

public class FinalData {

    private static String subredes;
    private static String rangos;
    private static int numHost;
    private static int powerTo;
    private static String constJ;
    private static String type;
    private static String ipBin,subBin;

    public static String getSubBin() {
        return subBin;
    }

    public static void setSubBin(String subBin) {
        FinalData.subBin = subBin;
    }
    

    public static String getIpBin() {
        return ipBin;
    }

    public static void setIpBin(String ipBin) {
        FinalData.ipBin = ipBin;
    }

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        FinalData.type = type;
    }

    public String getSubredes() {
        return subredes;
    }

    public void setSubredes(String subredes) {
        this.subredes = subredes;
    }

    public String getRangos() {
        return rangos;
    }

    public void setRangos(String rangos) {
        this.rangos = rangos;
    }

    public int getNumHost() {
        return numHost;
    }

    public void setNumHost(int numHost) {
        this.numHost = numHost;
    }

    public int getPowerTo() {
        return powerTo;
    }

    public void setPowerTo(int powerTo) {
        this.powerTo = powerTo;
    }

    public String getConstJ() {
        return constJ;
    }

    public void setConstJ(String constJ) {
        this.constJ = constJ;
    }

    public void show() {
        System.out.println(subredes + "--------" + rangos);
    }

}
