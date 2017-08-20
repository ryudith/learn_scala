class Point2D (val x : Int, val y : Int) {
	def printCoordinate () : Unit = {
		println("X position : " + this.x);
		println("Y position : " + this.y);
	}
}

class Point3D (override val x : Int, override val y : Int, val z : Int) extends Point2D (x, y) {
	override def printCoordinate () : Unit = {
		super.printCoordinate();
		println("Z Position : " + this.z);
	}
}

object TryProtectedMembers {
	def main (args : Array[String]) : Unit = {
		var p3d : Point3D = new Point3D(10, 20, 10);
		p3d.printCoordinate();
	}
}