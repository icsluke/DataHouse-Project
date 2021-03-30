package project1;

public class applicant {
	 private int appInt, appStr, appEnd, appSFT, appAvg;
	  private String appName;
	  
	  applicant(String name, int intelligence, int strength, int endurance, int spicy) {
		  appName = name;
		  appInt = intelligence;
		  appStr = strength;
		  appEnd = endurance;
		  appSFT = spicy;
		  appAvg = 0;
	  }
	  
	  
	  public void setName(String name) {
		  appName = name;
	  }
	  
	  public void setInt(int intelligence) {
	      appInt = intelligence;
	  }
	  
	  public void setStr(int strength) {
	      appStr = strength;
	  }
	  
	  public void setEnd(int endurance) {
	      appEnd = endurance;
	  }
	  
	  public void setSFT(int spicy) {
	      appSFT = spicy;
	  }
	  
	  public void setAvg(int intelligence, int strength, int endurance, int spicy) {	 
		  appAvg = (intelligence + strength + endurance + spicy) / 4;
	  }
	  
	  public String retName() {
		  return appName;
	  }
	  
	  public int retInt() {
		  return appInt;
	  }
	  
	  public int retStr() {
		  return appStr;
	  }	
	  
	  public int retEnd() {
		  return appEnd;
	  }	
	  
	  public int retSFT() {
		  return appSFT;
	  }
	  
	  public int retAvg() {
		  return appAvg;
	  }

}
