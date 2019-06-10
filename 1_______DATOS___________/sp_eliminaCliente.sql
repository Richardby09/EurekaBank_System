CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_eliminaCliente`( codigo char(5))
BEGIN
	delete from cliente where cliecodigo=codigo and codigo=cliecodigo;
END