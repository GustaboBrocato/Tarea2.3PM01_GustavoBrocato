package com.example.tarea23pm01_gustavobrocato.Config;

public class Transacciones {
    //Nombre de la base de datos
    public static final String namedb = "PM01Tarea2_4";

    //Tabla de Contactos
    public static final String tablaImagenes = "imagenes";

    //Campos de la tabla de Imagenes
    public static final String id = "id";
    public static final String descripcion = "descripcion";
    public static final String foto = "foto";

    //Consultas de tabla contactos
    public static final String CreateTableImagenes = "CREATE TABLE " + tablaImagenes +"( id INTEGER PRIMARY KEY AUTOINCREMENT,"+ descripcion + " TEXT," + foto + " BLOB)";
    public static final String DropTableImagenes = "DROP TABLE IF EXISTS" + tablaImagenes;
    public static final String SelectTableImagenes = "SELECT * FROM "+ Transacciones.tablaImagenes;
}
