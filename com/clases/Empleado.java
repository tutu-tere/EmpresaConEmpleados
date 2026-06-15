package com.clases;

public class Empleado {
  // Inicializacion atributos
  private String nombre;
  private int id;
  private Double salarioBase;

  // metodo constructor
  public Empleado(String nombre, int id, Double salarioBase) {
    this.nombre = nombre;
    this.id = id;
    this.salarioBase = salarioBase;
  }

  // Getters y Setters
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Double getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(Double salarioBase) {
    this.salarioBase = salarioBase;
  }

  // metodos

  public Double calcularSalarioTotal() {
    return salarioBase * 160;
  }

  public void mostrarInformacion() {
    System.out.println("Empleado: " + nombre +
        ", ID: " + id +
        ", Salario Base: " + salarioBase +
        ", Salario Total: " + calcularSalarioTotal());
  }

}
