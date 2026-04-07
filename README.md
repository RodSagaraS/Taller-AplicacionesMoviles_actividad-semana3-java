# Taller-AplicacionesMoviles_actividad-semana3-java
TAM-Actividad-Semana 3 - Compilación y ejecución de programa Java
# Actividad Sumativa Semana 3 - Taller de Aplicaciones Móviles

## Descripción general
Este repositorio documenta el desarrollo de un programa Java ejecutado sin herramienta IDE, utilizando compilación por línea de comandos y ejecución mediante la JVM. Como parte del caso de estudio, también se registra el levantamiento inicial de requerimientos para una futura aplicación de una distribuidora de alimentos con despacho a domicilio.

## Estructura sugerida del repositorio
- `RegistroVehiculo.java`: código fuente del programa solicitado.
- `README.md`: descripción del proyecto y requerimientos.
- `historias_usuario.md`: historias de usuario del caso.
- `cronograma_inicial.md`: planificación inicial.

## Requerimientos funcionales del proyecto
1. El sistema debe permitir que el usuario se registre utilizando una cuenta Gmail.
2. El sistema debe permitir seleccionar productos de la distribuidora.
3. El sistema debe calcular el total de la compra.
4. El sistema debe calcular automáticamente el costo de despacho según las reglas del negocio.
5. El sistema debe considerar despacho gratis para compras sobre $50.000 dentro de un radio de 20 km.
6. El sistema debe cobrar $150 por kilómetro cuando la compra esté entre $25.000 y $49.999.
7. El sistema debe cobrar $300 por kilómetro cuando la compra sea menor a $25.000.
8. El sistema debe mostrar al usuario el total final, incluyendo o no el costo de despacho.
9. El sistema debe permitir ingresar datos básicos para pruebas por consola en esta etapa inicial.
10. El sistema debe mostrar en pantalla los datos capturados por teclado.

## Requerimientos no funcionales del proyecto
1. La solución debe ejecutarse sin IDE, desde línea de comandos.
2. El programa debe desarrollarse en Java.
3. El tiempo de respuesta para cálculos simples debe ser inmediato.
4. La interfaz de esta primera versión debe ser simple y entendible para cualquier usuario.
5. El código debe mantenerse comentado de forma breve y clara.
6. La aplicación futura debe ser fácil de mantener y ampliar.
7. La autenticación con Gmail debe proteger la información básica del usuario.
8. El proyecto debe quedar documentado en GitHub.

## Proceso de compilación
1. Instalar JDK.
2. Guardar el archivo `RegistroVehiculo.java`.
3. Abrir la consola en la carpeta del archivo.
4. Ejecutar `javac RegistroVehiculo.java`.
5. Confirmar la creación del archivo `RegistroVehiculo.class`.
6. Ejecutar `java RegistroVehiculo`.

## Resultado esperado
El programa solicita:
- Marca
- Modelo
- Cilindrada
- Tipo de combustible
- Capacidad en pasajeros

Luego muestra en pantalla los mismos datos ingresados por el usuario.
