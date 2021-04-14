
public class InfixToPostfix {
	private String infix;

	public InfixToPostfix(String infix){
		this.infix = infix;
	}

	
	//a method to convert the infix expression to postfix expression
	//Note: this method converts the value of the instance variable infix
	public String convertToPostFix(){
		
		Stack k;
		StringBuilder leInfix = new StringBuilder();
		
		String stringOfInfix = infix;
		int num = stringOfInfix.length();
		
		for(int i = 0; i < num;i++)
		{
			leInfix.append(stringOfInfix.charAt(i));
		}
		
		k = new ArrayStack();
		
		StringBuilder postfix = new StringBuilder();
		
		char g = 0;
		char p = 0;
		int h = 5;
	
		for(int v = 0; v< num; v++)
		{	
			if(stringOfInfix.charAt(v) != ' ')
			{
				if(stringOfInfix.charAt(v)!='+')
				{
					if(stringOfInfix.charAt(v) != '-')
					{
						if(stringOfInfix.charAt(v) != '%')
						{
							if(stringOfInfix.charAt(v) != '*')
							{
								if(stringOfInfix.charAt(v) != '/')
								{
									if(stringOfInfix.charAt(v) != '^')
									{
										if(stringOfInfix.charAt(v) != '(')
										{
											if(stringOfInfix.charAt(v) != ')')
											{
												if(Character.isDigit(stringOfInfix.charAt(v)) || Character.isLetter(stringOfInfix.charAt(v))  )
												{
													if(v>0)
													{
														if(stringOfInfix.charAt(v-1) == '+' || stringOfInfix.charAt(v-1) == '-' || stringOfInfix.charAt(v-1) == '*' || stringOfInfix.charAt(v-1) == '/' || stringOfInfix.charAt(v-1) == '%' || stringOfInfix.charAt(v-1) == '^')
														{
															postfix.append(' ');
														}
													}
													postfix.append(stringOfInfix.charAt(v));
													p = 1;
												}
												if(v < num-1)
												{
													if(stringOfInfix.charAt(v+1) == ' ')
													{
														postfix.append(' ');
													}
												}
						
											}
										}
									}
								}
							}
						}
					}
				}

				
			if(stringOfInfix.charAt(v)=='+' || stringOfInfix.charAt(v) == '-')
			{
				if(k.isEmpty())
				{
					k.push(stringOfInfix.charAt(v));
					h = 0;
				}
				if(k.isEmpty() == false)
				{
					if(g=='*' || g =='%' || g == '/' || g == '^')
					{
						while(k.isEmpty()==false)
						{
							if(g == '(')
							{
								k.pop();
								break;
							}
							postfix.append(" ");
							postfix.append(k.pop());
							if(k.isEmpty() == false)
							{
								g = k.top().toString().charAt(0);
							}
							
						}
					}
					if(h != 0)
					{
						k.push(stringOfInfix.charAt(v));
					}
					
					
				}
				
				
				
			}
			h = 5;
			if(stringOfInfix.charAt(v) == '*' || stringOfInfix.charAt(v) == '/' 
					|| stringOfInfix.charAt(v) == '%')
			{
				if(k.isEmpty()==false)
				{
					if(g == '^')
					{
						while(k.isEmpty()==false)
						{
							if(g == '(')
							{
								k.pop();
								break;
							}
							postfix.append(" ");
							postfix.append(k.pop());
							if(k.isEmpty()==false)
							{
								g = k.top().toString().charAt(0);
							}
						  	
						}
					}
				}
				k.push(stringOfInfix.charAt(v));
				g = k.top().toString().charAt(0);
			}
			if(stringOfInfix.charAt(v)=='^')
			{
				k.push(stringOfInfix.charAt(v));
				g = k.top().toString().charAt(0);
			}
			if(stringOfInfix.charAt(v)=='(')
			{
				k.push(stringOfInfix.charAt(v));
				g = k.top().toString().charAt(0);
			}
			
			if(stringOfInfix.charAt(v)==')')
			{
				g = k.top().toString().charAt(0);
				
				while(g != '(')
				{
					postfix.append(" ");
					postfix.append(k.pop());
					g = k.top().toString().charAt(0);
				}
				
			}
			
			if(v == num - 1)
			{
				while(k.isEmpty()==false)
				{
					if(stringOfInfix.charAt(v) == ' ')
					{
						postfix.append(k.pop());
						v = 0;
					}
					postfix.append(' ');
					if(k.isEmpty()==false)
					{
						postfix.append(k.pop());
					}
					
				}
			}
			p = 0;
			
		
			}
			
		}
		
		
		
		
		int paren = 0;
		
		
		for(int u = 0; u < stringOfInfix.length(); u++)
		{
			paren = postfix.indexOf("(");
			if(paren == -1)
			{
				break;
			}
			postfix.deleteCharAt(paren);
			
			
		}
		
		for(int d = 0; d<postfix.length(); d++)
		{
			if(postfix.charAt(d)==' ')
			{
				if(postfix.charAt(d-1)==' ')
				{
					postfix.deleteCharAt(d);
				}
			}
		}
		for(int y = 0; y<postfix.length(); y++)
		{
			if(postfix.charAt(y) == '+' || postfix.charAt(y) == '-' || postfix.charAt(y) == '*' || postfix.charAt(y) == '/' || postfix.charAt(y) == '%' || postfix.charAt(y) == '^')
			{
				if(postfix.charAt(y-1) != ' ')
				{
					postfix.insert(y-1," ");
				}
				if(y < postfix.length()-1)
				{
					if(postfix.charAt(y+1) != ' ')
					{
						postfix.insert(y+1," ");
					}
				}
				
			}
		}
		String b = postfix.toString();
		
		
		return b;
	}
	
}
