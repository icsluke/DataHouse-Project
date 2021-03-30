package project1;

public class teamMember {
	
		  private int memInt, memStr, memEnd, memSFT, memAvg;
		  private String memName;
		  
		  teamMember(String name, int intelligence, int strength, int endurance, int spicy) {
			  memName = name;
			  memInt = intelligence;
			  memStr = strength;
			  memEnd = endurance;
			  memSFT = spicy;
			  memAvg = 0;
		  }
		  
		  
		  public void setName(String name) {
			  memName = name;
		  }
		  
		  public void setInt(int intelligence) {
		      memInt = intelligence;
		  }
		  
		  public void setStr(int strength) {
		      memStr = strength;
		  }
		  
		  public void setEnd(int endurance) {
		      memEnd = endurance;
		  }
		  
		  public void setSFT(int spicy) {
		      memSFT = spicy;
		  }
		  
		  public void setAvg(int intelligence, int strength, int endurance, int spicy) {	 
			  memAvg = (intelligence + strength + endurance + spicy) / 4;
		  }
		  
		  public String retName() {
			  return memName;
		  }
		  
		  public int retInt() {
			  return memInt;
		  }
		  
		  public int retStr() {
			  return memStr;
		  }	
		  
		  public int retEnd() {
			  return memEnd;
		  }	
		  
		  public int retSFT() {
			  return memSFT;
		  }

		  public int retAvg() {
			  return memAvg;
		  }
}
