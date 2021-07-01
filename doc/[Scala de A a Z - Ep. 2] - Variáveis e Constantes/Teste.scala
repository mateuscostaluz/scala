class Teste {
	val _nome = "Mateus"
	def nome = {
		println("Getter executado")
		_nome
	}
	
	private var _idade = 25
	
	def idade_=(x: Int) = {
		require(x < 100)
		_idade = x*x
	}
	
	def idade = _idade
}

object MainTeste extends App {
	val t = new Teste
	t.idade = 24
	
	println(t.nome)
	println(t.idade)
}
