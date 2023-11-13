
package promedio;

/**
 *
 * @author User
 */
public class Datos {
    String LAB,INV,EP,PROMEDIO;

    public Datos (String LAB, String INV, String EP, String PROMEDIO) {
        this.LAB = LAB;
        this.INV = INV;
        this.EP = EP;
        this.PROMEDIO = PROMEDIO;
    }
    public String getLAB() {
        return LAB;
    }

    public void setLAB(String LAB) {
        this.LAB = LAB;
    }

    public String getINV() {
        return INV;
    }

    public void setINV(String INV) {
        this.INV = INV;
    }

    public String getEP() {
        return EP;
    }

    public void setEP(String EP) {
        this.EP = EP;
    }

    public String getPROMEDIO() {
        return PROMEDIO;
    }

    public void setPROMEDIFINAL(String PROMEDIO) {
        this.PROMEDIO = PROMEDIO;
    }
   
}
