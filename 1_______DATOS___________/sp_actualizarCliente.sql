CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_actualizarCliente`(
codigo char(5),paterno varchar(25), materno varchar(25), nombre varchar(30), dni char(8), ciudad varchar(30)
, direccion varchar(50), telefono varchar(20),email varchar(50))
BEGIN
	update cliente set cliepaterno=paterno,
    cliematerno=materno,  clienombre=nombre,  cliedni=dni,
    clieciudad=ciudad , cliedireccion=direccion,  clietelefono=telefono, clieemail=email
    where cliecodigo=codigo;
END