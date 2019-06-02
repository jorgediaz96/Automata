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

    /**Creacion del objeto ventana*/
    public static JFrame ventana;
    /**crearVentana: Crea una ventan
     * @param tituloVentana
     * @param rutaIconoAplicacion 
     * @param alto
     * @param ancho
     */
    public void crearVentana(String tituloVentana, String rutaIconoAplicacion, int alto, int ancho){
        ventana = new JFrame(tituloVentana);
        /**Parametros basicos de la ventana*/
        ventana.setSize(alto,ancho);
        ventana.setUndecorated(false);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        /**Personalizacion de la ventana*/
        ImageIcon ImageIcon = new ImageIcon(getClass().getResource(rutaIconoAplicacion));
        Image Image = ImageIcon.getImage();
        ventana.setIconImage(Image);
        /**Añadido de paneles a la ventana*/
        /**Mostrar la ventana*/
        ventana.setVisible(true);
    }
    
    /**Creacion del elemento panel*/
    public static JPanel panel;    
    /**añadirElementos: Añade JButtons JLabels y textFields a La ventana
     * @return panel*/
    public JPanel agregarElementos(){
        panel = new JPanel();
        panel.setLayout(null);
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