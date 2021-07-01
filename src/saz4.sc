class Pessoa(var nome: String, val idade: Int) {
	def this(nome: String, sobrenome: String, idade: Int) = this(nome + " " + sobrenome, idade)
	def this() = this("", 0)
}

object TestPessoa extends App {
	val p = new Pessoa("Mateus 'Elfocus'", 25)
	p.nome = "Mateus2"
	
	println("nome p1 = " + p.nome)
	
	val p2 = new Pessoa("Mateus", "'Elfocus", 25)
	val p3 = new Pessoa()
}