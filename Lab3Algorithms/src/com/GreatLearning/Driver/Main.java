package com.GreatLearning.Driver;

import com.GreatLearning.Service.BalancedBrackets;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BalancedBrackets bb=new BalancedBrackets();
		
		String expr = "( [ [ { } ] ] ) )";
		 
        // Function call
        if (bb.areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
		
	}

}
