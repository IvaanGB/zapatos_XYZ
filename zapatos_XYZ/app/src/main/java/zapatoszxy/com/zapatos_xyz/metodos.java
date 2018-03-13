package zapatoszxy.com.zapatos_xyz;

/**
 * Created by ivang on 12/3/2018.
 */

public class metodos {
    public static int valorAPagar(int precio, int cantidad){ return precio*cantidad; }

    public static int preciosMujer(int posicionTipo, int posicionMarca) {
        int precios = 0;
        if (posicionTipo == 1) {
            if (posicionMarca == 1) {
                precios = 100000;
            }
            if (posicionMarca == 2) {
                precios = 130000;
            }
            if (posicionMarca == 3) {
                precios = 110000;
            }
        }

        if (posicionTipo == 2) {
            if (posicionMarca == 1) {
                precios = 60000;
            }
            if (posicionMarca == 2) {
                precios = 70000;
            }
            if (posicionMarca == 3) {
                precios = 120000;
            }
        }
        return precios;
    }

    public static int preciosHombre(int posicionTipo, int posicionMarca) {
        int precios = 0;
        if (posicionTipo == 1) {
            if (posicionMarca == 1) {
                precios = 120000;
            }
            if (posicionMarca == 2) {
                precios = 140000;
            }
            if (posicionMarca == 3) {
                precios = 130000;
            }
        }

        if (posicionTipo == 2) {
            if (posicionMarca == 1) {
                precios = 50000;
            }
            if (posicionMarca == 2) {
                precios = 80000;
            }
            if (posicionMarca == 3) {
                precios = 100000;
            }
        }
        return precios;
    }



}
