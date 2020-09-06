/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasdeviaje;

/**
 *
 * @author ruzbe
 */
public class Reserva {
    
    private String nombreCliente;
    private String idCliente;
    private String fechaViaje;
    private int viajeros; 
    private String ciudadOrigen;
    private String ciudadDestino;
    private int diasViaje;
    private String nombreHotel;
    private double costoHotel;
    private String nombreAerolinea;
    private double costoAerolinea;
    private String tipoTransporte;
    private double costoTransporte; 
    private String infoEventos;
    private double costoEventos;
    
    Reserva(String nombreCliente, String idCliente, String fechaViaje, int viajeros, 
            String ciudadOrigen, String ciudadDestino, int diasViaje, String nombreHotel, 
            double costoHotel, String nombreAerolinea, double costoAerolinea, String tipoTransporte,
            double costoTransporte, String infoEventos, double costoEventos) {
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
        this.fechaViaje = fechaViaje;
        this.viajeros = viajeros; 
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.diasViaje = diasViaje;
        this.nombreHotel = nombreHotel;
        this.costoHotel = costoHotel;
        this.nombreAerolinea = nombreAerolinea;
        this.costoAerolinea = costoAerolinea;
        this.tipoTransporte = tipoTransporte;
        this.costoTransporte = costoTransporte; 
        this.infoEventos = infoEventos;
        this.costoEventos = costoEventos;
    }
    
    
}