import kotlin.random.Random

class Casilla {
    private var dado: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6)
    private var aleatorioDado = Random.nextInt(dado.size)
    private var arrayDeCadenas: Array<String> = arrayOf("trigo", "Carbon", "madera")
    private var aleatorioCadena = Random.nextInt(arrayDeCadenas.size)
    //println("Valor aleatorio: ${arrayDeCadenas[randomIndex]}")

    constructor(){
        aleatorioDado = Random.nextInt(dado.size)
        aleatorioCadena = Random.nextInt(arrayDeCadenas.size)
    }


    fun getDado(): Int {
        return dado[aleatorioDado]
    }
    fun getCadena(): String {
        return arrayDeCadenas[aleatorioCadena]
    }
    fun setDado(dado: Int) {
        this.dado[aleatorioDado] = dado
    }
    fun setCadena(cadena: String) {
        this.arrayDeCadenas[aleatorioCadena] = cadena
    }




    fun inicializarCasilla() {
        println("Valor aleatorio: ${arrayDeCadenas[aleatorioCadena]}")
        println("Valor aleatorio: ${dado[aleatorioDado]}")
    }

    fun mostrarCasilla() {
        println("Valor aleatorio: ${arrayDeCadenas[aleatorioCadena]}")
        println("Valor aleatorio: ${dado[aleatorioDado]}")
    }

    override fun toString(): String {
        return "Casilla(dado=${dado.contentToString()}, aleatorioDado=$aleatorioDado, arrayDeCadenas=${arrayDeCadenas.contentToString()}, aleatorioCadena=$aleatorioCadena)"
    }


}