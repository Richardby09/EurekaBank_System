CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminarMovimiento`(codigo char(3))
BEGIN
	delete  from tipomovimiento where tipocodigo=codigo;
END