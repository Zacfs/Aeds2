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
		if(s[i] != s[strlen(s)-i])
		{pal = false;}
	}
	return (pal);
}

int main()
{
	char *s = "0";
	while(s != "FIM")
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
	}
}