trait Logging {
  def writeLog(msg: String): Unit
  def format(msg: String): String
  
  def log(msg: String): Unit = writeLog(format(msg))
}

trait SimpleFromatLogger extends Logging {
  def format(msg: String): String = s"[log] $msg"
}

trait ComplexFormatLogger extends Logging {
  def format(msg: String): String = s"[complex] $msg"
}

trait SimpleLogger extends Logging {
  def writeLog(msg: String): Unit = println(msg)
}

trait FileLogger extends Logging {
  def writeLog(msg: String): Unit = println(s"[file] $msg")
}

object SimpleFileLogger extends SimpleLogger with ComplexFormatLogger

object Logger extends App {
  val Logger = SimpleFileLogger.log("Hello World!")
}
// para evitar expected class or object definition