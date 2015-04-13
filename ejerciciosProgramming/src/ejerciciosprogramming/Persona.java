
package ejerciciosprogramming;

import java.util.Objects;

/**
 *
 * @author administrador
 */
public class Persona {
    
    private String nombres;
    private String apellidos;
    private int edad;
    private float estatura;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nombres);
        hash = 17 * hash + Objects.hashCode(this.apellidos);
        hash = 17 * hash + this.edad;
        hash = 17 * hash + Float.floatToIntBits(this.estatura);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (Float.floatToIntBits(this.estatura) != Float.floatToIntBits(other.estatura)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", edad=" + edad + ", estatura=" + estatura + '}';
    }   

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }   
}
