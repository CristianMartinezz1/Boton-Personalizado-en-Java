# 🎨 Botón Personalizado en Java Swing

Este proyecto implementa un componente visual reutilizable en Java: un **botón personalizado** que permite modificar su estilo, forma, colores e íconos desde código o visualmente en NetBeans.

---

## 🎯 Objetivo

Diseñar e implementar un componente gráfico reutilizable, configurado mediante **propiedades públicas (get/set)** y compatible con el **editor visual de NetBeans**, permitiendo personalización visual inmediata.

---

## 🧩 Estructura del proyecto

| Carpeta | Contenido |
|--------|-----------|
| `componente/` | Código fuente del componente `BotonPersonalizado.java` |
| `jar/` | Archivo `.jar` exportado del componente |
| `UsoComponente/` | Proyecto de prueba que utiliza el componente y modifica sus propiedades |

---

## 🧠 Explicación del componente

`BotonPersonalizado` extiende `JButton` e implementa diferentes estilos visuales mediante gráficos 2D, listeners de ratón y propiedades visuales personalizables.

### 🔧 Propiedades configurables (con `set/get`):

- Estilo visual del botón (`NORMAL`, `SIN_FONDO`, `PLANO`, `SIN_ICONO`)
- Forma del botón (`RECTANGULO`, `CIRCULO`, `OVALO`)
- Colores: fondo, contorno, texto
- Iconos: normal, al pasar el mouse
- Visibilidad del contorno

### 🔄 Métodos relevantes:

```java
public void setEstilo(EstiloBoton estilo)
public void setForma(FormaBoton forma)
public void setColorFondo1(Color c)
public void setIconoNormal(Icon icono)
public void setMostrarContorno(boolean mostrar)
```





## 🎥 5. Vídeo en YouTube

A continuación se presenta un video explicativo que muestra cómo utilizar el componente `BotonPersonalizado` en un proyecto Java con NetBeans.

🔗 [Ver video en YouTube](https://youtu.be/dYaj9omDPU0)

- Se muestra cómo agregar el botón a la **paleta de componentes**.
- Se ejemplifica su uso en un formulario con `JFrame`.

