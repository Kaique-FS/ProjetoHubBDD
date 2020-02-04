#language:pt
#coding:utf-8

Funcionalidade: Automatização de Pagina de Cadastro
Descrição: Realização de um cadastro

Contexto:
	Dado usuário em questão está Pagina inicial
	Quando clicar em login
	E clicar em novo usuario
	E inserir detalhes da conta

@CenarioSucesso
Cenario: Cliente realiza um cadastro no site
	Entao entrar na conta cadastrada

@CenarioFalha
Cenario: Cliente realiza um cadastro ja existente
	Entao aparece mensagem de usuario ja cadastrado