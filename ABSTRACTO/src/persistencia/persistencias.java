package persistencia;
/*Diseña una clase abstracta Persistencia con métodos abstractos como guardarDatos() y
cargarDatos(). Implementa subclases concretas como PersistenciaArchivo y
PersistenciaBaseDatos que hereden de esta clase y proporcionen implementaciones
específicas para guardar y cargar datos en diferentes tipos de almacenamiento.
*/
public abstract class persistencias {
public abstract void guardardatos();
public abstract void cargardatos();

	
}
