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
	do
	{
		scanf("%s", s);
		getchar();
		if(palindromo(s))
		{
			printf("SIM");
		}
		else
		{
			printf("NAO");
		}
  	}while(s[0]!= 'F' && s[1]!='I' && s[2]!='M');
}
