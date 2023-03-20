class Jugadores {
    private var turno: String = ""
    private var jugador: String = ""
    private var jugador2: String = ""

    constructor( turno: String, jugador: String, jugador2: String) {

        this.turno = turno
        this.jugador = jugador
        this.jugador2 = jugador2
    }

    constructor() {

        this.turno = ""
        this.jugador = ""
        this.jugador2 = ""
    }

    fun getTurno():String{
        return turno
    }

    fun getJugador():String{
        return jugador
    }

    fun getJugador2():String{
        return jugador2
    }

    fun setTurno(turno:String){
        this.turno = turno
    }

    fun setJugador(jugador:String){
        this.jugador = jugador
    }

    fun setJugador2(jugador2:String){
        this.jugador2 = jugador2
    }

    override fun toString(): String {
        return "Jugadores(turno='$turno', jugador='$jugador', jugador2='$jugador2')"
    }


}