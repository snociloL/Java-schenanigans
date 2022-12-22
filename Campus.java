public class Campus extends Executives{
	
	//Data Members
	private String campusCode;//example: 'R' for Perlis, "D' for Terengganu 
	private String campusName; //name of the campus 
	private String area; 
	//Method Members
	//Default Constructor
	public Campus(){
		super();
		campusCode = "";
		campusName = "";
		area = "";
	}
	
	
	//Normal Constructor
	public Campus(String en, String ds, String appsd, String apped, String cc, String cn, String ar ){
		super(en,ds,appsd,apped);
		campusCode = cc;
		campusName = cn;
		area = ar;
	}
	
	//Setter
	public void setCampusCode(String cc){
		campusCode = cc;
	}
	
	public void setCampusName(String cn){
		campusName = cn;
	}
	
	public void setArea(String ar){
		area = ar;
	}
	
	//Getter
	public String getCampusCode(){
		return campusCode;
	}
	public String getCampusName(){
		return campusName;
	}
	public String getArea(){
		return area;
	}
	
	//Processor
	public String campusState() {
	String state= "";
	if(campusCode.equalsIgnoreCase("R")){
 		state = "Perlis";
 	}
	else if(campusCode.equalsIgnoreCase("K")){
 		state = "Kedah";
 	}
	else if(campusCode.equalsIgnoreCase("D")){
 		state = "Terengganu";
 	}
	return state;
	}
	
	//Printer
	public String toString(){
		return super.toString() + "\nCampus Code: "+campusCode+ "\nCampus Name: "+campusName+ "\nCampus Area: "+area;
	}			
}