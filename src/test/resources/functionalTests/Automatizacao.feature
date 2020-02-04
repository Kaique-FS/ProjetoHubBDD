#language:pt
#coding:utf-8

Funcionalidade: Automatização Site AdvantageOnlineShopping
Descrição: Realização de um cadastro, compra de um produto pela home e lupa.

Contexto:
	Dado usuário em questão está Pagina inicial

@Automatizacao
Cenario: Cliente entra no site, realiza cadastro e compra dois produtos
	Quando clicar em login
	E clicar em novo usuario
	E inserir detalhes da conta
	Quando clicar em um produto do fornecedor X
	E adicionar ao carrinho
	E voltar a pagina inicial
	Quando buscar um produto
	E clicar no produto
	E adicionar ao carrinho
	Entao clica no carrinho