
import kotlinx.coroutines.*

fun main() {
    // Iniciar una corrutina en el alcance global
    GlobalScope.launch(Dispatchers.IO) {
        val result = fetchDataAsync()
        println("Resultado obtenido: $result")
    }
    Thread.sleep(2000) // Esperar para permitir que la corrutina termine antes de que el programa finalice
}

// Función suspendida que simula una operación de red
suspend fun fetchDataAsync(): String {
    delay(1000) // Simular un retraso en la operación
    return "Datos obtenidos de la red"
}
        