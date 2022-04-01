/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea_Lista;

/**
 *
 * @author HP
 */
public class principal {
    public static void main(String[] args) {

        

        ClsAlumno alum = new ClsAlumno();
        System.out.println("\n \n -----------\n -Inserta todos los datos por cabeza \n");
        alum.carnet="1";
        alum.nombre="Roque";
        alum.promedio=99;
        ClsLista lista = new ClsLista(alum);
        
        //insertar por cabeza
        alum=new ClsAlumno();
        alum.carnet="2";
        alum.nombre="Francisco";
        alum.promedio=98;
        lista.insertarCabezaLista(alum);

        alum=new ClsAlumno();
        alum.carnet="3";
        alum.nombre="Gustavo";
        alum.promedio=90;
        lista.insertarCabezaLista(alum);

        alum=new ClsAlumno();
        alum.carnet="4";
        alum.nombre="Brissia";
        alum.promedio=100;
        lista.insertarCabezaLista(alum);

        alum=new ClsAlumno();
        alum.carnet="5";
        alum.nombre="Ana Luisa";
        alum.promedio=79;
        lista.insertarCabezaLista(alum);

        alum=new ClsAlumno();
        alum.carnet="6";
        alum.nombre="Delmy";
        alum.promedio=88;
        lista.insertarCabezaLista(alum);

        alum=new ClsAlumno();
        alum.carnet="7";
        alum.nombre="Pedro";
        alum.promedio=40;
        lista.insertarCabezaLista(alum);
        
        alum=new ClsAlumno();
        alum.carnet="8";
        alum.nombre="DUlce";
        alum.promedio=98;
        lista.insertarCabezaLista(alum);

        alum=new ClsAlumno();
        alum.carnet="9";
        alum.nombre="Nallely";
        alum.promedio=100;
        lista.insertarCabezaLista(alum);

        alum=new ClsAlumno();
        alum.carnet="10";
        alum.nombre="Santiago";
        alum.promedio=70;
        lista.insertarCabezaLista(alum);
        lista.visualizar();
        System.out.println("--------------------------------------------");
        

        //BuscarPorDatoIngresado
        System.out.println("\n \n ---------------\n -Busca segun el carnet \n");
        Nodo DatoEncontradoPorCarnet;
        DatoEncontradoPorCarnet=lista.buscarLista("2");
        System.out.println("El dato encontrado por carnet es: "+ DatoEncontradoPorCarnet.dato.toString());
        System.out.println("--------------------------------------------");


        //insertar por cola y buscar por posicion
        System.out.println("\n \n ---------------\n -Ingresa en la cola de la lista \n");
        Nodo IngresarCola;
       IngresarCola= lista.buscarPosicion(11);
       alum=new ClsAlumno();
       alum.carnet="1";
       alum.nombre="Roque";
       alum.promedio=100;
       lista.insertarUltimoLista(IngresarCola, alum);
       lista.visualizar();
       System.out.println("--------------------------------------------");

       //Eliminar dato de la lista
       System.out.println("\n \n --------------- \n -Elimina un dato segun el carnet enviado en este caso es el carnet 5 \n");
       lista.eliminar("6");
       lista.visualizar();
       System.out.println("--------------------------------------------");

       //Ingresar en medio de dos datos
       System.out.println("\n \n -------------------- \n -Ingresa en medio de dos datos en este caso es despues del 7 \n");
       alum=new ClsAlumno();
       alum.carnet="6";
       alum.nombre="Delmy";
       alum.promedio=88;
       lista.insertarLista("7", alum);
       lista.visualizar();
       System.out.println("--------------------------------------------");
    }
}
