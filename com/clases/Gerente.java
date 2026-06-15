package com.clases;

public class Gerente extends Empleado {
  private double bono;

  public Gerente(String nombre, int id, double salarioBase, double bono) {
    super(nombre, id, salarioBase);
    this.bono = bono;
  }

  @Override
  public Double calcularSalarioTotal() {
    return super.calcularSalarioTotal() + bono;
  }

  @Override
  public void mostrarInformacion() {
    System.out.println("Gerente: " +
        ", Bono: " + bono +
        ", Salario Total: " + calcularSalarioTotal());
  }

}
