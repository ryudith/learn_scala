class SystemState (val state : String = "ok") {
	private var currentState : String = state;

	def setState (state : String = "system ok") : Unit = {
		this.currentState = state;
	}

	def getState () : String = {
		return this.currentState;
	}
}


class SystemCluster (override val state : String = "ok") extends SystemState (state) {
	def setClusterState (state : String = "system cluster ok") : Unit = {
		super.setState(state);
	}

	def getClusterState () : String = {
		return super.getState();
	}
}


object TryPrivateMembers {
	def main (args : Array[String]) : Unit = {
		var x : SystemCluster = new SystemCluster();

		x.setClusterState("Failed system");
		println(x.getClusterState());
	}
}