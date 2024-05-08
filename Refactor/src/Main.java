public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro(85, 66, 85);
        Mula mula = new Mula(95, 92, 110);
        Camion camion = new Camion(75, 76, 95);
        Comparendo comparendo = new Comparendo(carro, mula, camion);

        System.out.println("Fotomulta para CARRO A 80 km/h: " + comparendo.calcularFotomultas("CARRO", 80, 85, 66,85) + comparendo.enviarCorreoFotomulta("CARRO"));
        System.out.println("Fotomulta para MULA A 200 km/h: " + comparendo.calcularFotomultas("MULA", 200, 95, 92,110) + comparendo.enviarCorreoFotomulta("MULA"));
        System.out.println("Fotomulta para CAMION A 40 km/h: " + comparendo.calcularFotomultas("CAMION", 40, 75, 76,95) + comparendo.enviarCorreoFotomulta("CAMION"));
        System.out.println("Fotomulta para AVION A 40 km/h: " + comparendo.calcularFotomultas("AVION", 40, 0, 0,0) + comparendo.enviarCorreoFotomulta("AVION"));



    }
}