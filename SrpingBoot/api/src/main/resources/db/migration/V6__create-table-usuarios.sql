create table usuarios(
                        id bigint not null auto_increment,
                        login varchar(45) not null,
                        clave varchar(100) not null,
                        primary key (id)
)