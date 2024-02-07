public class Ej1 {
    public static void main(String[] args) {
    //Defino variables.
    short diasEnUnAnio = 365;
    byte horasEnUnDia = 24;
    byte minutosEnUnaHora = 60;
    short segundosEnUnMinuto = 60;
    //Calculo el total de segundos en un año.
    int segundosEnUnAnio = calcularSegundosEnUnAnio(diasEnUnAnio, horasEnUnDia, minutosEnUnaHora, segundosEnUnMinuto);
    //Muestra el resultado.
    System.out.println("Un año tiene " + segundosEnUnAnio + " segundos.");
    }
    //Función que calcula el total de segundos en un año.
    public static int calcularSegundosEnUnAnio (int dias, int horas, int minutos, int segundos) {
        return dias * horas * minutos * segundos;
    }
}
