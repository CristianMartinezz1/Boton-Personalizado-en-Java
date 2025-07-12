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

## 🟥 ESTILO NORMAL

**Propiedades iniciales**  
https://i.imgur.com/UnO9R4Q.png  
![Inicial](https://i.imgur.com/UnO9R4Q.png)

**Propiedades al pasar el mouse sobre el botón**  
https://i.imgur.com/wIjZb3F.png  
![Hover](https://i.imgur.com/wIjZb3F.png)

- El usuario puede adaptar desde propiedades tanto el color del fondo uno como el color del fondo dos (`colorFondo1`, `colorFondo2`).  
- El usuario puede adaptar desde propiedades tanto el icono uno como el icono dos (`iconoNormal`, `iconoHover`).  
- El usuario puede adaptar desde propiedades el color del contorno del botón (`colorContorno`).  
- El usuario puede adaptar desde propiedades el color de la letra (`colorTexto`), tamaño y estilo (`font`).  
- El usuario puede activar o desactivar el botón desde propiedades (`enabled`).  
- El usuario puede cambiar la forma del botón desde propiedades, ya sea a Rectángulo, Círculo u Óvalo (`Forma`).  

**Cambio de fondo uno y dos**  
https://i.imgur.com/iI5RpgM.png  
![Fondo](https://i.imgur.com/iI5RpgM.png)

**Cambio de color de letra**  
https://i.imgur.com/Qp650L8.png  
![Texto](https://i.imgur.com/Qp650L8.png)

**Cambio de iconos**  
https://i.imgur.com/ltCKws5.png  
![Iconos](https://i.imgur.com/ltCKws5.png)

**Cambio de color del contorno**  
https://i.imgur.com/qL4X2zq.png  
![Contorno](https://i.imgur.com/qL4X2zq.png)

**Cambio de estilo de texto y tamaño**  
https://i.imgur.com/AD6VLHm.png  
![EstiloTexto](https://i.imgur.com/AD6VLHm.png)

**Cambio de Forma**  
https://i.imgur.com/hIYFfWX.png  
![Forma](https://i.imgur.com/hIYFfWX.png)

**Desactivado**  
https://i.imgur.com/DiNDKnJ.png  
![Desactivado](https://i.imgur.com/DiNDKnJ.png)

**Resultado - Propiedades modificadas**  
https://i.imgur.com/hFxAN7k.png  
![Modificado](https://i.imgur.com/hFxAN7k.png)

**Resultado - Hover con propiedades modificadas**  
https://i.imgur.com/hZYiBg5.png  
![HoverMod](https://i.imgur.com/hZYiBg5.png)

**Resultado - Botón desactivado**  
https://i.imgur.com/QBoghAq.png  
![FinalDesactivado](https://i.imgur.com/QBoghAq.png)

---

## 🟦 ESTILO SIN FONDO

**Propiedades iniciales**  
https://i.imgur.com/1hNbKWU.png  
![Inicial](https://i.imgur.com/1hNbKWU.png)

**Propiedades al pasar el mouse sobre el botón**  
https://i.imgur.com/iwgVOqa.png  
![Hover](https://i.imgur.com/iwgVOqa.png)

- El usuario puede adaptar desde propiedades el color uno y el color dos (`colorSinFondo1`, `colorSinFondo2`).  
- El usuario puede adaptar los iconos (`iconoNormal`, `iconoHover`).  
- El usuario puede adaptar el tamaño y estilo de la letra (`font`).  
- El usuario puede activar o desactivar el botón (`enabled`).  
- El usuario puede cambiar la forma del botón (`Forma`).  

**Cambio de color uno y dos**  
https://i.imgur.com/iwgVOqa.png  
![Colores](https://i.imgur.com/iwgVOqa.png)

**Cambio de iconos**  
https://i.imgur.com/IwNazUe.png  
![Iconos](https://i.imgur.com/IwNazUe.png)

**Cambio de estilo de texto y tamaño**  
https://i.imgur.com/ww2Wriq.png  
![Texto](https://i.imgur.com/ww2Wriq.png)

**Cambio de Forma**  
https://i.imgur.com/pL5Z1Zf.png  
![Forma](https://i.imgur.com/pL5Z1Zf.png)

**Desactivado**  
https://i.imgur.com/VD40FFP.png  
![Desact](https://i.imgur.com/VD40FFP.png)

**Resultado - Propiedades modificadas**  
https://i.imgur.com/1QKVwxt.png  
![Modificado](https://i.imgur.com/1QKVwxt.png)

**Resultado - Hover modificado**  
https://i.imgur.com/av1S8x2.png  
![Hover](https://i.imgur.com/av1S8x2.png)

**Resultado - Botón desactivado**  
https://i.imgur.com/hOpwQ9Z.png  
![Desactivado](https://i.imgur.com/hOpwQ9Z.png)

---

## ⚫ ESTILO PLANO

**Propiedades iniciales**  
https://i.imgur.com/JSPc9l2.png  
![Inicial](https://i.imgur.com/JSPc9l2.png)

**Propiedades al pasar el mouse**  
https://i.imgur.com/xxFWzjV.png  
![Hover](https://i.imgur.com/xxFWzjV.png)

- El usuario puede adaptar los iconos (`iconoNormal`, `iconoHover`).  
- Se puede cambiar el tamaño y estilo del texto (`font`).  
- Puede activarse o desactivarse (`enabled`).  
- Se puede cambiar la forma (`Forma`).  
- El color siempre será negro, no editable.

**Cambio de iconos**  
https://i.imgur.com/IVnHqlt.png  
![Iconos](https://i.imgur.com/IVnHqlt.png)

**Cambio de texto**  
https://i.imgur.com/Jr28qPK.png  
![Texto](https://i.imgur.com/Jr28qPK.png)

**Cambio de Forma**  
https://i.imgur.com/3D5eVuM.png  
![Forma](https://i.imgur.com/3D5eVuM.png)

**Desactivado**  
https://i.imgur.com/FrcNppr.png  
![Desac](https://i.imgur.com/FrcNppr.png)

**Resultado**  
https://i.imgur.com/CouBrg2.png  
![Modificado](https://i.imgur.com/CouBrg2.png)

**Hover Modificado**  
https://i.imgur.com/3JY2X2T.png  
![Hover](https://i.imgur.com/3JY2X2T.png)

**Botón Desactivado**  
https://i.imgur.com/NZVEKYK.png  
![Desac](https://i.imgur.com/NZVEKYK.png)

---

## ⚪ ESTILO SIN ICONO

**Propiedades iniciales**  
https://i.imgur.com/9c8veIr.png  
![Inicial](https://i.imgur.com/9c8veIr.png)

**Hover inicial**  
https://i.imgur.com/hRo8Jzv.png  
![Hover](https://i.imgur.com/hRo8Jzv.png)

- Se puede personalizar `colorFondo1`, `colorFondo2`, `colorContorno`, `colorTexto`, `font`, `enabled`, `Forma`.  
- No permite iconos.

**Cambio de fondo**  
https://i.imgur.com/8fnArs4.png  
![Fondo](https://i.imgur.com/8fnArs4.png)

**Cambio de color de letra**  
https://i.imgur.com/G0NwOUw.png  
![Texto](https://i.imgur.com/G0NwOUw.png)

**Cambio de contorno**  
https://i.imgur.com/XsjE3Dc.png  
![Contorno](https://i.imgur.com/XsjE3Dc.png)

**Cambio de texto y tamaño**  
https://i.imgur.com/Ncp2hJF.png  
![Texto](https://i.imgur.com/Ncp2hJF.png)

**Cambio de Forma**  
https://i.imgur.com/C4SauJU.png  
![Forma](https://i.imgur.com/C4SauJU.png)

**Desactivado**  
https://i.imgur.com/0kD8RST.png  
![Desac](https://i.imgur.com/0kD8RST.png)

**Resultado final**  
https://i.imgur.com/Gg623OH.png  
![Modificado](https://i.imgur.com/Gg623OH.png)

**Hover con propiedades**  
https://i.imgur.com/TfbZUnu.png  
![Hover](https://i.imgur.com/TfbZUnu.png)

**Botón desactivado**  
https://i.imgur.com/NNw3LCT.png  
![Desact](https://i.imgur.com/NNw3LCT.png)

## 📄 Documentación

Puedes acceder a la documentación generada con Javadoc en GitHub Pages:

🔗 [Ver documentación Javadoc](https://cristianmartinezz1.github.io/Boton-Personalizado-en-Java/)


## 🎥 5. Vídeo en YouTube

A continuación se presenta un video explicativo que muestra cómo utilizar el componente `BotonPersonalizado` en un proyecto Java con NetBeans.

🔗 [Ver video en YouTube](https://youtu.be/dYaj9omDPU0)

- Se muestra cómo agregar el botón a la **paleta de componentes**.
- Se ejemplifica su uso en un formulario con `JFrame`.

