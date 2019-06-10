CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_insertarCliente`(
codigo char(5),paterno varchar(25), materno varchar(25), nombre varchar(30),dni char(8), ciudad varchar(30),
direccion varchar(50),telefono varchar(20),email varchar(50)
)
BEGIN
	insert into cliente(cliecodigo,cliepaterno,cliematerno,clienombre,cliedni,clieciudad , cliedireccion
    ,clietelefono,clieemail) values(codigo,paterno,materno,nombre,dni,ciudad,direccion,telefono,email);
END