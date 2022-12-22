public class Executives {

	//Data Members
	private String executiveName; 
	private String designation; 
	private String appointmentStartDate; //format: dd/mm/yyyy 
	private String appointmentEndDate; 
		
		
	//Method Members
	//Default Constructor
	public Executives(){
		executiveName = "";
		designation = "";
		appointmentStartDate = "";
		appointmentEndDate = "";
	}
	
	//Normal Constructor
	public Executives(String en, String ds, String appsd, String apped){
		executiveName = en;
		designation = ds;
		appointmentStartDate = appsd;
		appointmentEndDate = apped;
	}
	
	//Setter
	public void setExecutiveName(String en){
		executiveName = en;
	}
	
	public void setDesignation(String ds){
		designation = ds;
	}
	
	public void setAppointmentStartDate(String appsd){
		appointmentStartDate = appsd;
	}
	
	public void setAppointmentEndDate(String apped){
		appointmentEndDate = apped;
	}
	
	//Getter
	public String getExecutiveName(){
		return executiveName;
	}
	
	public String getDesignation(){
		return designation;
	}
	
	public String getAppointmentStartDate(){
		return appointmentStartDate;
	}
	
	public String getAppointmentEndDate(){
	return appointmentEndDate;
	}
	
	//Printer
	public String toString(){
		return "\n\nExecutive Name: "+executiveName+ "\nDesignation: "+designation+ "\nAppointment Start Date: RM "+appointmentStartDate+ "\nAppointment End Date: RM "+appointmentEndDate;
	}
	
}