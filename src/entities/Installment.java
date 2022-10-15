package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Installment {
	
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDate dueDate;
	private Double amount;
	
	
	private List<Installment> installments = new ArrayList<>();
	
	
	public Installment(LocalDate dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}


	public LocalDate getDueDate() {
		return dueDate;
	}


	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return dueDate.format(fmt) + " - " + String.format("%.2f", amount);
	}
	
	
	
	

}
