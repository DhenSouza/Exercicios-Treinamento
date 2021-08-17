drop table categoria;
drop table produto;

create database lojaGames;
use lojaGames;

create table produto(
idProduto int primary key auto_increment,
nome varchar(50),
descricao varchar(100),
preco bigint
);



insert into produto (idProduto, nome, descricao, preco) values (null, "Devil may Cry", "Jogo legal",  200.0);
insert into produto (idProduto, nome, descricao, preco) values (null, "Devil may Cry 2", "jogo Bom",  200.0);



select * from produto;




