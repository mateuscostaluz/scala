object Math {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(28); 
	val PI = 3.14;System.out.println("""PI  : Double = """ + $show(PI ))}
}
// (objeto singleton da classe Util, onde não se instancia objetos dessa classe)

class Math {
	def xPI(x: Int) = x * Math.PI
}

object Test extends App {
	println(new Math().xPI(2))
}
// acesso igual a varáveis staticas em Java
