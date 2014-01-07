package ar.com.nmc.task.entity;

import java.util.Date;

public class TaskEntity {
	private Long id;
	private String name;
	
	private Long authorID;
	private Date creationDate;
	private Date startDate; 
	private Date endDate; 
	private Date finalizeDate;
	
	private String priority;
	private String state;
	private String type;
	
	/*
	 	Person author (Quien creo la tarea, cuando?)
	 	
	 	Date creationDate (Fecha de creacion)
	 	Date finalizeDate (Seteada al finalizar la tarea)
	 	 
	 	TaskDate taskStartDate (Clase, contiene fecha de comienzo de tarea e Historial de modificacion, puede llegar a contener algo mas)
	 	TaskDate taskEndDate (idem pero se utiliza para setear la fecha estimada de finalizacion) 
	 	TaskDate taskFinalizeDate (idem pero se utiliza para setear la finalizacion de la tarea)
	 		*Desvio de tiempo de estimación de la tarea. Con esa fecha por logica se hace la differencia para calcular la Desviacion.
	 		
	 	Priority priority (Prioridad, Alta, Media y Baja en enums en cada Clase)
	 		Enumerado Pripority (Alta, Media y Baja)
	 		 
		State state (Estados, Nueva, Hecha, Suspendida, Archivada en enums en cada Clase)
			Enumerado State (Nueva, Hecha, Suspendida, Archivada, Borrada)
			
		TaskType taskType (Tipos, Secuencial y Libre en enums en cada Clase)
			Enumerado TaskType (Secuencial y Libre)
		
		Orden por TaskState o TaskPriority o Type.
		Clasificación por Person (Author).
		
	*/
	
	/*Va a contener una lista de TodoEntity
	 *TodoEntity:
	 * 		private Long id;
	 * 		private String name;
	 * 
	 * Se separa porque quizas en un futuro se pueda crear un Task y varias personas podrian trabajar sobre el
	 * con lo cual se necesitaria tener ..Quien agrego el TodoEntity /Author/ (quien agrego un item a la lista), 
	 * fecha de creacion del TodoEntity
	 * fecha de finalizacion del TodoEntity
	 * fecha estimada de finalizacion del TodoEntity
	 * Y la prioridad y el estado no se.
	 */
}
