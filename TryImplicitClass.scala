object Run {
	implicit class IntTimes (x : Int) {
		def times [A](f: => A) : Unit = {
			def loop (current : Int) : Unit =
			
			if (current > 0) {
				f
				loop(current - 1);
			}
			
			loop(x);
		}
	}
}


import Run._;
object TryImplicitClass {
	def main (args : Array[String]) : Unit = {
		4 times println("hello");
	}
}