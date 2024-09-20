package BrailleApp;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Braille {

	 
	
	public static void main(String[] args) {

		translate_Braille_to_English();

	}
    static void translate_Braille_to_English() {
    	
    	
    	
    	try {

       	 HashMap<String, String> brailleAlphabet = new HashMap<String, String>();
 
       	 
       	brailleAlphabet.put("1","0 ."
       	 	 	     + ". ."
       	 		     + ". .");
       	
       	brailleAlphabet.put("2","0 ."
   	 	 	         + "0 ."
   	 		         + ". .");
   	
       	 
       	 
       	brailleAlphabet.put("3","0 0"
   	 	 	        + ". ."
   	 		        + ". .");
   	
       	 
       	 
       	brailleAlphabet.put("4","0 0"
   	 	 	         + ". 0"
   	 		         + ". .");
   	
       	 
       	 
       	brailleAlphabet.put("5","0 ."
   	 	 	         + ". 0"
   	 		         + ". .");
   	
       	 
       	 
       	brailleAlphabet.put("6","0 ."
   	 	 	     + ". ."
   	 		     + ". .");
   	
       	 
       	 
       	 
       	brailleAlphabet.put("7","0 0"
   	 	 	         + "0 0"
   	 		         + ". .");
   	
       	 
       	 
       	brailleAlphabet.put("8","0 ."
   	 	 	         + "0 0"
   	 		         + ". .");
   	
       	 
       	 
       	brailleAlphabet.put("9",". 0"
   	 	 	         + "0 ."
   	 		         + ". .");
   	
       	 
       	 
       	brailleAlphabet.put("0",". 0"
   	 	 	          + "0 0"
   	 		         + ". .");
   	 
	 
       	 
       	brailleAlphabet.put("A", "0 ."
       		                + ". ."
       		                 + ". .");
       	
       	
       	
       	

       	brailleAlphabet.put("B", "0 ."
       		                   + "0 ."
       		                   + ". .");
       	
       	
       	
       	
       	

       	brailleAlphabet.put  ("C", "0 0"
       		                   + ". ."
       		                   + ". .");
       	
       	
       	
       	
       	
       	
       	

       	brailleAlphabet.put("D", "0 0"
       		                   + ". 0"
       		                   + ". .");
       	
       	
       	
       	
       	
       	

       	brailleAlphabet.put("E", "0 ."
       		                   + ". 0"
       		                   + ". .");
       	
       	
 
       	

       	brailleAlphabet.put("F", "0 0"
       		                   + "0 ."
       		                   + ". .");
       	
       	
       	
       	
         	

       	brailleAlphabet.put("G", "0 0"
       		                   + "0 0"
       		                   + ". .");
       	
       	
       	
       	
       	
       	
       	
       	
         	

       	brailleAlphabet.put("H", "0 ."
       		                   + "0 0"
       		                   + ". .");
       	
       	
       	
       	
       	
       	
       	
       	
       	
         	

       	brailleAlphabet.put("I", ". 0"
       		                   + "0 ."
       		                   + ". .");
       	
       	
       	

       	brailleAlphabet.put("I", ". 0"
       		                   + "0 ."
       		                   + ". .");
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	

       	brailleAlphabet.put("J", ". 0"
       		                   + "0 0"
       		                   + ". .");
       	
       	
       	
       	
       	
       	
       	

       	

       	brailleAlphabet.put("K", "0 ."
       		                   + ". ."
       		                   + "0 .");
       	
       	
       	
       	
       	
       	

       	brailleAlphabet.put("L", "0 ."
       		                   + "0 ."
       		                   + "0 .");
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	

       	brailleAlphabet.put("M", "0 0"
       		                   + ". ."
       		                   + "0 .");
       	
       	
       	
       	
       	
       	
       	
       	
       	
       	

       	brailleAlphabet.put("N", "0 0"
       		                   + ". 0"
       		                   + "0 .");

       	brailleAlphabet.put  ("O", "0 ."
       		                     + ". 0"
       		                     + "0 .");
       	
       	
       	
       	
          	

       	brailleAlphabet.put  ("P", "0 0"
       		                     + "0 ."
       		                     + "0 .");
       	
       	
       	
       	
       	
       	
       	
          	

       	brailleAlphabet.put  ("Q", "0 0"
       		                     + "0 0"
       		                     + "0 .");
       	
       	
       	
       	
       	
       	
       	
       	
          	

       	brailleAlphabet.put  ("R", "0 ."
       		                     + "0 0"
       		                     + "0 .");
       	
       	
       	
       	
       	
       	
       	
       	
          	

       	brailleAlphabet.put  ("S", ". 0"
       		                     + "0 ."
       		                     + "0 .");
       	
       	
       	
       	
       	
       	
       	
       	
          	

       	brailleAlphabet.put  ("T", ". 0"
       		                     + ". 0"
       		                     + "0 .");
       	
       	
       	
       	
       	
       	
       	
          	

       	brailleAlphabet.put  ("U", "0 ."
       		                     + ". ."
       		                     + "0 0");
       	
       	
       	
       	
       	
       	brailleAlphabet.put  ("V", "0 ."
                                    + "0 ."
                                    + "0 0");


       	
       	brailleAlphabet.put  ("W", ". 0"
                                    + "0 0"
                                    + ". 0");




       	
       	brailleAlphabet.put  ("X", "0 0"
                                    + ". ."
                                   + "0 0");


       	
       	
       	
       	brailleAlphabet.put  ("Y", "0 0"
                                    + ". 0"
                                    + "0 0");


       	
       	
       	brailleAlphabet.put  ("Z", "0 ."
                               + ". 0"
                               + "0 0");


        
        String messageString = "42";
  	  	
        
        
        
        String valueMessage= "0 0. .0 0";
      
        for(java.util.Map.Entry<String, String> entry: brailleAlphabet.entrySet()) {
			
        	if (entry.getValue()==valueMessage) {
				
        		System.out.println(entry.getKey());
			}
		}
        
       
   	 char[]ch=messageString.toCharArray();
   	 
   	 if (Character.isUpperCase(ch[0])==true) {
			System.out.print(".....");
		 }
        
        
       for (int i=0; i < messageString.length();i++ ) {
  
      	 char c = ch[i];
      	String cString= String.valueOf(c);
      	 
   
      	
      	 switch (cString.toUpperCase()) {
      	 

                 
      	 
		case  "A":
			
		 System.out.print(brailleAlphabet.get(cString+""))	;
			
			break;
              
			
			
		case  "B":
			
			 System.out.print(brailleAlphabet.get(cString+""))	;
				
				break;
			
				
		case  "C":
			
			 System.out.print(brailleAlphabet.get(cString+""))	;
				
				break;
                  
				
		case  "D":
				
			System.out.print(brailleAlphabet.get(cString+""))	;
					
			break;
				
					
					
					
					
			case  "E":
				
			 System.out.print(brailleAlphabet.get(cString+""))	;
					
			break;
                      
					
			case  "F":
					
			System.out.print(brailleAlphabet.get(cString+""))	;
						
			break;
					
						
						
						
						
			case  "G":
					
			System.out.print(brailleAlphabet.get(cString+""))	;
						
			break;
                          
						
			case  "H":
						
			 System.out.print(brailleAlphabet.get(cString+""))	;
							
			break;
						
							
							
							
							
				case  "I":
						
				System.out.print(brailleAlphabet.get(cString+""))	;
							
				break;
	                           
							
				case  "J":
							
				System.out.print(brailleAlphabet.get(cString+""))	;
								
				break;
							
								
								
								
								
				case  "K":
							
				System.out.print(brailleAlphabet.get(cString+""))	;
								
				break;
		                           
								
				case  "L":
								
				 System.out.print(brailleAlphabet.get(cString+""))	;
									
				break;
								
									
									
									
									
				case  "M":
								
				System.out.print(brailleAlphabet.get(cString+""))	;
									
				break;
			                           
									
				case  "N":
									
				 System.out.print(brailleAlphabet.get(cString+""))	;
										
				break;
									
										
										
										
										
				case  "O":
									
				 System.out.print(brailleAlphabet.get(cString+""))	;
										
				break;
				                           
										
				case  "P":
										
				 System.out.print(brailleAlphabet.get(cString+""))	;
											
					break;
										
											
											
											
											
				case  "Q":
										
				System.out.print(brailleAlphabet.get(cString+""))	;
											
				break;
					                           
											
				case  "R":
											
				 System.out.print(brailleAlphabet.get(cString+""))	;
												
				break;
											
												
												
												
												
			case  "S":
											
			 System.out.print(brailleAlphabet.get(cString+""))	;
												
			break;
						                           
												
				case  "T":
												
             System.out.print(brailleAlphabet.get(cString+""))	;
													
              break;
														
				
              
              
              
				
				
            case  "U":
					
          System.out.print(brailleAlphabet.get(cString+""))	;
						
          break;
                         
						
          case  "V":
						
          System.out.print(brailleAlphabet.get(cString+""))	;
							
	       break;
	 					
							
							
							
							
            case  "W":
						
           System.out.print(brailleAlphabet.get(cString+""))	;
							
            break;
	                           
							
              case  "X":
							
             System.out.print(brailleAlphabet.get(cString+""))	;
								
             break;
							
								
								
								
								
            case  "Y":
							
            System.out.print(brailleAlphabet.get(cString+""))	;
								
             break;
		                           
								
             case  "Z":
								
            System.out.print(brailleAlphabet.get(cString+""))	;
									
              break;
										

     		case  "1":
    			
     			 System.out.print(brailleAlphabet.get(cString+""))	;
     				
     				break;
     	              
     				
     			case  "2":
     				
     				 System.out.print(brailleAlphabet.get(cString+""))	;
     					
     					break;
     				
     					
     			case  "3":
     				
     				 System.out.print(brailleAlphabet.get(cString+""))	;
     					
     					break;
     	                  
     					
     			case  "4":
     					
     				System.out.print(brailleAlphabet.get(cString+""))	;
     						
     				break;
     					
     						
     						
     						
     						
     				case  "5":
     					
     				 System.out.print(brailleAlphabet.get(cString+""))	;
     						
     				break;
     	                      
     						
     				case  "6":
     						
     				System.out.print(brailleAlphabet.get(cString+""))	;
     							
     				break;
     						
     							
     							
     							
     							
     				case  "7":
     						
     				System.out.print(brailleAlphabet.get(cString+""))	;
     							
     				break;
     	                          
     							
     				case  "8":
     							
     				 System.out.print(brailleAlphabet.get(cString+""))	;
     								
     				break;
     				
     				
    					case  "9":
     							
     					System.out.print(brailleAlphabet.get(cString+""))	;
     								
     					break;
     		                         
                
               
              
              
				
		default:
			break;
		}
      	 
      	 
       }
       	  
       	 
       	//ArrayList
       	
       	ArrayList<String>Capital= new ArrayList<String>();
       	 Capital.add (". ."
       	 	    	+ ". ."
       	 	    	+ ". 0");
       	 
       	 
       		
        	ArrayList<String>Decimal= new ArrayList<String>();
        	Decimal.add (". 0"
        	 	    	+ ". ."
        	 	    	+ ". 0");
        	
        	
        	
        	
    		
        	ArrayList<String>NumberFollow= new ArrayList<String>();
        	NumberFollow.add  (". 0"
        	 	    	+ ". 0"
        	 	    	+ "0 0");
 
       	 
    		}
    		catch(Exception e) {

            System.err.println(e.getMessage());
    		}
    	
    	
    }
	
	
}
