# Introducción a Ciencias de la Computación — Práctica 1

## 👥 Datos identificadores

* **Alumno:** Brandon Pérez Hernandez
* **Profesor:** Salvador López Mendoza
* **Ayudante:** Yanahí Demerio Torres
* **Ayudante de Laboratorio:** Rosa Victoria Villa Padilla
* **Fecha de Entrega:** 9 de octubre de 2026

## Objetivo
El objetivo de esta práctica es que el alumno se familiarice con la creación y uso de objetos de la clase String utilizando algunos métodos de dicha clase en la elaboración de un programa.

## 🛠️ Contenido de la Práctica

El proyecto se compone de dos programas principales integrados dentro de la estructura `BPerez/practica01/src/icc/

## 1. Psicólogo

## Descripción general
La práctica consiste en utilizar cadenas de caracteres y algunos de los métodos de dicha clase en la elaboración de un programa para simular una sesión con un psicólogo.

## Comportamiento
(a) Dar bienvenida y solicitar el nombre del paciente.

(b) Recabar el nombre del paciente.

(c) Saludar al paciente y preguntar cuál es su problema.

(d) Leer, en una línea, la descripción del problema del paciente.

(e) Contestar MMMM... ya veo, luego en otra línea Y digame... y otra línea más preguntar Por qué dice e incluir la respuesta anterior entre comillas.

(f) Leer, la respuesta del paciente.

(g) Finalmente decir Muy interesante!!, Hablaremos de ello con más detalle en la siguiente sesión.

## Salida 

```bash
Bienvenido, cual es su nombre?
Alberto
Buenas tardes Alberto.
Digame, cuál es su problema en la vida?
Odio tener clase los viernes
MMMM... ya veo
Y digame ...
Por qué dice "odio tener clases los viernes"?
Porque no puedo concentrarme y el fin de semana me parece muy corto.
Muy interesante!! Hablaremos de ello con más detalle en la siguiente sesión.
```

## 2 RFC 
## Descripción general
La práctica consiste en utilizar cadenas de caracteres y algunos de los métodos más importantes de dicha clase en la elaboración de un programa para generar una clave al estilo del RFC de las personas.
El RFC se obtiene tomando las dos primeras letras del apellido paterno, la inicial del apellido materno y la inicial del nombre, seguido de los dos últimos dígitos del año de nacimiento, los dos dígitos del mes de nacimiento y dos dígitos del día de nacimiento. Por ejemplo, si la persona se llama Andrea Lopez Lopez y nació el 14/04/1992, su RFC es lola920414.

## Comportamiento

(a) Solicitar al usuario su nombre completo, en una línea.

(b) Solicitar al usuario su fecha de nacimiento, en formato dd/mm/aa, es decir, dos dígitos para el día, dos para el mes y dos más para el año. Cada dato separado por una diagonal.

(c) Recabar los datos solicitados.

(d) Extraer la inicial del nombre de la persona.

(e) Extraer las dos primeras letras del apellido paterno.

(f) Extraer la inicial del apellido materno.

(g) Formar el RFC con las letras antes obtenidas.

(h) Manipular la fecha de nacimiento, es decir extraer el año, el mes y el día y agregarlo al RFC.

## Salida

```bash
Dame el nombre completo
Andrea Lopez Lopez
ingresa la fecha de nacimiento en formato dd/mm/aa
14/04/92
El RFC de Andrea Lopez Lopez es: LOLA920414
```


## 💻 Requisitos del Sistema e Instalación
* **Java SDK:** OpenJDK 25 o superior
* **Documentación:** Todo el código fuente está documentado siguiendo el estándar **Javadoc**.

*Facultad de Ciencias, UNAM — 2026*
