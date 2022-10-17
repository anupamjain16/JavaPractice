package test;

public class LinlListSwapValue {

	public static void main(String[] args) {
	
		
	    
		  public void swap ( Node node,int val1 , int val2)
		  {
		  
		       if(node == null || node.next == null )
			   {
			    
				return;
			   
			   }
			   
			   
			    
				if(searchValue(val1 , node))

		       {
			    Node first  = search(val1 , node);
				Node prev1 = prev( node ,first );
			   
			   }     

		       if(searchValue(val2 , node))

		       {
			   
			   Node  second =  search(val2 , node);
			   Node prev2 = prev( node ,second );
			   } 
			
			    if( Node == first)
				{
				     node = second;
				}
				
				
				prev1.next = second;
				Node temp = seconde.next;
				second.next = first.next;
				prev2.next = first;
				first.next = temp;
		        	
				
		 
		  
		  }  
		  
		  
		  public Node prev( Node node , Node first)
		  {
		    
		     while( node.next != first )
			 {
			    
				 node = node.next;
			   
			 }
			 
			 return node;
		  
		  }
		  
		  
		  
		    
		  public boolean searchvalue(int val)
		  {
		        
				while( node.next != null)
				{
				    
					 if( val == node.data)
					 {
					    
						return true;
					 
					 }
				   
				   node = node.next;
				}
				
			return false;
		  
		  }
		  
		  
		  
		  
		  public Node search( int val , Node node)
		  {
		        
				while( node.next != null)
				{
				    
					 if( val == node.data)
					 {
					    
						return node;
					 
					 }
				   
				   node = node.next;
				}
				
				
		  
		  }
		  
		  

	}

}
