/*CRIANDO O BANCO DE DADOS*/
create database teste;

/*SELECIONANDO O BANCO DE DADOS*/
use teste;

/*CRIANDO A TABELA DE SERVIÇOS*/
create table servicos(
	idser int primary key auto_increment,
    nome varchar(50) not null,
	valor double not null
);