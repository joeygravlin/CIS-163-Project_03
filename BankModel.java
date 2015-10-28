package project3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.util.ArrayList;

import javax.swing.AbstractListModel;
import javax.swing.table.AbstractTableModel;

public class BankModel extends AbstractTableModel{
	
	private ArrayList<Account> aList = new ArrayList<Account>();
	private String[] columnNames = {"Number", "Date Opened", "Account Owner", "Current Balance"};

	public void addAccount(Account e){
		aList.add(e);
		fireTableRowsInserted(0, aList.size());
	}
	
	public void removeAccount(){
		
	}
	
	public Account getAccount(int i){
		return aList.get(i);
	}
	
	public int getSize(){
		return aList.size();
	}
	
	//fix me
	public void saveAsBinary(String fileName){
		try{
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream os = new ObjectOutputStream(fos);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	public void saveAsText(){
		
	}
	
	public void saveAsXML(){
		
	}
	public void loadFromBinary(){
		
	}
	
	public void loadFromText(){
		
	}
	
	public void loadFromXML(){
		
	}
	
	@Override
	public String getColumnName(int col) {
	    return columnNames[col];
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnNames.length;
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		//System.out.println(aList.size());
		return aList.size();
	}
	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		switch(col){
		case 0:
		//add getName method
		//return(aList.get(row).getName())
		
		case 1:
			//add getCost method
			//return(aList.get(row).getCost())
		
		case 2:
			//get date correctly
			/*
			if(DateFormat.getDateInstance(DateFormat.SHORT).format(aList.get(row).getBought()){
				
			}
			*/
		case 3:
			//if(aList.get(row) instanceof SavingsAccount){
				//return('Savings Account' + ((SavingsAccount) aList))
			//}
		}
		//delete this
		return aList;
	}
}
