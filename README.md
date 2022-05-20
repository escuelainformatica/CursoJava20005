# Escuela 1

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

# Resultado deportivos

Quien gano un partido?

1) modelo

* Equipo
  * nombre (texto)

* Partido
  * local (Equipo)
  * visita (Equipo)
  * golesLocal (entero)
  * golesVisita (entero)

2) Servicios 

* PartidoServicio
  * funcion: Partido ---> funcion ---> nombre del ganador (String)
  * public String ganador(Partido part) { }




