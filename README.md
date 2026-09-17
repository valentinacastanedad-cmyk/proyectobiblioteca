# SISTEMA DE INVENTARIO

## INTEGRANTES

- VALENTINA CASTAÑEDA DIAZ
- KIAARA LORENA LOPEZ RAMOS  

## DESCRIPCIÓN

Sistema de inventario desarrollado en Java para gestionar productos de una biblioteca. El programa permite registrar productos, mostrar el inventario y buscar productos mediante su código.

## FUNCIONALIDADES

- Registrar productos.
- Mostrar todos los productos registrados.
- Buscar un producto por su código.
- Calcular el valor total del inventario.
- Manejar errores cuando se ingresa una opción no válida.
- Informar cuando un producto no se encuentra.

## CLASES

- `Producto`: representa los productos del inventario y contiene sus datos.
- `Inventario`: almacena los productos y permite gestionarlos.
- `ProductoNoEncontradoException`: controla el error cuando no se encuentra un producto.
- `Main`: contiene el menú principal y permite interactuar con el sistema.

## EJECUCIÓN

Para ejecutar el programa se deben compilar los archivos Java y luego iniciar la clase principal.

```bash
javac *.java
java Main

## TECNOLOGÍAS

- Java 21
- Programación Orientada a Objetos (POO)
- ArrayList
- Arreglos
- Manejo de excepciones
