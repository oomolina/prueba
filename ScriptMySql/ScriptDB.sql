/** ===================================== script basico =================================
*	fecha:		24/01/2022
*	autor:		yonder quispe chura
*	proyecto:	Prueba crud basico para el canal Code Team.
* =====================================================================================
*/

CREATE DATABASE DBpruebas;
USE DBpruebas;

# -------------tabla tareas--------------------
CREATE TABLE Tb_Alumno
(
	Id INT AUTO_INCREMENT PRIMARY KEY,
    Nombres varchar(200),
    Apellidos varchar(200),
    Codigo INT,
    Reunion varchar(200),
    Activo bool
);

/* datos iniciales para la tabla Tarea*/
insert into Tb_Alumno (Nombres, Apellidos,Codigo, Reunion,Activo )values('Oscar Orlando','Molina Pinto',2173,'Reunion | 08:30 am',true);
insert into Tb_Alumno (Nombres, Apellidos,Codigo, Reunion,Activo )values('Leonor','Pinto Chaparro',2673,'Reunion | 09:30 am',true);

select * from Tb_Tarea;