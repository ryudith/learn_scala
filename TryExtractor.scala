import scala.util.Random;



object CustomerID {
	def apply (name : String) = s"$name--${Random.nextLong}";
	
	def unapply (customerID: String) : Option[String] = {
		val name = customerID.split("--").head;
		if (name.nonEmpty) Some(name) else None;
	}
}


object TryExtractor {
	def main (args : Array[String]) : Unit = {
		var customer1ID = CustomerID("My System");
		
		var name = customer1ID match {
			case CustomerID(name) => name;
			case _ => "Could not extract a CustomerID";
		};
		
		println(name);
	}
}