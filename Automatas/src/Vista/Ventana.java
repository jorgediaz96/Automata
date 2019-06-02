package Vista;
        
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


public class Ventana {
    /**crearVentana: Crea una ventana*/
    public void crearVentana(String tituloVentana, String rutaIconoAplicacion, int alto, int ancho){
        /**Creacion del objeto ventana*/
        JFrame ventana = new JFrame(tituloVentana);
        /**Parametros basicos de la ventana*/
        ventana.setSize(ancho,alto);
        ventana.setUndecorated(false);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        /**Personalizacion de la ventana*/
        ImageIcon ImageIcon = new ImageIcon(getClass().getResource(rutaIconoAplicacion));
        Image Image = ImageIcon.getImage();
        ventana.setIconImage(Image);
        /**Añadido de paneles a la ventana*/
        ventana.add(agregarElementos());
        /**Mostrar la ventana*/
        ventana.setVisible(true);
    }
    
    /**añadido de campos de texto, para que sus valores sean accesibles desde cualquier parte*/
    public static JTextField alfabeto,expresionRegular,cadena;
    /**añadirElementos: Añade JButtons JLabels y textFields a La ventan
     * @return panel*/
    public JPanel agregarElementos(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        /**añadido de elementos al Panel*/
        panel.add(crearTexto("Ingrese el alfabeto, separado por comas",150,30,300,30));
        alfabeto = crearInput(200,70,200,30);
        panel.add(alfabeto);
        panel.add(crearTexto("Ingrese la expresion regular",190,110,300,30));
        expresionRegular = crearInput(200,150,200,30);
        panel.add(expresionRegular);
        panel.add(crearTexto("Ingrese la cadena",235,190,300,30));
        cadena = crearInput(200,230,200,30);
        panel.add(cadena);
        panel.add(crearBoton("Comprobar",200,300,200,30));
        
        /**Personalizacion del panel*/
        panel.setBackground(new Color(207, 209, 208));
        return panel;
    }
    
    /**crearBoton: utilidad para crear botones
     * parametros: String textoBoton
     * @return JButton;
     */
    public JButton crearBoton(String textoBoton,int posX, int posY, int ancho, int alto){
        JButton boton = new JButton(textoBoton);
        /**Personalizacion del boton*/
        boton.setBackground(new Color(0, 151, 123));
        boton.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        boton.setBounds(new Rectangle(posX, posY, ancho, alto));
        return boton;
    }
    
    /**crearTexto: Utilidad para crear texto
     * parametros: String mensaje
     * @return: JLabel;
     */
    public JLabel crearTexto(String mensaje,int posX, int posY, int ancho, int alto){
        JLabel texto = new JLabel(mensaje);
        texto.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        texto.setBounds(new Rectangle(posX, posY, ancho, alto));
        return texto;
    }
    
    public JTextField crearInput(int posX, int posY, int ancho, int alto){
        JTextField campoTexto = new JTextField();
        campoTexto.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        campoTexto.setBounds(new Rectangle(posX, posY, ancho, alto));
        campoTexto.setSize(ancho, alto);
        return campoTexto;
    }
}