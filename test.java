package test2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//class A 
public class A {
	//Id in arraylist
	public int Id;
	 //Balance for id
	public double Balance;
	
	
	// function for add Balance in client A by id
	//in function id =id client A,Balance client,list for example database  
	public static void addBalance(int id , double balance,ArrayList<A> list) {
		boolean test=false;
		for (int i = 0; i < list.size(); i++) {
		      if(list.get(i).Id==id) {
		    	  list.get(i).Balance+=balance;
		    	  System.out.println("balance added");
		    	  test =true;
		      }
		    }
		if(test==false)System.out.println("balance not added");
	}
	//fonction remove balance for Client A 
	public static void withdrawalBalance(int id,double balance,ArrayList<A> list) {
		boolean test=false;
		for (int i = 0; i < list.size(); i++) {
		      if(list.get(i).Id==id && list.get(i).Balance>=balance  ) {
		    	  list.get(i).Balance-=balance;
		    	  System.out.println("balance withdrawal");
		    	  test =true;
		      }
		    }
		if(test==false)System.out.println("balance not withdrawal");
	}
	//find client by id in list
	public static double getBalanceById(int id,List<A> list){
		double balance = 0;
		for (int i = 0; i < list.size(); i++) {
		      if(list.get(i).Id==id) balance=list.get(i).Balance;
		    }
		return balance;
	}
//fonction main (princepal)
public static void main(String[] args) {
	    ArrayList<A> list=new ArrayList<A>();
		System.out.print("------Hello------ \n\n  ");
		int x=1;
		Scanner in= new Scanner(System.in);
		while(x!=0) {
			do {
				System.out.println("-1- Add client -2- balance by id -3- add balance -4- withdrawal Balance  ");
	            x=in.nextInt();
			}while(x>4 || x<0);
			switch(x) {
			case 1:A a =new A();
			System.out.print("Client Id");
			a.Id=in.nextInt();
			System.out.print("Client Balance");
			a.Balance=in.nextDouble();
			list.add(a);
	        System.err.println("Added ");
			break;
			case 2:System.out.print("Client Id");
			int id=in.nextInt();
			double balance=getBalanceById(id,list);
			System.out.println("Balance for "+id +" = " +balance);
			break;
			case 3:System.out.print("Client Id");
			int id1=in.nextInt();
			System.out.print("Balance");
			double balance1=in.nextDouble();
			addBalance(id1, balance1,list);
			break;
			case 4:System.out.print("Client Id");
			int id2=in.nextInt();
			System.out.print("Balance");
			double balance2=in.nextDouble();
			withdrawalBalance(id2,balance2,list);
			default:System.out.println("-1- Add client -2- balance by id -3- add balance -4- withdrawal Balance  ");
			}
			
			
		}
		}
		
}

	

