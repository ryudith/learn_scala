/* [begin] normal trait */
trait Equal {
	def isEqual (x : Any) : Boolean;
	def isNotEqual (x : Any) : Boolean = !isEqual(x);
}

class Point (val xp : Int, yp : Int) extends Equal {
	def isEqual (x : Any)  = x.isInstanceOf[Point] && x.asInstanceOf[Point].xp == this.yp;
}
/* [end] normal trait */


/* [begin] universal trait & value classes */
trait Printable extends Any {
	def print() : Unit = println(this);
}
class Wrapper (val underlying : Int) extends AnyVal with Printable;
/* [end] universal trait & value classes */



object TryTrait {
	def main (args : Array[String]) : Unit = {
		println("Normal trait : ");
		var p1 : Point = new Point(2, 3);
		var p2 : Point = new Point(2, 4);
		var p3 : Point = new Point(3, 3);
		
		println(p1.isNotEqual(p2));
		println(p1.isNotEqual(p3));
		println(p1.isNotEqual(2));
		println("\n\n\n");
		
		
		
		println("universal trait and value classes : ");
		var w : Wrapper = new Wrapper(5);
		w.print();
	}
}