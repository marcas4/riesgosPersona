# Gestión de riesgos personales
## Tabla de contenido
#### Marco Teórico
#### Funcionamiento
#### Tecnologías
#### Compilación
#### Empaquetado
#### Ejecución
#### Árbol del proyecto
#### Diagrama de clases
#### Manual de usuario
#### Agradecimientos


## Marco Teórico
La gestión de riesgos es un proceso mediante el cual identificamos, evaluamos y tomamos medidas para lidiar con las posibles amenazas o incertidumbres que podrían afectar nuestros objetivos o resultados. 
Consiste en una secuencia de actividades humanas que incluyen la identificación, el análisis y la evaluación de riesgo, seguido por el establecimiento de estrategias de tratamiento utilizando recursos gerenciales. En resumen, la gestión de riesgos es el proceso sistemático de identificar, evaluar y mitigar los riesgos potenciales.

La gestión de riesgos en el ámbito personal es fundamental para tomar decisiones informadas y protegerse contra posibles adversidades. 

##### Salud y bienestar:
Identificar riesgos para la salud, como enfermedades crónicas, lesiones o hábitos poco saludables.
Tomar medidas preventivas, como hacer ejercicio, llevar una dieta equilibrada y realizar chequeos médicos regulares.
##### Finanzas personales:
Evaluar riesgos financieros, como la pérdida de empleo, deudas o inversiones arriesgadas.
Crear un fondo de emergencia y diversificar las inversiones para mitigar riesgos financieros.
Seguridad en el hogar:
Identificar riesgos en el hogar, como incendios, robos o accidentes domésticos.
Implementar medidas de seguridad, como instalar alarmas, tener extintores y mantener las áreas libres de obstáculos.
##### Relaciones personales:
Reconocer riesgos en relaciones interpersonales, como conflictos, malentendidos o falta de comunicación.
Establecer límites saludables y buscar soluciones constructivas en situaciones conflictivas.
##### Planificación a largo plazo:
Considerar riesgos futuros, como la jubilación, la educación de los hijos o la atención médica en la vejez.
Crear un plan financiero y legal para abordar estos riesgos.

### Beneficios de la gestión de riesgos
Gestionar tus propios riesgos personales conlleva varios beneficios específicos. Algunos de ellos incluyen:

**1.** **Paz mental y reducción de la ansiedad:** Al identificar y abordar los riesgos, te sientes más preparado y menos ansioso ante situaciones inciertas. Saber que estás tomando medidas para protegerte brinda tranquilidad.

**2.** **Mejora de la toma de decisiones:** La gestión de riesgos te ayuda a evaluar las opciones de manera más informada. Al considerar los posibles escenarios y sus implicaciones, puedes tomar decisiones más acertadas.

**3.** **Protección financiera:** Al gestionar tus riesgos financieros, como invertir de manera inteligente o tener un fondo de emergencia, proteges tus recursos económicos. Esto te permite enfrentar imprevistos sin sufrir grandes pérdidas.

**4.** **Adaptabilidad y resiliencia:** La gestión de riesgos te hace más adaptable a los cambios y más resiliente frente a obstáculos. Aprendes a anticiparte y a ajustarte según las circunstancias.

**5.** **Mejora de la salud y el bienestar:**  Al reconocer riesgos para la salud, como malos hábitos o falta de ejercicio, puedes tomar medidas preventivas. Esto contribuye a una vida más saludable.

**6.** **Seguridad en el hogar y en las relaciones:** Identificar riesgos en el hogar y en las relaciones interpersonales te ayuda a protegerte y a mantener un entorno seguro.

Un software de gestión de riesgos personales es esencial porque nos ayuda a identificar, evaluar y abordar posibles amenazas en nuestra vida cotidiana. Al utilizarlo, podemos tomar decisiones más informadas, protegernos contra pérdidas financieras, mantener nuestra salud y bienestar, y anticiparnos a situaciones adversas. Este tipo de software actúa como un “guardián” que nos ayuda a vivir de manera más segura y resiliente. 

