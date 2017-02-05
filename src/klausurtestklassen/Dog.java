package klausurtestklassen;

public class Dog implements AgentI, CanBark {
	private int id;
	Dog(int id){
		this.id = id;
	}
	
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Dog move method; id: "+id);
	}
	
	public void bark(){
		System.out.println("Dog bark method: id: "+id);
	}

}
