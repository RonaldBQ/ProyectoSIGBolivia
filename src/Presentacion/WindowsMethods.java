
package Presentacion;

import java.awt.Component;
import java.awt.Dimension;
import static Presentacion.PantallaPrincipal.ContenedorPrincipal;

/**
 * @author Ronald Bautista
 */
public class WindowsMethods {
    public static final int X = 1200;       // Tamaño de DesktopPanel X
    public static final int Y = 820;        // Tamaño de DesktopPanel Y
    public static final int HORIZONTAL = 1100;  // Tamaño de JinternalFrame en x
    public static final int VERTICAL = 640;    // Tamaño de JinternalFrame en Y

    /**
     * Cierra todas la ventanas activas dentro del Contenedor Principal
     */
    public static void cerrarVentanasExistentes() {
        PantallaPrincipal.ContenedorPrincipal.removeAll();
        PantallaPrincipal.ContenedorPrincipal.repaint();
    }
    /**
     * Método para abrir una ventana dentro del Contenedor Principal y centrandolo
     * @param jInternalFrame Recibe como parámetro un componente tipo JInternalFrame
     */
    public static void openWindow(Component jInternalFrame) {
        cerrarVentanasExistentes();
        ContenedorPrincipal.add(jInternalFrame);
        //Centra la ventana
        Dimension containerMainSize = ContenedorPrincipal.getSize();
        Dimension FrameSize = jInternalFrame.getSize();
        jInternalFrame.setLocation((containerMainSize.width - FrameSize.width) / 2, (containerMainSize.height - FrameSize.height) / 2);
        jInternalFrame.show();
    }

    
}
