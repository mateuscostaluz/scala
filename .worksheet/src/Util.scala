object Util

object Math {
	val PI = 3.14
}
// (objeto singleton da classe Util, onde não se instancia objetos dessa classe)

class Math {
	def xPI(x: Int) = x * Math.PI
}

object Test extends App {
	println(new Math().xPI(2))
}
// acesso igual a varáveis staticas em Java
