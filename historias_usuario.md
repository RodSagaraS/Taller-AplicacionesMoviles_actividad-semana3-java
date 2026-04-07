# Historias de usuario

## HU1 Registro con Gmail
Como cliente de la distribuidora,  
quiero registrarme con mi cuenta Gmail,  
para acceder de forma rápida y sencilla a la aplicación.

**Criterios de aceptación**
- El sistema debe permitir iniciar sesión con cuenta Gmail.
- El usuario debe poder ingresar a la aplicación tras autenticarse correctamente.
- Si la autenticación falla, el sistema debe informar el error.

## HU2 Compra de productos
Como cliente,  
quiero seleccionar productos y ver el total de mi compra,  
para saber cuánto pagaré antes de confirmar el pedido.

**Criterios de aceptación**
- El sistema debe listar productos disponibles.
- El usuario debe poder agregar productos a un carrito.
- El sistema debe calcular el subtotal en tiempo real.

## HU3 Cálculo de despacho
Como cliente,  
quiero que el sistema calcule el despacho automáticamente,  
para conocer el valor final de mi compra según mi ubicación y monto gastado.

**Criterios de aceptación**
- Si la compra supera $50.000 y está dentro de 20 km, el despacho debe ser gratis.
- Si la compra está entre $25.000 y $49.999, se deben cobrar $150 por km.
- Si la compra es menor a $25.000, se deben cobrar $300 por km.
- El total final debe mostrarse antes de confirmar la compra.

## HU4 Prototipo por consola
Como estudiante desarrollador,  
quiero crear un programa Java simple por consola,  
para demostrar el uso de entrada, salida, compilación y ejecución sin IDE.

**Criterios de aceptación**
- El programa debe solicitar datos por teclado con `Scanner`.
- El programa debe mostrar los datos ingresados con `System.out`.
- El programa debe compilarse con `javac`.
- El programa debe ejecutarse con `java`.
