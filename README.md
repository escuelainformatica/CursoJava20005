# Escuela

* Promedio de notas de un alumno.

1) Modelo

* Curso
  * nombre (texto)
  * nota (double)

* Alumno
  * nombre (texto)
  * apellido (texto)
  * castellano (Curso)
  * matematica (Curso)
  * historica (Curso)

2) Servicio

* AlumnoServicio (clase)
  * Calcular promedio: 
    * Alumno ----->  funcion -----> nota (double)
    * public double promedio(Alumno alumno) { }
  * Mostrar alumno
    * Alumno -----> funcion -----> nada
    * public void mostrar(Alumno alumno) { }