### Funcionamiento

Este software de gestión de riesgos nos da un cuestionario de 12 secillas preguntas que debemos responder con "si" o "no"
Después de esto, el programa sacará el resultado de los riesgos para que usted pueda tener en cuenta a qué riesgos debe ponerles cuidado y pensar en controles para poder mitigarlos.

### Tecnologías
Este software está desarrollado en java 21, con maven 3.9.5

Utiliza el plugin picocli

Para mas iformación sobre este plugin:  [Información sobre picocli](https://laboratoriolinux.es/index.php/-noticias-mundo-linux-/software/34261-picocli-un-poderoso-framework-para-la-creacion-de-aplicaciones-de-linea-de-comandos.html)

## Para la ejecución del proyecto se deben seguir los siguientes pasos después de descargarlo:

### Compilación
Estando en la raiz del proyecto se debe dar el siguiente comando para compilar
```bash
$mvn compile
```

![Compilación](images/compile.jpg?raw=true)

### Empaquetado
Como segundo paso empaquetamos el proyecto con la instrucción:
```bash
$mvn package
```

![Empaquetado](images/empaquetado.jpg?raw=true)
### Ejecución
Ahora procederemos a ejecutar nuestra aplicación.
```bash
$java -cp target/riesgos-jar-with-dependencies.jar riesgos.main
```
![Ejecución](images/ejecucion.jpg?raw=true)

Depués de contestar las 12 preguntas el programa le entregará el resultado, cada resultado es personal y depende únicamente de las respuestas entregadas.

### Árbol del proyecto

```bash
tree
├─ .git
├─ .gitignore
├─ img
│  ├─ compile.jpg
│  ├─ empaquetado.jpg
│  ├─ ejecucion.jpg
│  ├─ diagramaDeClases.jpg
│  ├─ inicio.jpg
│  └─ preguntas.jpg
├─ src
│  ├─ main
│  │  ├─ java
│  │  │  ├─ controller
│  │  │  │  ├─ Amenazas.java
│  │  │  │  └─ EscenariosDeRiesgos.java
│  │  │  │
│  │  │  ├─ modelo
│  │  │  │  ├─ Escenario.java
│  │  │  │  ├─ JEnv.java
│  │  │  │  └─ Riesgo.java
│  │  │  │ 
│  │  │  ├─ riesgos
│  │  │     └─ main.java
│  │  │  
│  │  ├─ resources
│  │     ├─ parametros.properties
│  │     └─ riesgos.properties
│  ├─ test
│  │  ├─ java
│        ├─ javatest
│        └─ EscenariosDeRiesgosTest.java
├─ pom.xml
└─Readme.md

```

### Diagrama de clases

![Diagrama de clases](images/diagramaDeClases.png?raw=true)

### Manual de usuario

Al iniciar el programa se mostrará un texto de bienvenida y  se deberá dar cualquier tecla para continuar o si desea salir debe dar el número 1
![Inicio](images/inicio.jpg?raw=true)

Inmediatamente después se empezarán a desplegar una a una las doce (12) preguntas que debe responder con “si” o “no”, si responde de forma distinta se repetirá la palabra hasta que responda de forma correcta

![Preguntas](images/preguntas.jpg?raw=true)

Al finalizar las 12 preguntas se mostrará un texto con los resultados del análisis de sus respuestas a cada una de las preguntas.
Cada resultado es personal y depende únicamente de las respuestas a las preguntas. 
Es conveniente que una vez haya puesto en práctica los controles para mitigar los riesgos que le mostró el resultado final, vuelva a realizar el análisis para comprobar que efectivamente ha mitigado los riesgos identificados

## Agradecimientos

Gracias a codigofacilito.com por darme la oportunidad de estudiar este bootcamp, gracias a los instructores e instructoras que hicieron posible el aprendizaje.

