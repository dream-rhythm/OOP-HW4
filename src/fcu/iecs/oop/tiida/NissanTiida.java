package fcu.iecs.oop.tiida;

public class NissanTiida {
	private int use;
	public void tiida(){
		this.use++;
		for(int i=0;i<this.use;i++){
			for(int j=0;j<this.use;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n\n");
	}
	NissanTiida(){
		this.use=0;
	}
	
}
