public class Comparendo {
    private Carro carro;
    private Mula mula;
    private Camion camion;

    public Comparendo(Carro carro, Mula mula, Camion camion) {
        this.carro = carro;
        this.mula = mula;
        this.camion = camion;
    }

    public String calcularFotomultas(String tipoVehiculo, int velocidad, int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        if (tipoVehiculo.equals("CARRO") || tipoVehiculo.equals("CAMION") || tipoVehiculo.equals("MULA"))  {
            if (velocidad <= limiteInferior) {
                return "0";
            } else if (velocidad >= limiteInferiorIntermedio && velocidad <= limiteSuperior) {
                return "1";
            }
            return "2";
        }
        return "Tipo de vehículo no reconocido";
    }

    public int calcularComparendo(int velocidad, String vehiculo, int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        if (vehiculo.equals("CARRO") || vehiculo.equals("CAMION") || vehiculo.equals("MULA")) {
            if (velocidad <= limiteInferior) {
                return 0;
            } else if (velocidad >= limiteInferiorIntermedio && velocidad <= limiteSuperior) {
                return 1;
            }
            return 2;
        }
        return -1;
    }
    public String enviarCorreoFotomulta(String vehiculo) {
        String cuerpoMensaje;
        String asunto;
        if (vehiculo.equals("CARRO") || vehiculo.equals("CAMION") || vehiculo.equals("MULA")) {
            cuerpoMensaje = "//enviandocorreoparaeltipo." + vehiculo;
            asunto = "//asunto:comparendo " + vehiculo;
        } else {
            return "enviandocorreoconvehiculodesconocido";
        }
        return asunto + cuerpoMensaje;
    }

}