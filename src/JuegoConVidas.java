public class JuegoConVidas {
    public int vidas;
    public int vidas_iniciales;
    public int record = 0;

    public JuegoConVidas(int vidas){
        this.vidas_iniciales = vidas;
        this.vidas = vidas;
    }
    public void muestraVidasIniciales(){
        System.out.println("Vidas Iniciales: " + vidas_iniciales);
    }
    public void muestraVidasRestantes(){
        System.out.println("Vidas: " + vidas);
    }
    public boolean quitarVida(){
        vidas -= 1;
        boolean devolver = true;
        if (vidas > 0){
            muestraVidasRestantes();
        }else if(vidas == 0){
            System.out.println("Juego Terminado");
            devolver = false;
        }
        return devolver;
    }
    public void reiniciarPartida(){
        vidas = vidas_iniciales;
    }
    public void actualizarRecord(){
        if (vidas == record){
            System.out.println("Se ha alcanzado el record");
        } else if (vidas > record) {
            System.out.println("Se ha batido el record");
            record = vidas;
        }
    }

}
