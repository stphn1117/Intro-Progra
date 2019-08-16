package clases;
//para todas la clases los objetos deben ser privados
//para no poder modificarlos desde fuera
//para esos casos usar get con get y el nombre del atributo a cambiar para obtenerlo
//para esos casos usar set con set y el nombre del atributo a cambiar para cambiarlo
// tambien sirve para los paquetes
//todas las clases inician igual
//encapsulamiento es hacer cosas privadas

//modificadores de acceso
//se pueden hacer dos metodos con el mismo nombre pero diferentes parametros y se conoce como overload
public class calc {
 public static void main(String[] args){
 persona p = new persona("isaac");
 p.nombre = "Isaac";
 p.decirNombre();
 
 /* esto es para todos los tipos de objetos.
  * 
  * persona p = new .....
  * persona p2 = p;
  * es basicamente un apodo
  * asi que atravez de p2 se modifica p
  * 
  * 
  * persona p = newpersona("isaac");
  * persona p2 = new persona(p.getNombre());
  * 
  * solo así se crean dos variables porque se instancian en diferentes partes de la memoria
  * 
  */
}
}