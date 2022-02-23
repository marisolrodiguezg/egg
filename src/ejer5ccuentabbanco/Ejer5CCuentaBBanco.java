
package ejer5ccuentabbanco;

import EEntidades.CCuenta;
import SServicio.CCuentaSServicio;

public class Ejer5CCuentaBBanco {

    public static void main(String[] args) {
        CCuentaSServicio ccss = new CCuentaSServicio();
        CCuenta cta = ccss.crearCuenta();
        ccss.menu(cta);
    }
    
}
