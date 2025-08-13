//1. Illustrate the concept-Encapsulation with the Payment Gateway System.[The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, payment method, and transaction status. Provide appropriate public getter and setter methods to access and modify these details securely. Also include a method to display the transaction summary.]

class Payment{
	private int transactionId;
	private String payerName;
	private String payeeName;
	private double amount;
	private String paymentMethod;
	private String transactionStatus;

	void setTransactionId(int transactionId){
		this.transactionId = transactionId;
	}

	int getTransactionId(){
		return transactionId;
	}

	void setPayerName(String payerName){
		this.payerName = payerName;
	}

	String getPayerName(){
		return payerName;
	}

	void setPayeeName(String payeeName){
		this.payeeName = payeeName;
	}

	String getPayeeName(){
		return payeeName;
	}

	void setAmount(double amount){
		this.amount = amount;
	}

	double getAmount(){
		return amount;
	}

	void setPaymentMethod(String paymentMethod){
		this.paymentMethod = paymentMethod;
	}

	String getPaymentMethod(){
		return paymentMethod;
	}

	void setTransactionStatus(String transactionStatus){
		this.transactionStatus = transactionStatus;
	}

	String getTransactionStatus(){
		return transactionStatus;
	}

	void display(){
		System.out.println("Transaction Id: "+getTransactionId());
		System.out.println("Payer Name: "+getPayerName());
		System.out.println("Payee Name: "+getPayeeName());
		System.out.println("Amount: "+getAmount());
		System.out.println("Payment Method: "+getPaymentMethod());
		System.out.println("Transaction Status: "+getTransactionStatus());
	}
}

public class Q1{
	public static void main(String[] args){
		Payment obj = new Payment();
		obj.setTransactionId(100);
		obj.setPayerName("Vishnu");
		obj.setPayeeName("Raja");
		obj.setAmount(295);
		obj.setPaymentMethod("UPI");
		obj.setTransactionStatus("Successful");
		obj.setPaymentMethod("CASH");
		obj.display();
	}
}