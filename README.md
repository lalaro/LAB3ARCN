# Lab 3 ARCN

Para clonar el proyecto 

git clone  ´ https://github.com/lalaro/LAB3ARCN.git ´

### Prerrequisitos

Se necesita de Maven (La versión más reciente) y Java 23, la instalación debe realizarse desde las paginas oficiales de cada programa.


### Instalación

Para Maven debe irse a https://maven.apache.org/download.cgi, descargar la versión más nueva que allá de Maven (En este caso tenemos la versión 3.9.6) y agregarse en la carpeta de Program Files, luego se hace la respectiva configuración de variables de entorno según la ubicación que tenemos para el archivo de instalación, tanto de MAVEN_HOME y de Path.
Luego revisamos que haya quedado bien configurado con el comando para Windows:

` mvn - v `
o
` mvn -version `

Para Java debe irse a https://www.oracle.com/java/technologies/downloads/?er=221886, descargar la versión 23 de Java y agregarse en la carpeta de Program Files, luego se hace la respectiva configuración de variables de entorno según la ubicación que tenemos para el archivo de instalación, tanto de JAVA_HOME y de Path.
Luego revisamos que haya quedado bien configurado con el comando para Windows:

` java -version `

Si no tenemos la versión solicitada podemos hacer lo siguiente, para el caso de Windows:

Ir al Windows PowerShell y ejecutar como administrador los siguientes codigos:

` [System.Environment]::SetEnvironmentVariable("JAVA_HOME", "C:\Program Files\Java\jdk-23", [System.EnvironmentVariableTarget]::Machine) `

Revisar las rutas de la máquina

`  $env:JAVA_HOME = "C:\Program Files\Java\jdk-23" `

`  $env:Path = "C:\Program Files\Java\jdk-23\bin;" + $env:Path `

`  echo $env:JAVA_HOME `

`  javac -version `

`  java -version `

O con Codespaces se genera todo el entorno automáticamente.

## Compilación del proyecto

Para compilar el proyecto:

´ mvn clean ´

´ mvn package ´

´ mvn compile ´

´ mvn test ´

## Autenticación de formularios

Este proyecto incluye pruebas para la autenticación de formularios, simulando el proceso de inicio de sesión de un usuario. Se utilizan Selenium y Mockito para interactuar con la página de inicio de sesión y verificar el comportamiento de la aplicación en diferentes escenarios (inicio de sesión exitoso, inicio de sesión fallido, campos vacíos, etc.).

## Pruebas

Las pruebas en este proyecto se dividen en:

1. Pruebas unitarias (JUnit y Mockito): verifican la lógica de negocio de la aplicación, simulando el comportamiento de las dependencias externas.
2. Pruebas de integración (Selenium): verifican la interacción entre la aplicación y la interfaz de usuario, simulando el comportamiento de un usuario real.
3. Pruebas de comportamiento (Cucumber): describen el comportamiento de la aplicación en lenguaje natural, facilitando la comunicación entre desarrolladores y stakeholders.

Las pruebas garantizan la calidad del código, detectan errores tempranamente y facilitan la refactorización y el mantenimiento del proyecto.

## Construido con

* [Maven](https://maven.apache.org/) - Gestión de dependencias.
* [Java](https://www.java.com/es/) - Versionamiento en Java.
* [GitHub](https://docs.github.com/es) - Sistema de control de versiones distribuido.
* [IntelliJ](https://www.jetbrains.com/es-es/idea/) - Entorno de desarrollo integrado.
* [Selenium](https://www.selenium.dev/) - Automatización de navegadores web.
* [Cucumber](https://cucumber.io/) - Pruebas de comportamiento.
+ [Mockito](https://site.mockito.org/) - Framework de mocking para pruebas unitarias.

**Autor**
- Laura Valentina Rodríguez Ortegón **Ing de Sistemas**
