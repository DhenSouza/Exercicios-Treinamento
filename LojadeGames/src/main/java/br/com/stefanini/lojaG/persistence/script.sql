create database lojaGames;
use lojaGames;

create table produto(
idProduto int primary key auto_increment,
nome varchar(50),
descricao varchar(100)
);

create table categoria(
idCategoria int primary key auto_increment,
nomeCategoria varchar(50),
plataforma varchar (50) unique,
id_produto int,
foreign key(id_produto) references produto(idProduto)
);


insert * into produto;

insert * into categoria;

insert into produto (idProduto, nome, descricao, anoLancamento, preco) values (null, "Devil may Cry", "jogo Bom", "20/08/2000", 200.0);
insert into categoria (idCategoria, nome, plataforma, id_produto) values (null, "Ação", "Playstation", 1);

select p.nome, p.descricao, p.anoLancamento, p.preco, c.nomeCategoria, c.plataforma from produto p inner join categoria c on p.idProduto = c.id_produto;

