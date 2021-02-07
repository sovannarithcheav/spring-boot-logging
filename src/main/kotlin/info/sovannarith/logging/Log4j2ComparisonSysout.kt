package info.sovannarith.logging

import java.io.File
import kotlin.Throws
import java.io.FileNotFoundException
import kotlin.jvm.JvmStatic
import java.io.PrintStream

object Log4j2ComparisonSysout {
	@Throws(FileNotFoundException::class)
	@JvmStatic
	fun main(args: Array<String>) {
		val outStream = PrintStream(File("outFile.txt"))
		System.setOut(outStream)
		println("This is a baeldung article")
		val errStream = PrintStream(File("errFile.txt"))
		System.setErr(errStream)
		System.err.println("This is a baeldung article error")
	}
}