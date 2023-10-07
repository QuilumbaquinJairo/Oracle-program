alter table pacientes add activo tinyint;
update pacientes set pacientes.activo=1;