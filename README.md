## Compilar proyecto fuentes de la actividad1
Nos ubicamos en la carpeta raiz que es actividad1.

Ejecutamos la compilación al .java ubicado en la ruta: fuentes/modulo1/Prueba1.java

## Proyecto fuentes

### Compilar
#### `javac -cp . fuentes/modulo1/Prueba1.java`

### Ejecutar
#### `java fuentes.modulo1.Prueba1`

### Generar .jar
#### `jar cmf MANIFEST.mf libreriacomun.jar fuentes/modulo1/Prueba1.class fuentes/modulo2/Prueba2.class`

### Ejecutar .jar
#### `java -jar libreriacomun.jar`

## Proyecto otro

### Compilar
#### `javac -cp . Otro/raiz/Prueba3.java`

### Ejecutar
#### `java Otro.raiz.Prueba3`