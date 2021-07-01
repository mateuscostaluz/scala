object saz3 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(162); 
	/*
	def isEven(x: Int) = x % 2 == 0
	
	isEven(1)
	isEven(2)
	
	val numeros = List(1, 2, 3, 4, 5)
	numeros.filter(isEven)
	*/
	
	val nome = "Mateus";System.out.println("""nome  : String = """ + $show(nome ));$skip(23); 
	val sobrenome = "Luz";System.out.println("""sobrenome  : String = """ + $show(sobrenome ));$skip(45); 
	
	val completeName = nome + " " + sobrenome;System.out.println("""completeName  : String = """ + $show(completeName ));$skip(16); val res$0 = 
	
	completeName;System.out.println("""res0: String = """ + $show(res$0))}
}
