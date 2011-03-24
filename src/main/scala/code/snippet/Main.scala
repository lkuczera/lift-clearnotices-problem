package code.snippet

object Main {
	private def doPost = {
		println("sleeping")
		Thread.sleep(3000)
		Call("unblock").cmd
	}
		
	private def block = {
		println()
		println("calling block message")
		println()
		Call("blockMessage")
	}
		
	def buttons = "#id1" #> ajaxButton("OK", block,() => doPost) &
		"#id2" #> ajaxButton("Cancel", Call("unblock"), () => Noop)
}
