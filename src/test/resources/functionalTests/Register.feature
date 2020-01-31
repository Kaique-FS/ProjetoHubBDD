#language:pt
#coding:utf-8

Funcionalidade: Automatização de Pagina de Cadastro
Descrição: Realização de um cadastro

Cenario: Cliente realiza um cadastro no site
	Dado usuário em questão está Pagina inicial
	Quando clicar em login
	E clicar em novo usuario
	E inserir detalhes da conta
	Entao entrar na conta cadastrada