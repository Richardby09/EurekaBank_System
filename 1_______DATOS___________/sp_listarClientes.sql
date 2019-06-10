CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listarClientes`()
BEGIN
	select * from cliente;
END