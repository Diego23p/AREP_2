# Laboratorio 2 - INTRODUCTION TO COMPUTER SYSTEM DESIGN

Programa que calcula la media y la desviación estandar de un conjunto de N numeros reales ingresados por medio de una página web

## Inicialización

Herramientas requeridas para ejecutar el programa

### prerrequisitos

#### Java

Es una plataforma necesaria para que Maven ejecute, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:
```
> java -version

java version "1.8.0_101"
Java(TM) SE Runtime Environment (build 1.8.0_101-b13)
Java HotSpot(TM) Client VM (build 25.101-b13, mixed mode)
```

#### Maven

La estructura está estandalizada con Maven, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:
```
> mvn -v

Apache Maven 3.6.0 (97c98ec64a1fdfee7767ce5ffb20918da4f719f3; 2018-10-24T13:41:47-05:00)
Maven home: C:\apache-maven-3.6.0\bin\..
Java version: 1.8.0_201, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk1.8.0_201\jre
Default locale: es_CO, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

#### Git

Se usará el sistema de control de versiones Git, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:
```
> git --version

git version 2.21.0.windows.1
```

#### Heroku

La página web se encuentra alojada en la nube usando Heroku, para comprobar que se tengan los requisitos localmente:

```
> heroku -v

heroku/7.39.0 win32-x64 node-v12.13.0
```

## Instalación

Para descargar localmente el repositorio se utiliza el comando como sigue:
```
> git clone https://github.com/Diego23p/AREP_2.git
```

Para compilar el proyecto usando Maven:
```
> mvn package
```

## Ejecutando el Programa

Para ejecutar el programa localmente haciendo uso de Heroku, se necesita desde la línea de comandos:
```
> mvn clean install

> heroku local web
```
En la página web se deben ingresar los números en el campo de ingreso separados por comas

## Ejecutando los Test

Para ejecutar únicamente los test, se tiene el siguiente comando desde CMD:
```
> mvn test

[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running edu.escuelaing.arep.CalculatorTest
[INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.271 s - in edu.escuelaing.arep.CalculatorTest
[INFO]
[INFO] Results:
[INFO]
[INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.428 s
[INFO] Finished at: 2020-08-10T11:17:13-05:00
[INFO] ------------------------------------------------------------------------
```

Los seis primeros test evalúan el funcionamiento de la linkedList como tal, los siguientes cuatro test prueban casos en donde debería y no debería coincidir los números esperados de media y desviación estandar.


### Generar JavaDoc

```
mvn javadoc:javadoc
```

## Heroku

La aplicación desplegada en la nube se encuentra en: 

[![Heroku](https://camo.githubusercontent.com/be46aee4f8d55e322c3e7db60ea23a4deb5427c9/68747470733a2f2f6865726f6b752d62616467652e6865726f6b756170702e636f6d2f3f6170703d6865726f6b752d6261646765)](https://boiling-cove-24254.herokuapp.com/inputdata)

# Descripción del Diseño

[disenoLab2.pdf](disenoLab2.pdf)

# Autores

- [Diego Alejandro Puerto Gómez](https://github.com/Diego23p)

# Licencia

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
