object TryString {
	def main (args : Array[String]) : Unit = {
		var str : String = "test";
		println(str);

		var str2 : String = str + " concat string";
		println(str2);

		var str3 : Unit = printf("The Float value : %f " + 
			" and integer value : %d " + 
			" also string value : %s", 3.1415, 19, "test string");
		println(str3);

		var name : String = "test name";
		var str4 : String = s"Howdy, $name!! how are you ?";
		println(str4);

		var phi : Double = 3.1416;
		var str5 : String = f"value of phi is $phi%.2f";
		println(str5);

		var str6 : String = raw"\ndata \tfor \ntest";
		println(str6);
	}
}