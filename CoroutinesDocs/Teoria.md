
# Investigación Teórica: Corrutinas en Kotlin

## ¿Qué son las corrutinas en Kotlin?

Las corrutinas en Kotlin son una característica del lenguaje diseñada para facilitar el manejo de operaciones asíncronas. 
Una corrutina permite pausar la ejecución de una función y retomarla sin bloquear el hilo en el que se ejecuta. 
Esto hace que las corrutinas sean ideales para manejar tareas que toman tiempo, como solicitudes de red o interacciones con bases de datos, 
sin bloquear la interfaz de usuario.

## Principales conceptos relacionados con las corrutinas

- **launch**: Una función que inicia una nueva corrutina de manera asincrónica. Es utilizada para tareas que no devuelven un resultado.
- **async**: Una función que inicia una corrutina y devuelve un objeto `Deferred`, el cual representa el resultado de la tarea asincrónica.
  Para obtener el valor, se debe usar la función `await`.
- **suspend**: Modificador utilizado para marcar funciones que pueden suspenderse y retomarse. Estas funciones deben ejecutarse en una corrutina.
- **CoroutineScope**: Un contexto que permite controlar el ciclo de vida de las corrutinas. Se usa para lanzar corrutinas y cancelar su ejecución si es necesario.
- **Dispatchers**: Determinan el hilo en el que se ejecutará la corrutina. Algunos valores comunes son `Dispatchers.Main` para la interfaz de usuario y 
  `Dispatchers.IO` para operaciones de entrada/salida.

## ¿Cómo mejoran la eficiencia de las aplicaciones?

Las corrutinas mejoran la eficiencia al permitir que las operaciones de larga duración se realicen en segundo plano sin bloquear el hilo principal, 
lo que hace que las aplicaciones sean más responsivas y mantengan una interfaz fluida. A diferencia de los hilos tradicionales, las corrutinas 
son más ligeras en términos de recursos del sistema, ya que muchas corrutinas pueden ejecutarse en pocos hilos.

### Diferencia entre corrutinas y hilos tradicionales

Mientras que un hilo tradicional representa un proceso pesado del sistema operativo, una corrutina es una tarea liviana que puede 
suspenderse y reanudarse sin cambiar de hilo. Las corrutinas pueden ser gestionadas de manera más eficiente y en menor cantidad de recursos 
en comparación con los hilos convencionales.
        