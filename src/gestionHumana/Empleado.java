package gestionHumana;

public class Empleado {
    public final long cedula;
<<<<<<< HEAD
    private String nombre;
    private String cargo;
=======
    public String nombre;
    public String cargo;
>>>>>>> main

    public Empleado(long cedula, String nombre, String cargo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public boolean tengoPermiso() {
        return cargo.contains("Administrador");
    }
}
