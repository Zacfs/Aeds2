#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>
bool palindromo(char *s)
{
	bool pal = true;
	int i = 0;
	while( i < (strlen(s)/2) && pal)
	{
		if(s[i] != s[(strlen(s)-1)-i])
		{pal = false;}
		i++;
	}
	return (pal);
}

int main()
{
	char s[100];
	while(s[0]!= 'F' && s[1]!='I' && s[2]!='M')
	{
		scanf("%[^\n]",s);
		getchar();
		
		if(palindromo(s))
		{
			printf("SIM\n");
		}
		else
		{
			if(s[0]!= 'F' && s[1]!='I' && s[2]!='M')
			{
			printf("NAO\n");
			}
		}
  	}
}