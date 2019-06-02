package Vista;

public class VentanaGrafos {
    public void crearVentanaGrafos(){
        Ventana recursosGraficos = new Ventana();
        recursosGraficos.crearVentana("Automatas", "../Recursos/iconoAplicacion.png", 800, 600);
        Ventana.ventana.add(recursosGraficos.agregarElementos());
        Ventana.panel.add(recursosGraficos.crearBoton("Hola mundo", 30, 30, 100, 50));
    }
}
