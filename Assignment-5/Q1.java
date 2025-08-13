/* 1. Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed. */

class MedicalRecord{
	int recordId;
	String patientName;
	String dateOfVisit;
	String diagnosis;
	String location;
	String hospitalName;
	MedicalRecord(int recordId,String patientName,String dateOfVisit, String diagnosis){
		this.recordId = recordId;
		this.patientName = patientName;
		this.dateOfVisit = dateOfVisit;
		this.diagnosis = diagnosis;
	}

	void inputRecordDetails(String location,String hospitalName){
		this.location = location;
		this.hospitalName = hospitalName;
		System.out.println("Location: "+location);
		System.out.println("Hospital Name: "+hospitalName);
	}

	void displayRecord(){
		System.out.println("Record Id: "+recordId);
		System.out.println("Patient Name: "+patientName);
		System.out.println("Date Of Visit: "+dateOfVisit);
		System.out.println("Diagnosis: "+diagnosis);
	}
}

class InPatientRecord extends MedicalRecord{
	int roomNumber;
	int numberOfDaysAdmitted;
	double roomCharges;

	InPatientRecord(int recordId,String patientName,String dateOfVisit, String diagnosis,int roomNumber,int numberOfDaysAdmitted, double roomCharges){
		super(recordId,patientName,dateOfVisit,diagnosis);
		this.roomNumber = roomNumber;
		this.numberOfDaysAdmitted = numberOfDaysAdmitted;
		this.roomCharges = roomCharges;
	}

	double calculateTotalCharges(){
			return numberOfDaysAdmitted * roomCharges;
	}

	void displayRecord(){
		super.displayRecord();
		System.out.println("Room Number: "+roomNumber);
		System.out.println("Number of days admitted: "+numberOfDaysAdmitted);
		System.out.println("Room charges: "+roomCharges);
		System.out.println("TotalCharges: "+calculateTotalCharges());
	}
}

class OutPatientRecord extends MedicalRecord{
	String doctorName;
	double consultationFee;

	OutPatientRecord(int recordId,String patientName,String dateOfVisit, String diagnosis,String doctorName,double consultationFee){
		super(recordId,patientName,dateOfVisit,diagnosis);
		this.doctorName = doctorName;
		this.consultationFee = consultationFee;
	}

	void displayRecord(){
		super.displayRecord();
		System.out.println("Doctor Name: "+doctorName);
		System.out.println("Consultation Fee: "+consultationFee);
	}
}

public class Q1{
	public static void main(String[] args){
		MedicalRecord m1 = new InPatientRecord(1,"Meera","26-07-2025","Fever",101,2,100);
		//m1.calculateTotalCharges();
		m1.displayRecord();

		MedicalRecord m2 = new OutPatientRecord(2,"Anandhan","27-07-2024","Throat Pain","RajaVelu",200);
		m2.displayRecord();


	}
}
