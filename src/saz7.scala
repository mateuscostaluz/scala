class URL(host: String = "localhost", port: Int = 8080) {
	def connect() = println(s"$host - $port")
}

object URL extends App {
  val URL = new URL(port = 7070).connect()
}
// para evitar expected class or object definition