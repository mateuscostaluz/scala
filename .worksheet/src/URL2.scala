class URL2(host: String = "localhost", port: Int = 8080) {
	def connect() = println(s"$host - $port")
}

new URL2().connect
