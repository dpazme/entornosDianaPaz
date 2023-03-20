class Tablero {
    private var casillas = Array(3) { Array(4) { Casilla() } }

    constructor() {
        casillas = Array(3) { Array(4) { Casilla()} }
    }

    fun getCasillas(): Array<Array<Casilla>> {
        return casillas
    }

    fun setCasillas(casillas: Array<Array<Casilla>>) {
        this.casillas = casillas
    }


    fun inicializarTablero() {
        for (i in 0..2) {
            for (j in 0..3) {
                casillas[i][j].inicializarCasilla()
            }
        }
    }
    fun mostrarTablero() {
        for (i in 0..2) {
            for (j in 0..3) {
                casillas[i][j].mostrarCasilla()
            }
        }
    }

    override fun toString(): String {
        return "Tablero(casillas=${casillas.contentToString()})"
    }


}