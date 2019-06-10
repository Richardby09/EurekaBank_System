CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insertarMovimiento`(codigo char(3),descripcion varchar(40)
,accion varchar(10),estado varchar(15))
BEGIN
	insert into tipomovimiento(tipocodigo,tipodescripcion,tipoaccion,tipoestado)values(codigo,descripcion
    ,accion,estado);
END