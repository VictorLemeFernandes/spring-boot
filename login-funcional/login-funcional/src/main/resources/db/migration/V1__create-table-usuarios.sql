CREATE TABLE usuarios (
    id bigint not null auto_increment,
    login varchar(100),
    senha varchar(255),

    primary key (id)
);