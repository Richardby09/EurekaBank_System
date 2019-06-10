CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_buscarCliente`(clientecodigo char(5))
BEGIN
	select * from cliente where clientecodigo=cliecodigo;
END