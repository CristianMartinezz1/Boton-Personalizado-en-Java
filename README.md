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
## 🎨 Funcionamiento del Componente Visual: Botón Personalizado

A continuación se describen los cuatro estilos disponibles del componente `BotonPersonalizado`, junto con las propiedades que el usuario puede personalizar desde el editor de propiedades en NetBeans. Se muestran capturas antes y después de aplicar cambios visuales.

---

### 🟥 ESTILO NORMAL

#### Propiedades iniciales  
![Propiedades normales](https://i.imgur.com/UnO9R4Q.png)

#### Al pasar el mouse  
![Hover](https://i.imgur.com/wIjZb3F.png)

- `colorFondo1`, `colorFondo2`: Cambian el color de fondo.
- `iconoNormal`, `iconoHover`: Íconos que cambian con el mouse.
- `colorContorno`: Color del borde.
- `colorTexto` y `font`: Color, estilo y tamaño del texto.
- `enabled`: Activar/desactivar el botón.
- `formaActual`: Rectángulo, Círculo u Óvalo.

#### Cambios visuales personalizados
- Fondo: ![Cambio fondo](https://i.imgur.com/iI5RpgM.png)
- Texto: ![Color texto](https://i.imgur.com/Qp650L8.png)
- Iconos: ![Cambio iconos](https://i.imgur.com/ltCKws5.png)
- Contorno: ![Cambio contorno](https://i.imgur.com/qL4X2zq.png)
- Estilo texto: ![Texto estilo](https://i.imgur.com/AD6VLHm.png)
- Forma: ![Forma botón](https://i.imgur.com/hIYFfWX.png)
- Desactivado: ![Botón desactivado](https://i.imgur.com/DiNDKnJ.png)

#### Resultado final  
- Modificado: ![Modificado](https://i.imgur.com/hFxAN7k.png)  
- Hover modificado: ![Hover Modificado](https://i.imgur.com/hZYiBg5.png)  
- Desactivado: ![Desactivado](https://i.imgur.com/QBoghAq.png)

---

### 🟦 ESTILO SIN FONDO

#### Propiedades iniciales  
![Inicial](https://i.imgur.com/1hNbKWU.png)  
![Hover](https://i.imgur.com/iwgVOqa.png)

- `colorSinFondo1`, `colorSinFondo2`: Aplican al texto y contorno.
- `iconoNormal`, `iconoHover`: Íconos personalizables.
- `font`: Tamaño y tipo de letra.
- `enabled` y `formaActual`.

#### Cambios visuales
- Color: ![Color](https://i.imgur.com/iwgVOqa.png)
- Iconos: ![Iconos](https://i.imgur.com/IwNazUe.png)
- Fuente: ![Fuente](https://i.imgur.com/ww2Wriq.png)
- Forma: ![Forma](https://i.imgur.com/pL5Z1Zf.png)
- Desactivado: ![Desactivado](https://i.imgur.com/VD40FFP.png)

#### Resultado final  
- Modificado: ![Modificado](https://i.imgur.com/1QKVwxt.png)  
- Hover: ![Hover](https://i.imgur.com/av1S8x2.png)  
- Desactivado: ![Desactivado](https://i.imgur.com/hOpwQ9Z.png)

---

### ⚫ ESTILO PLANO

#### Propiedades iniciales  
![Inicial](https://i.imgur.com/JSPc9l2.png)  
![Hover](https://i.imgur.com/xxFWzjV.png)

- Color de texto y contorno fijos en negro.
- `iconoNormal`, `iconoHover`, `font`, `enabled`, `formaActual`.

#### Cambios visuales
- Iconos: ![Iconos](https://i.imgur.com/IVnHqlt.png)
- Fuente: ![Fuente](https://i.imgur.com/Jr28qPK.png)
- Forma: ![Forma](https://i.imgur.com/3D5eVuM.png)
- Desactivado: ![Desactivado](https://i.imgur.com/FrcNppr.png)

#### Resultado final  
- Modificado: ![Modificado](https://i.imgur.com/CouBrg2.png)  
- Hover: ![Hover](https://i.imgur.com/3JY2X2T.png)  
- Desactivado: ![Desactivado](https://i.imgur.com/NZVEKYK.png)

---

### ⚪ ESTILO SIN ICONO

#### Propiedades iniciales  
![Inicial](https://i.imgur.com/9c8veIr.png)  
![Hover](https://i.imgur.com/hRo8Jzv.png)

- `colorFondo1`, `colorFondo2`, `colorContorno`, `colorTexto`, `font`, `enabled`, `formaActual`.
- ❌ No permite iconos.

#### Cambios visuales
- Fondo: ![Fondo](https://i.imgur.com/8fnArs4.png)
- Texto: ![Texto](https://i.imgur.com/G0NwOUw.png)
- Contorno: ![Contorno](https://i.imgur.com/XsjE3Dc.png)
- Fuente: ![Fuente](https://i.imgur.com/Ncp2hJF.png)
- Forma: ![Forma](https://i.imgur.com/C4SauJU.png)
- Desactivado: ![Desactivado](https://i.imgur.com/0kD8RST.png)

#### Resultado final  
- Propiedades modificadas: ![Modificado](https://i.imgur.com/Gg623OH.png)  
- Hover: ![Hover](https://i.imgur.com/TfbZUnu.png)  
- Desactivado: ![Desactivado](https://i.imgur.com/NNw3LCT.png)


## 📄 Documentación

Puedes acceder a la documentación generada con Javadoc en GitHub Pages:

🔗 [Ver documentación Javadoc](https://cristianmartinezz1.github.io/Boton-Personalizado-en-Java/)


## 🎥 5. Vídeo en YouTube

A continuación se presenta un video explicativo que muestra cómo utilizar el componente `BotonPersonalizado` en un proyecto Java con NetBeans.

🔗 [Ver video en YouTube](https://youtu.be/dYaj9omDPU0)

- Se muestra cómo agregar el botón a la **paleta de componentes**.
- Se ejemplifica su uso en un formulario con `JFrame`.

