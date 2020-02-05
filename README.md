# ProjetoHubBDD
Projeto de automação em BDD

Src/main/java

- br.com.rsinet.hub.projetobdd.cucumber

	ScenarioContex: Utilizado para controlar “x” valor entre classes.

	TestContext:  Utilizado para controlar as instâncias de objetos criados.

- br.com.rsinet.hub.projetobdd.dataProvider

	ConfigFileReader: Utilizado para realizar a leitura do documento Configuration.properties.

	JsonDataReader: Utilizado para realizar a leitura da classe Customer.

- br.com.rsinet.hub.projetobdd.enums

	Context: Utilizado para controlar os valores codificados no projeto.

	DriverType: Utilizado para controlar os valores de tipos de browser codificados no projeto.

	EnvironmentType: Utilizado para controlar os valores do tipo de ambiente codificado no projeto.

- br.com.rsinet.hub.projetobdd.managers

	FileReadeManager: Classe que é responsável por gerenciar as instâncias do leitor de configurações (ConfigFileReader)

	PageObjectManager: Classe que é responsável por gerenciar as instâncias de objetos POF (PageObjectFactory).

	WebDriverManager: Classe que é responsável por gerenciar as instâncias de objetos WebDriver.

- br.com.rsinet.hub.projetobdd.pof

	CartPage: Classe com a responsabilidade de armazenar os elementos e ações da página compra (Carrinho de compras) da aplicação.

	HomePage: Classe com a responsabilidade de armazenar os elementos e ações da página inicial/principal da aplicação.

	ProductPage: Classe com a responsabilidade de armazenar os elementos e ações da página de produto da aplicação.

	RegisterPage: Classe com a responsabilidade de armazenar os elementos e ações da página de Registro de usuário da aplicação.

	SearchPage: Classe com a responsabilidade de armazenar os elementos e ações da página de pesquisa/procura da aplicação.

- br.com.rsinet.hub.projetobdd.selenium

	Wait: Utilizada para gerenciar as instancias de métodos “wait” (espera) dentro do código do projeto.

- br.com.rsinet.hub.projetobdd.testDataTypes

	Customer: Classe utilizada para mapear parâmetros para inserção de dados (obs: não inserida com sucesso)

Src/test/java

- br.com.rsinet.hub.projetobdd.runners

	TestRunner: Classe Responsável por gerenciar qual teste será executado.

- br.com.rsinet.hub.projetobdd.stepdefinitions

	CartPageSteps: Classe responsável por implementar os cenários de testes relacionados a página do “Carrinho de compra” para execução da aplicação.

	HomePageSteps: Classe responsável por implementar os cenários de testes relacionados a página “Inicial/Principal” para execução da aplicação.

	Hooks: Classe responsável por implementar os hooks de After e Before do Cucumber, para definir o que deve ser rodado antes e depois de cada teste.

	ProductPageSteps: Classe responsável por implementar os cenários de testes relacionados a página do “Produto” para execução da aplicação.

	RegisterPageSteps: Classe responsável por implementar os cenários de testes relacionados a página de “Registro” para execução da aplicação.

	SearchPageSteps: Classe responsável por implementar os cenários de testes relacionados a página de “Pesquisa/Procura” para execução da aplicação. 

Src/test/resources

- Pasta: functionalTests

	Automatizacao.feature: Feature (cucumber) responsável pela história de “teste de aceite” (ps: não foi implementado com sucesso).

	Register.feature: Feature (cucumber) responsável pela história de “Registrar/Cadastrar um novo usuario”.

	SearchHome: Feature (cucumber) responsável pela história de “Buscar um Produto pela página de início”.

	SearchLupa: Feature (cucumber) responsável pela história de “Buscar um Produto pela página barra/lupa de pesquisa”.

- Pasta: testDataResources

	Customer.json: Responsável por definir as variáveis que serão inseridas. (ps: não implementado)

Src/test/resources

- Pasta: configs

	Configuration.properties: Responsável por definir as instâncias usadas para a aplicação.

	Extent-config.xml:  Responsável por definir os parâmetros do report.

