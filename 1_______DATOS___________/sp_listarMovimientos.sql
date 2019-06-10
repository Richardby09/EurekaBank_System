CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_listarMovimientos`()
BEGIN
	select *from tipomovimiento;
END