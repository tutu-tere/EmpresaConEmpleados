package com.clases;

public class Director extends Gerente {
  private double acciones;

  public Director(String nombre, int id, double salarioBase, double bono, double acciones) {
    super(nombre, id, salarioBase, bono);
    this.acciones = acciones;
  }

  @Override
  public Double calcularSalarioTotal() {
    return super.calcularSalarioTotal() + acciones;
  }

  @Override
  public void mostrarInformacion() {
    System.out.println("Director: " +
        ", Acciones: " + acciones +
        ", Salario Total: " + calcularSalarioTotal());
  }
}
