package Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/** VentanaGrafos: Es la clase encargada de crear la aplicacion grafica de cara al
 *  usuario
 */
public class VentanaGrafos {
    /**crearVentanaGrafos: crea la interfaz principal de la aplicacion*/
    Ventana recursosGraficos;
    public void crearVentanaGrafos(){
        recursosGraficos = new Ventana();
        recursosGraficos.crearVentana("Automatas", "../Recursos/iconoAplicacion.png", 800, 600);
        Ventana.ventana.add(recursosGraficos.agregarElementos(800,600));
        
        /**añadido de elementos al panel*/
        Ventana.panel.add(crearAreaTrabajo());
        Ventana.panel.add(crearBotonTransformar());
        Ventana.panel.add(crearBotonAyuda());
        Ventana.panel.add(crearBotonAgregarTransicion());
        Ventana.ventana.setVisible(true);
        
    }
    
    /**Creacion de los elementos de la ventana*/
    private JTextField crearCampoAlfabeto(){
        JTextField campoAlfabeto = new JTextField();
        campoAlfabeto.setBounds(50, 50, 50, 50);
        return campoAlfabeto;
    }
    
    private JButton crearBotonTransformar(){
        JButton botonComprobacionCadena = recursosGraficos.crearBoton("Transformar", 30, 20, 200, 50);
        botonComprobacionCadena.addActionListener((ActionEvent e) -> {
            /**Aqui se llama la funcion que sea que transforma*/
            System.out.println("Transformando ??");
        });
        return botonComprobacionCadena;
    }
    
    private JButton crearBotonAgregarTransicion(){
        JButton otroBoton = recursosGraficos.crearBoton("Agregar transicion", 30, 72, 200, 50);
        otroBoton.addActionListener((ActionEvent e) -> {
            /**Aqui va la funcion que sea que agrega una transicion*/
            System.out.println("Agregando transicion ??");
        });
        return otroBoton;
    }
    
    private JButton crearBotonAyuda(){
        JButton botonAyuda = recursosGraficos.crearBoton("Ayuda", 30, 150, 200, 50);
        botonAyuda.addActionListener((ActionEvent e) -> {
            /**Aqui va la funcion que sea que agrega una transicion*/
            System.out.println("Ayuda: ??");
        });
        return botonAyuda;
    }
    
    private JTextArea crearAreaTrabajo(){
        JTextArea areaTrabajo = recursosGraficos.crearAreaTexto(250, 20, 500, 500);
        return areaTrabajo;
    }
        
}
