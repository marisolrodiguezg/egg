
package SServicio;

import EEntidades.CCuenta;
import java.util.Scanner;

public class CCuentaSServicio {
    public CCuenta crearCuenta() {
        CCuenta cc = new CCuenta();
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese en num de cuenta");
        cc.setNumeroCuenta(leer.nextInt());
        System.out.println("ingrese un DNI del titular");
        cc.setDni(leer.nextLong());
        System.out.println("ingrese el saldo actual");
        cc.setSaldoActual(leer.nextDouble());
        return cc;
    }

    public void Ingresar(CCuenta cc,double ingreso) {
        Scanner leer = new Scanner(System.in);
       // System.out.println("cuanto dinero desea ingresar?");
       //ingreso = leer.nextDouble();
        if (ingreso > 0) {
            Double suma = ingreso + cc.getSaldoActual();
            cc.setSaldoActual(suma);
            System.out.println("su saldo actual es de " + cc.getSaldoActual());
        } else {
            System.out.println("no puede ingresar negativos");
        }

    }

    public void Retirar(CCuenta cc) {
        Scanner leer = new Scanner(System.in);
        System.out.println("cuanto dinero desea retirar?");
        Double retiro = leer.nextDouble();
        Double resta;
        if (retiro > 0) {
            if (retiro > cc.getSaldoActual()) {
                resta = cc.getSaldoActual() - retiro;
                
                System.out.println("solo puede retirar " + cc.getSaldoActual());
Double retiro2 = resta - resta;
                cc.setSaldoActual(retiro2);
                System.out.println("su saldo actual es de " + cc.getSaldoActual());

            } else {
                resta = cc.getSaldoActual() - retiro;
                cc.setSaldoActual(resta);
                System.out.println("su saldo actual es de " + cc.getSaldoActual());
            }
        } else {
            System.out.println("no puede ingresar negativos");
        }

    }

    public void ExtraccionRapida(CCuenta cc) {
        Scanner leer = new Scanner(System.in);
        System.out.println("cunto dinero en ext rap quiere retirar");
        Double extRap = leer.nextDouble();
        Double porc = (cc.getSaldoActual() * 20) / 100;
        if (extRap > (porc)) {
            Double soloRetira = porc;
            System.out.println("solo puede retirar" + porc + "que corresponde a un 20% de su saldo actual");
            cc.setSaldoActual( cc.getSaldoActual()-soloRetira );
            
            System.out.println("su saldo actual es de "+ cc.getSaldoActual());

        }
    }

    public void ConsultarSaldo(CCuenta cc) {
        System.out.println("el saldo disponible en la cta " + cc.getSaldoActual());
    }

    public void ConsultarDatos(CCuenta cc) {
        System.out.println("el numero de cuenta es " + cc.getNumeroCuenta());
        System.out.println("el numero de DNI es " + cc.getDni());
    }

    public void menu(CCuenta cc) {
        Scanner leer = new Scanner(System.in);
        int operacion;
        do {
            System.out.println("----------------------------------");
            System.out.println("ingrese la opcion que desee: ");
            System.out.println("1) Ingresar dinero");
            System.out.println("2) Retirar dinero");
            System.out.println("3) extraccion rapida");
            System.out.println("4) consultar saldo");
            System.out.println("5) consultar datos");
            System.out.println("--------------------------------");

            operacion = leer.nextInt();
            switch (operacion) {
                case 1:
                    System.out.println("cuanto dinero desea ingresar?");
                    Ingresar(cc,leer.nextDouble());
                    break;
                case 2:
                    Retirar(cc);
                    break;
                case 3:
                    ExtraccionRapida(cc);
                    break;
                case 4:
                    ConsultarSaldo(cc);
                    break;
                case 5:
                    ConsultarDatos(cc);
                    break;
                default:
                    System.out.println("el num es incorrecto");
            }

        } while (operacion == 1 || operacion == 2 || operacion == 3 || operacion == 4 || operacion == 5);
    }

}
        
   


