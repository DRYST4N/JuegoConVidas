public class Main {
    public static void main(String[] args) {
        JuegoConVidas Juego1 = new JuegoConVidas(5);
        Juego1.muestraVidasIniciales();
        Juego1.quitarVida();
        JuegoConVidas Juego2 = new JuegoConVidas(5);
        Juego2.muestraVidasIniciales();
        Juego2.actualizarRecord();
        Juego2.quitarVida();
        Juego1.actualizarRecord();
        Juego1.muestraVidasIniciales();
        Juego1.actualizarRecord();
    }
}