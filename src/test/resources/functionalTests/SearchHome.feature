#language:pt
#coding:utf-8

Funcionalidade: Automatização de seleção de um produto da pagina princiapl
Descrição: Realização da seleção de um produto da pagina inicial

Contexto:
	Dado usuário em questão está Pagina inicial
	
@CenarioProdutoCorrespondente
Cenario: Cliente seleciona um produto e aparece o mesmo
	Quando clicar em um produto do fornecedor X
	Entao validar se o produto X é igual ao selecionado

@CenarioProdutoNaoCorrespondente
Cenario: Cliente seleciona um produto e aparece outro
	Quando clicar em um produto do fornecedor Y
	Entao validar se o produto Y é igual ao selecionado