package Conversores;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class ConversorMoneda {

    public static void main(String[] args) throws Exception {

        Object[] opcion = {"Conversor Divisas", "Conversor Temperatura", "Salir"};
        int Seleccione = JOptionPane.showOptionDialog(null,
                "¿Valor a convertir?", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                opcion, opcion[0]);
        if (Seleccione == 0) {
            DecimalFormat cambioDivisas = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = {"De Pesos a Dolares", "De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yen",
                    "De Pesos a Won Coreano", "De Dolar a Peso", "De Euro a Peso", "De Libras a Peso", "De Yen a Peso", "De Won Coreano a Peso"};
                String cambio = (String) JOptionPane.showInputDialog(null, "Elije la moneda a convertir: ",
                        "Conversor de moneda", JOptionPane.QUESTION_MESSAGE,
                        null, opciones, opciones[0]);
                String input = JOptionPane.showInputDialog(null, "Ingrese cantidad que desea convertir: ");
                double pesosColombianos = 0.00;
                try {
                    pesosColombianos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido, verifique datos Ingresados");
                }

                if (cambio.equals("De Pesos a Dolares")) {
                    double dolares = pesosColombianos / 4778.83;
                    JOptionPane.showMessageDialog(null, "Tiene: " + cambioDivisas.format(dolares) + "Dolares");
                } else if (cambio.equals("De Pesos a Euros")) {
                    double euro = pesosColombianos / 5160.10;
                    JOptionPane.showMessageDialog(null, "Tiene: " + cambioDivisas.format(euro) + "Euros");
                } else if (cambio.equals("De Pesos a Libras")) {
                    double libras = pesosColombianos / 5847.60;
                    JOptionPane.showMessageDialog(null, "Tiene: " + cambioDivisas.format(libras) + "Libras");
                } else if (cambio.equals("De Pesos a Yen")) {
                    double yen = pesosColombianos / 0.028;
                    JOptionPane.showMessageDialog(null, "Tiene: " + cambioDivisas.format(yen) + "Yen");
                } else if (cambio.equals("De Pesos a Won Coreano")) {
                    double won = pesosColombianos / 0.27;
                    JOptionPane.showMessageDialog(null, "Tiene: " + cambioDivisas.format(won) + "Won");
                } else if (cambio.equals("De Dolar a Peso")) {
                    double dolares = 4778.83 * pesosColombianos;
                    JOptionPane.showMessageDialog(null, "Tiene: " + cambioDivisas.format(dolares) + "Pesos");
                } else if (cambio.equals("De Euro a Peso")) {
                    double euro = 5160.10 * pesosColombianos;
                    JOptionPane.showMessageDialog(null, "Tiene: " + cambioDivisas.format(euro) + "Pesos");
                } else if (cambio.equals("De Libras a Peso")) {
                    double libras = 5847.60 * pesosColombianos;
                    JOptionPane.showMessageDialog(null, "Tiene: " + cambioDivisas.format(libras) + "Pesos");
                } else if (cambio.equals("De Yen a Peso")) {
                    double yen = 0.028 * pesosColombianos;
                    JOptionPane.showMessageDialog(null, "Tiene: " + cambioDivisas.format(yen) + "Pesos");
                } else if (cambio.equals("De Won Coreano a Peso")) {
                    double won = 0.27 * pesosColombianos;
                    JOptionPane.showMessageDialog(null, "Tiene: " + cambioDivisas.format(won) + "Pesos");
                }

                int confirmacion = JOptionPane.showConfirmDialog(null, "Desea continuar con el programa", "Confirmar",
                        JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirmacion == JOptionPane.NO_OPTION || confirmacion == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Hasta pronto...");
                }

            }
        }
        if (Seleccione == 1) {
            boolean seguirPrograma = true;
            while (seguirPrograma) {
                String[] opciones = {"Celsius a fahrenheit", "Fahrentheit a celsious"};
                int tempe = JOptionPane.showOptionDialog(null, "Elija una opcion: ", "Conversor de temperatura",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

                String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
                double valor = 0.0;
                try {
                    valor = Double.parseDouble(valorNominal);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                    System.exit(0);
                }
                double resultado = 0;
                if (tempe == 0) {
                    resultado = (valor * 9 / 5) + 32;
                    JOptionPane.showMessageDialog(null, "Grados celsius son: " + resultado + "Grados fahrenheit");
                } else if (tempe == 1) {
                    resultado = (valor - 32) * 5 / 9;
                    JOptionPane.showMessageDialog(null, "Grados fahrenheit son: " + resultado + "Grados celcius");
                }
                int continuar = JOptionPane.showConfirmDialog(null, "Desea seguir usando el programa", "", JOptionPane.YES_NO_OPTION);
                if (continuar == JOptionPane.NO_OPTION) {
                    seguirPrograma = false;
                    JOptionPane.showMessageDialog(null, "Hasta pronto...");
                }
            }
        }
        if (Seleccione == 2) {
            JOptionPane.showMessageDialog(null, "Programa cerrado");
            System.exit(0);
        }

    }
}
