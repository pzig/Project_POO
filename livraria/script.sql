create database livraria;
use livraria;

create table cliente(
id integer auto_increment primary key,
nome varchar(100),
cpf varchar(11),
nascimento date,
telefone varchar(20),
email varchar(100),
endereco varchar(255),
escolaridade tinyint,
estado_civil tinyint
);