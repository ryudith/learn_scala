object TryMultipleDeclare {
	def main (args : Array[String]) : Unit = {
		var (intVar : Int, strVar : String) = (19, "Test String");
		
		println("intVar value : " + intVar);
		println("strVar value : " + strVar);
	}
}