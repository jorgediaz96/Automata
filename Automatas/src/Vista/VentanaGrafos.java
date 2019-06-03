package Vista;

import Logica.Automata;
import java.util.TreeSet;
import Logica.Transformador;
import java.awt.Dimension;
import javax.swing.JTextArea;

public class VentanaGrafos {
    
    public void crearVentanaGrafos(){
        Ventana recursosGraficos = new Ventana();
        /*Automata z = new Automata();
        Integer numEstados = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese número de estados"));
        z.setnumEstados(numEstados);
        z.setEstadoInicial(0);
        
        int estFinales = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese número de estados finales"));
        for (int i = 0; i < estFinales; i++) {
            int estadoFinal = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese estado final"));
            z.addEstadoFinal(estadoFinal);
        }

        int alf = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Ingrese cantidad de letras del alfabeto"));
        for (int i = 0; i < alf; i++) {
            z.addLetraAlfabeto(javax.swing.JOptionPane.showInputDialog("Ingrese letra"));
        }*/
        
        
        recursosGraficos.crearVentana("Automatas", "../Recursos/iconoAplicacion.png", 800, 600);
        Ventana.ventana.add(recursosGraficos.agregarElementos());
        Ventana.panel.add(recursosGraficos.crearTexto("Estados: ", 0, -40, 100, 100));
        //Ventana.panel.add(recursosGraficos.crearTexto(numEstados.toString(), 60, -40, 100, 100));
        Ventana.panel.add(recursosGraficos.crearTexto("Estados finales: ", 140, -40,300, 100));
        //Ventana.panel.add(recursosGraficos.crearTexto(z.getestadoFinal().toString(), 260, -40, 100, 100));
        Ventana.panel.add(recursosGraficos.crearTexto("Alfabeto: ", 330, -40, 100, 100));
        //Ventana.panel.add(recursosGraficos.crearTexto(z.getAlfabeto().toString(), 400, -40, 100, 100));
        
        JTextArea textArea1 = new JTextArea("Hola bienvenido");
        textArea1.setPreferredSize(new Dimension(60,300));
        textArea1.setLineWrap(true);
        Ventana.ventana.add(textArea1,100,40);
        Ventana.ventana.pack();
    }
    
    public void tabla1(Automata z) {
        String tabla1 = "\t" + z.getAlfabeto().toString() + "\n";

        for (int i = 0; i < z.getTablaTransiciones().length; i++) {
            for (int j = 0; j < z.getTablaTransiciones()[i].length; j++) {
                if (j == 0) {
                    tabla1 = tabla1 + i + "\t" + (z.getTablaTransiciones()[i][j].toString());
                } else {

                    tabla1 = tabla1 + (z.getTablaTransiciones()[i][j].toString());
                }
            }
            tabla1 = tabla1 + "\n";
        }
        
    }

    public void tabla2(Automata trans) {
        String tabla2 = "\t" + trans.getAlfabeto().toString() + "\n";
        TreeSet<Integer> table = new TreeSet<Integer>();
        table.add(0);

        for (int i = 0; i < trans.getTablaTransiciones().length; i++) {
            for (int j = 0; j < trans.getTablaTransiciones()[i].length; j++) {
                if (trans.getTablaTransiciones()[i][j].isEmpty()) {
                    trans.getTablaTransiciones()[i][j] = table;
                }
            }
        }



        for (int i = 0; i < trans.getTablaTransiciones().length; i++) {
            for (int j = 0; j < trans.getTablaTransiciones()[i].length; j++) {
                if (j == 0) {
                    tabla2 = tabla2 + i + "\t" + (trans.getTablaTransiciones()[i][j].toString());
                } else {

                    tabla2 = tabla2 + (trans.getTablaTransiciones()[i][j].toString());
                }
            }
            tabla2 = tabla2 + "\n";
        }
        
    }

    
}
