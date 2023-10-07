create table pacientes(
                          id bigint not null auto_increment,
                          nombre varchar(100) not null,
                          email varchar(100) not null unique,
                          documentoIdentidad varchar(14) not null unique,
                          telefono varchar(20) not null,
                          calle varchar(100) not null ,
                          distrito varchar(100) not null ,
                          complemento varchar(100),
                          numero varchar(100),
                          ciudad varchar(100) not null,
                          primary key(id)
                    )