// Importación de las clases necesarias
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * Botón completamente personalizado con múltiples estilos y figuras visuales,
 * configurables desde las propiedades en NetBeans.
 */
public class BotonPersonalizado extends JButton {

    // Estados del mouse
    private boolean isHovered = false;
    private boolean isPressed = false;

    // Estilo del botón
    private EstiloBoton estiloActual = EstiloBoton.NORMAL;
    private FormaBoton formaActual = FormaBoton.RECTANGULO;

    // Propiedades del estilo NORMAL y SIN_ICONO
    private Color colorFondo1 = new Color(200, 30, 30);
    private Color colorFondo2 = new Color(100, 149, 237);
    private Color colorTexto = Color.WHITE;
    private boolean mostrarContorno = true;
    private Color colorContorno = Color.BLACK;

    // Propiedades del estilo SIN_FONDO
    private Color colorSinFondo1 = Color.RED;
    private Color colorSinFondo2 = Color.BLUE;

    // Iconos personalizables
    private Icon iconoNormal = new ImageIcon("Images/happy.png");
    private Icon iconoHover = new ImageIcon("Images/star.png");

    public BotonPersonalizado() {
        setText("ACEPTAR");
        setFont(new Font("Segoe UI", Font.BOLD, 16));
        setFocusPainted(false);
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(0, 0, 0, 0));
        setIcon(iconoNormal);
        setRolloverIcon(iconoHover);
        setPressedIcon(iconoHover);
        setHorizontalTextPosition(SwingConstants.RIGHT);
        setVerticalTextPosition(SwingConstants.CENTER);
        setIconTextGap(10);

        // Mouse listeners
        addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                isHovered = true;
                setLocation(getX(), getY() - 3);
                actualizarIcono();
                actualizarTooltip();
                repaint();
            }
            public void mouseExited(MouseEvent e) {
                isHovered = false;
                isPressed = false;
                setLocation(getX(), getY() + 3);
                actualizarIcono();
                repaint();
            }
            public void mousePressed(MouseEvent e) {
                isPressed = true;
                setLocation(getX(), getY() + 2);
                repaint();
            }
            public void mouseReleased(MouseEvent e) {
                isPressed = false;
                setLocation(getX(), getY() - 2);
                repaint();
            }
        });
        actualizarTooltip();
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int width = getWidth();
        int height = getHeight();

        // Define forma del botón
        Shape forma;
if (formaActual == FormaBoton.OVALO) {
   forma = new Ellipse2D.Float(0, 0, width, height);
} else if (formaActual == FormaBoton.CIRCULO) {
    forma = new RoundRectangle2D.Float(0, 0, width, height,height,height);
} else {
    forma = new RoundRectangle2D.Float(0, 0, width, height, 20, 20);
}

        Color fondo = null;
        Color texto = colorTexto;

        boolean deshabilitado = !isEnabled();

        switch (estiloActual) {
            case NORMAL:
                fondo = deshabilitado ? Color.GRAY : (isHovered ? colorFondo2 : colorFondo1);
                g2.setColor(fondo);
                g2.fill(forma);
                if (mostrarContorno) {
                    g2.setColor(deshabilitado ? Color.DARK_GRAY : colorContorno);
                    g2.setStroke(new BasicStroke(2f));
                    g2.draw(forma);
                }
                break;

            case SIN_FONDO:
                texto = deshabilitado ? Color.GRAY : (isHovered ? colorSinFondo2 : colorSinFondo1);
                g2.setColor(texto);
                g2.setStroke(new BasicStroke(2f));
                g2.draw(forma);
                break;

            case PLANO:
                texto = deshabilitado ? Color.GRAY : Color.BLACK;
                g2.setColor(texto);
                g2.setStroke(new BasicStroke(2f));
                g2.draw(forma);
                break;

            case SIN_ICONO:
                setIcon(null);
                setRolloverIcon(null);
                setPressedIcon(null);
                fondo = deshabilitado ? Color.GRAY : (isHovered ? colorFondo2 : colorFondo1);
                g2.setColor(fondo);
                g2.fill(forma);
                if (mostrarContorno) {
                    g2.setColor(deshabilitado ? Color.DARK_GRAY : colorContorno);
                    g2.setStroke(new BasicStroke(2f));
                    g2.draw(forma);
                }
                break;
        }

        setForeground(texto);

        g2.dispose();
        super.paintComponent(g);
    }

    private void actualizarIcono() {
        if (estiloActual != EstiloBoton.SIN_ICONO) {
            setIcon(isHovered ? iconoHover : iconoNormal);
        }
    }

    private void actualizarTooltip() {
        String desc = switch (estiloActual) {
            case NORMAL -> "Estilo NORMAL - Fondo, Iconos, Letra y Contorno personalizados.";
            case SIN_FONDO -> "Estilo SIN FONDO - Sin fondo, solo letra y borde.";
            case PLANO -> "Estilo PLANO - estilo básico en negro.";
            case SIN_ICONO -> "Estilo SIN ICONO - Sin íconos, pero con fondo y contorno.";
        };
        setToolTipText("<html><b>Estilo:</b> " + desc + "<br><b>Figura:</b> " + formaActual + "</html>");
    }

    // === SETTERS Y GETTERS ===
    public void setEstilo(EstiloBoton estilo) {
        this.estiloActual = estilo;
        actualizarIcono();
        actualizarTooltip();
        repaint();
    }

    public void setForma(FormaBoton forma) {
        this.formaActual = forma;
        repaint();
    }

    public EstiloBoton getEstilo() { 
        return estiloActual; }
    public FormaBoton getForma() { 
        return formaActual; }

    public void setColorFondo1(Color c) { 
        this.colorFondo1 = c; repaint(); }
    public void setColorFondo2(Color c) { 
        this.colorFondo2 = c; repaint(); }
    public void setColorTexto(Color c) { 
        this.colorTexto = c; repaint(); }
    public void setMostrarContorno(boolean mostrar) { 
        this.mostrarContorno = mostrar; repaint(); }
    public void setColorContorno(Color c) { 
        this.colorContorno = c; repaint(); }
    public void setColorSinFondo1(Color c) { 
        this.colorSinFondo1 = c; repaint(); }
    public void setColorSinFondo2(Color c) { 
        this.colorSinFondo2 = c; repaint(); }
    public void setIconoNormal(Icon icono) { 
        this.iconoNormal = icono; setIcon(icono); }
    public void setIconoHover(Icon icono) { 
        this.iconoHover = icono; setRolloverIcon(icono); setPressedIcon(icono); }

    public Color getColorFondo1() { 
        return colorFondo1; }
    public Color getColorFondo2() { 
        return colorFondo2; }
    public Color getColorTexto() { 
        return colorTexto; }
    public boolean isMostrarContorno() { 
        return mostrarContorno; }
    public Color getColorContorno() { 
        return colorContorno; }
    public Color getColorSinFondo1() { 
        return colorSinFondo1; }
    public Color getColorSinFondo2() { 
        return colorSinFondo2; }
    public Icon getIconoNormal() { 
        return iconoNormal; }
    public Icon getIconoHover() { 
        return iconoHover; }

    // estilos disponibles
    public enum EstiloBoton {
        NORMAL, SIN_FONDO, PLANO, SIN_ICONO
    }

    // formas disponibles
    public enum FormaBoton {
        RECTANGULO, CIRCULO, OVALO
    }
}

