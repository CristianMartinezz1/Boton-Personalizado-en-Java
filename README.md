# 🎨 Botón Personalizado en Java Swing

Este proyecto implementa un componente visual reutilizable en Java: un **botón personalizado** que permite modificar su estilo, forma, colores e íconos desde código o visualmente en NetBeans.

---

## 👥 Colaboradores

- Cristian Martínez Pacheco – [@CristianMartinezz1](https://github.com/CristianMartinezz1)  
- Ángel Eduardo Velasco Vásquez


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
![Inicial](https://i.imgur.com/UnO9R4Q.png)

**Propiedades al pasar el mouse sobre el botón**  
![Hover](https://i.imgur.com/wIjZb3F.png)

- El usuario puede adaptar desde propiedades tanto el color del fondo uno como el color del fondo dos (`colorFondo1`, `colorFondo2`).  
- El usuario puede adaptar desde propiedades tanto el icono uno como el icono dos (`iconoNormal`, `iconoHover`).  
- El usuario puede adaptar desde propiedades el color del contorno del botón (`colorContorno`).  
- El usuario puede adaptar desde propiedades el color de la letra (`colorTexto`), tamaño y estilo (`font`).  
- El usuario puede activar o desactivar el botón desde propiedades (`enabled`).  
- El usuario puede cambiar la forma del botón desde propiedades, ya sea a Rectángulo, Círculo u Óvalo (`Forma`).  

**Cambio de fondo uno y dos**  
![Fondo](https://i.imgur.com/iI5RpgM.png)

**Cambio de color de letra**  
![Texto](https://i.imgur.com/Qp650L8.png)

**Cambio de iconos**  
![Iconos](https://i.imgur.com/ltCKws5.png)

**Cambio de color del contorno**  
![Contorno](https://i.imgur.com/qL4X2zq.png)

**Cambio de estilo de texto y tamaño**  
![EstiloTexto](https://i.imgur.com/AD6VLHm.png)

**Cambio de Forma**  
![Forma](https://i.imgur.com/hIYFfWX.png)

**Desactivado**  
![Desactivado](https://i.imgur.com/DiNDKnJ.png)

**Resultado - Propiedades modificadas**  
![Modificado](https://i.imgur.com/hFxAN7k.png)

**Resultado - Hover con propiedades modificadas**  
![HoverMod](https://i.imgur.com/hZYiBg5.png)

**Resultado - Botón desactivado**  
![FinalDesactivado](https://i.imgur.com/QBoghAq.png)

---

## 🟦 ESTILO SIN FONDO

**Propiedades iniciales**  
![Inicial](https://i.imgur.com/1hNbKWU.png)

**Propiedades al pasar el mouse sobre el botón**  
![Hover](https://i.imgur.com/iwgVOqa.png)

- El usuario puede adaptar desde propiedades el color uno y el color dos (`colorSinFondo1`, `colorSinFondo2`).  
- El usuario puede adaptar los iconos (`iconoNormal`, `iconoHover`).  
- El usuario puede adaptar el tamaño y estilo de la letra (`font`).  
- El usuario puede activar o desactivar el botón (`enabled`).  
- El usuario puede cambiar la forma del botón (`Forma`).  

**Cambio de color uno y dos**  
![Colores](https://i.imgur.com/iwgVOqa.png)

**Cambio de iconos**  
![Iconos](https://i.imgur.com/IwNazUe.png)

**Cambio de estilo de texto y tamaño**  
![Texto](https://i.imgur.com/ww2Wriq.png)

**Cambio de Forma**  
![Forma](https://i.imgur.com/pL5Z1Zf.png)

**Desactivado**  
![Desact](https://i.imgur.com/VD40FFP.png)

**Resultado - Propiedades modificadas**  
![Modificado](https://i.imgur.com/1QKVwxt.png)

**Resultado - Hover modificado**  
![Hover](https://i.imgur.com/av1S8x2.png)

**Resultado - Botón desactivado**  
![Desactivado](https://i.imgur.com/hOpwQ9Z.png)

---

## ⚫ ESTILO PLANO

**Propiedades iniciales**  
![Inicial](https://i.imgur.com/JSPc9l2.png)

**Propiedades al pasar el mouse**  
![Hover](https://i.imgur.com/xxFWzjV.png)

- El usuario puede adaptar los iconos (`iconoNormal`, `iconoHover`).  
- Se puede cambiar el tamaño y estilo del texto (`font`).  
- Puede activarse o desactivarse (`enabled`).  
- Se puede cambiar la forma (`Forma`).  
- El color siempre será negro, no editable.

**Cambio de iconos**  
![Iconos](https://i.imgur.com/IVnHqlt.png)

**Cambio de texto**  
![Texto](https://i.imgur.com/Jr28qPK.png)

**Cambio de Forma**  
![Forma](https://i.imgur.com/3D5eVuM.png)

**Desactivado**  
![Desac](https://i.imgur.com/FrcNppr.png)

**Resultado**  
![Modificado](https://i.imgur.com/CouBrg2.png)

**Hover Modificado**  
![Hover](https://i.imgur.com/3JY2X2T.png)

**Botón Desactivado**  
![Desac](https://i.imgur.com/NZVEKYK.png)

---

## ⚪ ESTILO SIN ICONO

**Propiedades iniciales**  
![Inicial](https://i.imgur.com/9c8veIr.png)

**Hover inicial**  
![Hover](https://i.imgur.com/hRo8Jzv.png)

- Se puede personalizar `colorFondo1`, `colorFondo2`, `colorContorno`, `colorTexto`, `font`, `enabled`, `Forma`.  
- No permite iconos.

**Cambio de fondo**  
![Fondo](https://i.imgur.com/8fnArs4.png)

**Cambio de color de letra**  
![Texto](https://i.imgur.com/G0NwOUw.png)

**Cambio de contorno**  
![Contorno](https://i.imgur.com/XsjE3Dc.png)

**Cambio de texto y tamaño**  
![Texto](https://i.imgur.com/Ncp2hJF.png)

**Cambio de Forma**  
![Forma](https://i.imgur.com/C4SauJU.png)

**Desactivado**  
![Desac](https://i.imgur.com/0kD8RST.png)

**Resultado final**  
![Modificado](https://i.imgur.com/Gg623OH.png)

**Hover con propiedades**  
![Hover](https://i.imgur.com/TfbZUnu.png)

**Botón desactivado**  
![Desact](https://i.imgur.com/NNw3LCT.png)


## 📄 Documentación

Puedes acceder a la documentación generada con Javadoc en GitHub Pages:

🔗 [Ver documentación Javadoc](https://cristianmartinezz1.github.io/Boton-Personalizado-en-Java/)


## 🎥 5. Vídeo en YouTube

A continuación se presenta un video explicativo que muestra cómo utilizar el componente `BotonPersonalizado` en un proyecto Java con NetBeans.

🔗 [Ver video en YouTube](https://youtu.be/dYaj9omDPU0)

- Se muestra cómo agregar el botón a la **paleta de componentes**.
- Se ejemplifica su uso en un formulario con `JFrame`.

