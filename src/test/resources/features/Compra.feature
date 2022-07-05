
@compra
Feature: Cadastro em E-commerce
  
	Background: Abrir site
		Given usuario acessa o site "http://automationpractice.com/index.php"

	@compra_feliz
  Scenario Outline: Acessar site
		And clica em Sing In e faz seu login com o "<email>" no campo de email e "<senha>" no campo de senha
		And clica no botao para logar
		When a pagina My Account abre para o usuario
		And o usuario clica na aba T-shirts
		And clica no botao More
		And acrescenta tres pecas, escolhendo o tamanho L, escolhendo a cor azul e prosseguindo para a compra
		And clicando no botao proceed to checkout ate que o mesmo nao exista mais 
		Then o usuario poderar escolher como pagar 
		And ele confirma a compra clicando no botao I confirm my order
		And podera fechar o navegador
		
    Examples: 
	  	| email                 | senha				|
	  	| millsz2022@gmail.com  | miquinho98  |
	  	
	  	
	  @compra_feliz2
  Scenario Outline: Acessar site
		And clica em Sing In e faz seu login com o "<email>" no campo de email e "<senha>" no campo de senha
		And clica no botao para logar
		When a pagina My Account abre para o usuario
		And o usuario clica na aba T-shirts
		And clica no botao More
		And prosseguindo para a compra
		And clicando no botao proceed to checkout ate que o mesmo nao exista mais 
		Then o usuario poderar escolher como pagar 
		And ele confirma a compra clicando no botao I confirm my order
		And podera fechar o navegador
		
    Examples: 
	  	| email                 | senha				|
	  	| millsz2022@gmail.com  | miquinho98  |
	  	
	