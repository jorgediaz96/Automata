package Vista;

import Logica.Automata;

public class VentanaGrafos {
    public void crearVentanaGrafos(){
        Ventana recursosGraficos = new Ventana();
        recursosGraficos.crearVentana("Automatas", "../Recursos/iconoAplicacion.png", 800, 600);
        Ventana.ventana.add(recursosGraficos.agregarElementos());
        Ventana.panel.add(recursosGraficos.crearBoton("Comprobar", 30, 30, 100, 50));
        
        Automata z = new Automata();
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
        }
    }
}
