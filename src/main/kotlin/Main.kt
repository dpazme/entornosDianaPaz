fun main(args: Array<String>) {
    //Vamos a implementar un juego conocido como Conquistadores de Catán. Nuestro juego será
    //mucho más sencillo que el original y sólo permitirá a dos jugadores: un humano y el
    //ordenador.
    //El funcionamiento es el siguiente:
    //El juego consiste en un mapa de 3x4 casillas, en cada casilla habrá un recurso (trigo, madera y
    //carbón); un jugador que será el dueño de esa casilla y un valor numérico entre 1 y 6 (valores
    //de un dado).
    //Al principio se inicializará el tablero colocando en cada casilla un recurso (de forma aleatoria) y
    //asignándole un valor (también de forma aleatoria entre 1 y 6).
    //Al comienzo los dos jugadores tienen sus almacenes de madera, carbón y trigo a cero.
    //Después le preguntamos al usuario que casilla quiere ocupar y la convertimos en propiedad del
    //mismo, luego el ordenador elige una casilla vacía al azar y la ocupa; posteriormente le
    //volvemos a preguntar al usuario, luego el ordenador… y así hasta que estén las 12 casillas
    //ocupadas (tengan propietario).
    //Una vez completado el tablero, comienza el juego:
    //Tiran los jugadores por turnos. El valor del dado se comparará con todos los valores de las
    //casillas del tablero y con aquellos que coincidan se incrementará la cantidad de recursos que
    //esas casillas indiquen a los propietarios de dichas casillas.
    //Ganará el primero que consiga llegar a 20 en todos los recursos.


    //Inicializamos el tablero
    var tablero = Tablero()
    tablero.inicializarTablero()
    tablero.mostrarTablero()

    //Inicializamos los jugadores


    //Jugamos
var jugador1 = Jugadores("Jugador 1")//creamos el objeto jugador1
var jugador2 = Jugadores("Jugador 2")//creamos el objeto jugador2
var turno = 0
var dado = Casilla()
var valorDado = 0
var casilla = 0
var casillaOcupada = false
var casillaOcupada2 = false
var casillaOcupada3 = false
var casillaOcupada4 = false





}