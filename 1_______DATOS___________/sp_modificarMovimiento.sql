CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_modificarMovimiento`(
codigo char(3),descripcion varchar(40),accion varchar(10),estado varchar(15))
BEGIN
update tipomovimiento set tipodescripcion=descripcion , tipoaccion=accion ,
 tipoestado=estado where  tipocodigo=codigo;
END