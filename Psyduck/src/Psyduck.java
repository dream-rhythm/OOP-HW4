
public class Psyduck {
	private String name;
	public float weight;
	public float height;
	public int hp;
	public int powerup(){
		System.out.println("power up");
		hp=hp+100;
		return hp;
	}
	public void evolove(){
		System.out.println("evolove");
		weight+=5;
		height+=10;
	}
	Psyduck(String name,float weight,float height,int hp){
		this.height=height;
		this.name=name;
		this.hp=hp;
		this.weight=weight;
	}

}
