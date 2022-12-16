package test3;

public abstract class LeagueOfLegends {
	private String name;
	private String Runeterra;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public String getRuneterra() {return Runeterra;}
	public void setRuneterra(String runeterra) {Runeterra = runeterra;}
	
	public abstract void Q();
	public abstract void W();
	public abstract void E();
	public abstract void R();
	
}
