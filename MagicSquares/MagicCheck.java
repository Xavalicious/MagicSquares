
public class MagicCheck {
	
	public boolean magicChecker(int[][] p){
		boolean fact=true;
		boolean fact1=true;
		boolean fact2=true;
		boolean fact3=true;
		int c=0;
		int d=0;
		int g=0;
		int j=0;
		int k=0;
		int m=0;
		int n=p.length-1;
		for(int a=0;a<p.length;a++)
		{
			c=0;
			for(int b=0;b<p[0].length;b++)
				{
				c=c+p[a][b];	
				}
			if(a==0)
				{d=c;}
			if(c!=d)
				{
				fact=false;	
				break;
				}
		}
		for(int e=0;e<p.length;e++)
		{	
			g=0;
			for(int f=0;f<p[0].length;f++)
				{
				g=g+p[f][e];	
				}
			if(g!=d)
				{
				fact1=false;
				break;
			}
		}
		for(int i=0;i<p[0].length;i++)
			{
			j=j+p[i][k];
			k++;		
			}
		if(j!=d)
		{
		fact2=false;	
		}
		for(int q=p.length-1;q>=0;q--)
		{
			m=m+p[n][q];
			n--;
		}
		if(m!=d)
		{
		fact3=false;	
		}
		if(fact==true&&fact1==true&&fact2==true&&fact3==true)
		{
			return true;
		}
		else{return false;}
	}

}
