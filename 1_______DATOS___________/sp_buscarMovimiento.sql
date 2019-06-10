CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_buscarMovimiento`(codigo char(3))
BEGIN
SELECT 	*from tipomovimiento where tipocodigo=codigo;
END