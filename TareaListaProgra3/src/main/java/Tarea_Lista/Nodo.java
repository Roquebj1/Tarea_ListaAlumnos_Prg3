package Tarea_Lista;

public class Nodo {
    ClsAlumno dato;
    Nodo enlace;

    public Nodo(ClsAlumno name) {
        dato = name;
        enlace = null;
    }

    public Nodo(ClsAlumno name, Nodo n) {
        dato = name;
        enlace = n;
    }

    public ClsAlumno getDato() {
        return dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
