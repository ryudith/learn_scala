class Point (var xp : Int, var yp : Int) {
	def move (dx : Int, dy : Int) : Unit = {
		this.xp += dx;
		this.yp += dy;

		println("Location X : " + this.xp);
		println("Location Y : " + this.yp);
	}
}


object TryExtendsClass {
	def main (args : Array[String]) : Unit = {
		val p : Point = new Point(10, 20);
		p.move(10, 10);
	}
}