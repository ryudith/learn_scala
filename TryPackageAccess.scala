package learn_scala {
	class Dimension2D (val x : Int, val y : Int) {
		private[learn_scala] val pkgName : String = "learn_scala";
		private[this] val dimensionName : String = "2D Dimension";
		val clsName = "Dimension2D";
		val tmpVar : Int = 99;

		def printPoint () : Unit = {
			println("Package name : " + pkgName);
			println("Dimension name : " + this.dimensionName);
			println("Class name " + this.clsName);
			println("X Point : " + this.x);
			println("Y Point : " + this.y);
			println();
			println("tmpVar : " + this.tmpVar);
		}
	}

	class Dimension3D (override val x : Int, override val y : Int, val z : Int) extends Dimension2D (x, y) {
		private[this] val dimensionName : String = "3D Dimension";
		override val clsName = "Dimension3D";
		override val tmpVar : Int = 33;

		override def printPoint () : Unit = {
			super.printPoint();
			println("X Point : " + this.z);
			println();
			println("tmpVar : " + this.tmpVar);

			//==> can not reassign val variable
			// tmpVar = 88;
			// println("tmpVar now : " + this.tmpVar)
		}
	}
}


import learn_scala._;

object TryPackageAccess {
	def main(args: Array[String]): Unit = {
		var dim3d : Dimension3D = new Dimension3D(10, 20, 30);
		dim3d.printPoint();
	}
}