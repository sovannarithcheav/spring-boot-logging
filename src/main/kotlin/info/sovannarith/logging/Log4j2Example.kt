package info.sovannarith.logging

import kotlin.jvm.JvmStatic
import org.slf4j.LoggerFactory

object Log4j2Example {
	private val logger = LoggerFactory.getLogger(Log4j2Example::class.java)
	@JvmStatic
	fun main(args: Array<String>) {
		logger.debug("Debug log message")
		logger.info("Info log message")
		logger.error("Error log message")
		logger.warn("Warn log message")
		logger.trace("Trace log message")
	}
}