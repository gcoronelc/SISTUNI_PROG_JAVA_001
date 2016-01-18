package pe.egcc.model;

/**
 *
 * @author Eric Gustavo Coronel Castillo
 * @site   www.desarrollasoftware.com
 * @email  gcoronelc@gmail.com
 * @date   18/01/2016
 */
public class Persona {

  private String nombre;
  private int edad;
  private boolean casado;

  public Persona() {
    this.nombre = "Claudia Ramos";
    this.edad = 25;
    this.casado = false;
  }
  
  public Persona(String nombre, int edad, boolean casado) {
    this.nombre = nombre;
    this.edad = edad;
    this.casado = casado;
  }
  
  public void imprimir(){
    String datos;
    datos = nombre + " - " + edad + " - " + casado;
    System.out.println(datos);
  }
  
}
