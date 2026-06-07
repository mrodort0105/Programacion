/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EventoMusical {
    private String nombre;
    private LocalDate fecha;
    private BigDecimal recaudacion;

    // Constructor vacío
    public EventoMusical() {}

    // Constructor con parámetros
    public EventoMusical(String nombre, LocalDate fecha, BigDecimal recaudacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public BigDecimal getRecaudacion() { return recaudacion; }
    public void setRecaudacion(BigDecimal recaudacion) { this.recaudacion = recaudacion; }
}