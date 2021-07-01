class URL(host: String = "localhost", port: Int = 8080) {
	def connect() = println(s"$host - $port")
}

new URL(port = 7070).connect()