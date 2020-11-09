package subneteo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculus {

    String[] octetos;
    int subNew, ipNew, type, n, constJ, host, powerTo, ipDef;
    String relleno, typeS;
    ArrayList subList = new ArrayList();
    ArrayList showRange = new ArrayList();
    String finalRange = "";
    String finalSub = "";

    public Calculus() {

    }

    public void subnetear(String ipAdress, String subred, String hostNumber) {

        System.out.println("Llegando al subneteo UwU");

        octetos = ipAdress.split("\\.");
        subNew = Integer.parseInt(subred);

        for (int i = 0; i < 1; i++) {

            relleno = String.valueOf(octetos[0]);

            ipNew = Integer.parseInt(relleno);

            /*
			 * CLASES
			 * 
			 * 1 --> A
			 * 
			 * 2 --> B
			 * 
			 * 3 --> C
			 * 
			 * 4 --> D
			 * 
			 * 5 --> E
             */
            if (ipNew >= 0 && ipNew < 128) {
                type = 1;
                typeS = "A";
            } else if (ipNew >= 128 && ipNew < 192) {
                type = 2;
                typeS = "B";
            } else if (ipNew >= 192 && ipNew < 224) {
                type = 3;
                typeS = "C";
            } else if (ipNew >= 224 && ipNew < 240) {
                type = 4;
                typeS = "D";
            } else if (ipNew >= 240 && ipNew < 255) {
                type = 5;
                typeS = "E";
            }
        }

        // Subredes
        if (subNew >= 0 && subNew < 2) {
            n = 1;
            constJ = (256 - 128);
            if (type == 1) {
                host = ((int) (Math.pow(2, 23)) - 2);
            } else if (type == 2) {
                host = ((int) Math.pow(2, 15)) - 2;
            } else if (type == 3) {
                host = ((int) Math.pow(2, 7)) - 2;
            }
        } else if (subNew >= 2 && subNew <= 4) {
            n = 2;
            constJ = (256 - 192);
            if (type == 1) {
                host = ((int) (Math.pow(2, 22)) - 2);
            } else if (type == 2) {
                host = ((int) Math.pow(2, 14)) - 2;
            } else if (type == 3) {
                host = ((int) Math.pow(2, 6)) - 2;
            }
        } else if (subNew > 4 && subNew <= 8) {
            n = 3;
            constJ = (256 - 224);
            if (type == 1) {
                host = ((int) (Math.pow(2, 21)) - 2);
            } else if (type == 2) {
                host = ((int) Math.pow(2, 13)) - 2;
            } else if (type == 3) {
                host = ((int) Math.pow(2, 5)) - 2;
            }
        } else if (subNew > 8 && subNew <= 16) {
            n = 4;
            constJ = (256 - 240);
            if (type == 1) {
                host = ((int) (Math.pow(2, 20)) - 2);
            } else if (type == 2) {
                host = ((int) Math.pow(2, 12)) - 2;
            } else if (type == 3) {
                host = ((int) Math.pow(2, 4)) - 2;
            }
        } else if (subNew > 16 && subNew <= 32) {
            n = 5;
            constJ = (256 - 248);
            if (type == 1) {
                host = ((int) (Math.pow(2, 19)) - 2);
            } else if (type == 2) {
                host = ((int) Math.pow(2, 11)) - 2;
            } else if (type == 3) {
                host = ((int) Math.pow(2, 3)) - 2;
            }
        } else if (subNew > 32 && subNew <= 64) {
            n = 6;
            constJ = (256 - 252);
            if (type == 1) {
                host = ((int) (Math.pow(2, 18)) - 2);
            } else if (type == 2) {
                host = ((int) Math.pow(2, 10)) - 2;
            } else if (type == 3) {
                host = ((int) Math.pow(2, 2)) - 2;
            }
        } else if (subNew > 64 && subNew <= 128) {
            n = 7;
            constJ = (256 - 254);
            if (type == 1) {
                host = ((int) (Math.pow(2, 17)) - 2);
            } else if (type == 2) {
                host = ((int) Math.pow(2, 9)) - 2;
            } else if (type == 3) {
                host = ((int) Math.pow(2, 1)) - 2;
            }
        } else {
            n = 1000;
            host = 1000;
            constJ = 1000;
        }
        
        String jump = String.valueOf(constJ);
        ipDef = constJ;

        if (octetos[0].startsWith("0")) {
            for (int i = 0; i < (int) Math.pow(2, n); i++) {
                subList.add("#" + (i + 1) + ": " + octetos[0] + "." + (constJ - ipDef) + "." + octetos[1] + "."
                        + octetos[2] + "." + octetos[3]);
                showRange.add("#" + (i + 1) + ": " + (constJ - 1) + ".255.255.255");
                constJ += ipDef;
            }
        } else if (octetos[1].startsWith("0")) {
            for (int i = 0; i < (int) Math.pow(2, n); i++) {
                subList.add("#" + (i + 1) + ": " + octetos[0] + "." + (constJ - ipDef) + "." + octetos[2] + "."
                        + octetos[3]);
                showRange.add("#" + (i + 1) + ": " + octetos[0] + "." + (constJ - 1) + ".255" + ".255");
                constJ += ipDef;
            }
        } else if (octetos[2].startsWith("0")) {
            for (int i = 0; i < (int) Math.pow(2, n); i++) {
                subList.add("#" + (i + 1) + ": " + octetos[0] + "." + octetos[1] + "." + (constJ - ipDef) + "."
                        + octetos[3]);
                showRange.add("#" + (i + 1) + ": " + octetos[0] + "." + octetos[1] + "." + (constJ - 1) + ".255");
                constJ += ipDef;
            }
        } else if (octetos[3].startsWith("0")) {
            for (int i = 0; i < (int) Math.pow(2, n); i++) {
                subList.add("#" + (i + 1) + ": " + octetos[0] + "." + octetos[1] + "." + octetos[2] + "."
                        + (constJ - ipDef));
                showRange.add(
                        "#" + (i + 1) + ": " + octetos[0] + "." + octetos[1] + "." + octetos[2] + "." + (constJ - 1));
                constJ += ipDef;
            }
        } else {
            System.out.println("Error al guardar");
        }
        for (int i = 0; i < subList.size(); i++) {
            finalSub = finalSub + (String.valueOf(subList.get(i))) + "\n";

        }

        for (int i = 0; i < showRange.size(); i++) {
            finalRange = finalRange + (String.valueOf(showRange.get(i))) + "\n";
        }

        ArrayList ipBinario = new ArrayList();

        for (int i = 0; i < 4; i++) {
            String oc1 = (String.valueOf(octetos[i]));
            long ipbi = Integer.valueOf(oc1);
            ipBinario.add(Long.toBinaryString(ipbi));

        }

        String ipBinFinal = "";
        for (int i = 0; i < ipBinario.size(); i++) {
            ipBinFinal = ipBinFinal + (String.valueOf(ipBinario.get(i))) + ".";
        }

        FinalData fd = new FinalData();
        //ipFinal
        fd.setSubredes(finalSub);
        //Rangos
        fd.setRangos(finalRange);
        //potencia
        fd.setPowerTo(n);
        //Saltos
        fd.setConstJ(jump);
        //tipo
        fd.setType(typeS);
        //IP principal en binario
        fd.setIpBin(ipBinFinal);
        // returnSub();
    }

    public int returnSubNumber() {
        return subNew;
    }

    public int returnPowerTo() {
        return n;
    }

    public int returnConst() {
        return constJ;
    }

    public int returnHostNumber() {
        return host;
    }

}
