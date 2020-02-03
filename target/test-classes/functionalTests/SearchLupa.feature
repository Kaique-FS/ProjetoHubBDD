#language:pt
#coding:utf-8

Funcionalidade: Automatização de seleção de um produto pela pesquisa
Descrição: Realização da seleção de um produto pela pesquisa

Contexto:
	Dado usuário em questão está Pagina inicial
	
@CenarioPesquisaCorrespondente
Cenario: Cliente pesquisa um produto e o mesmo aparece
	Quando realizar a pesquisa do produto existente
	Entao validar se o produto aparece

@CenarioPesquisaNaoCorrespondente
Cenario: Cliente pesquisa um produto e o mesmo não aparece
	Quando realizar a pesquisa do produto nao existente
	Entao validar se o produto nao aparece