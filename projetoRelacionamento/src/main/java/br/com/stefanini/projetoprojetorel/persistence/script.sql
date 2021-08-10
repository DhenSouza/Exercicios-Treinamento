create database bdcinco;

use bdcinco;

create table usuario(
id int primary key auto_increment,
nome varchar(50) not null,
email varchar(50) not null,
senha varchar (250)
);


create table cliente(
idCliente int primary key,
perfil varchar(50) not null,
status varchar(50) not null,
foreign key(idCliente) references usuario(id) on delete cascade
);

insert into usuario values (1, 'denilson', 'denilson@gmail.com', md5('12345'));
insert into cliente values (1, 'perfil 1', 'ativo');

select * from cliente;


create table vendedor(
idVendedor int primary key,
perfil varchar (50),
comissao double,
foreign key(idVendedor) references usuario(id) on delete cascade
);


insert into usuario values (2, 'patricia', 'patricia@gmail.com', md5('101010'));
insert into vendedor values(2, 'vendedor', 0.10);

select u.id, u.nome, u.email, u.senha, c.status, v.comissao from usuario u left join cliente c 
on u.id = c.idCliente
left join vendedor v on u.id = v.idVendedor order by 1 asc;