# MVC
## Que es? 
Es un patron de diseno arquitectonico que separa una aplicacion en tres componentes:
* modelo
* vista
* controlador

## Caracteristicas
* Responsabilidad: Cada componente tiene una repsonsabilidad especifica
* Organizar codigo: Facil de mantener, escalar y entender

## Capas
### Modelo 
* Gestiona los datos y la logica del negocio 
* Se encarga de recuperar, modificar y almacenar datos

El modelo maneja la db, las reglas y las operaciones, No sabe nada de la vista
### Vista
* Mostrar datos al usuario
* Capturar las interaccion del usuario 

Muestra los datos al usuario/interface de usuario
### Controlador 
* Recie las solicitudes del usuario desde la vista
* Procesar las solicitudes y acciones tomer 
* Coordina con el modelo 

