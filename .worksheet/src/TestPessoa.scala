class Pessoa(var nome: String, val idade: Int) {
	def this(nome: String, sobrenome: String, idade: Int) = this(nome + " " + sobrenome, idade)
	def this() = this("", 0)
}

object TestPessoa extends App {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(247); 
	val p = new Pessoa("Mateus 'Elfocus'", 25);System.out.println("""p  : Pessoa = """ + $show(p ));$skip(20); 
	p.nome = "Mateus2";$skip(34); 
	
	println("nome p1 = " + p.nome);$skip(49); 
	
	val p2 = new Pessoa("Mateus", "'Elfocus", 25);System.out.println("""p2  : Pessoa = """ + $show(p2 ));$skip(23); 
	val p3 = new Pessoa();System.out.println("""p3  : Pessoa = """ + $show(p3 ))}
}
