#include <stdio.h>
#include <stdlib.h>

//Max Line Length
unsigned int LEN = 1024;
FILE * infile;
char line[1024];

char *keywords[] = {
	"abstract", "continue", "for", "new", "switch", "assert", "default", "goto",
	"package", "synchronized", "boolean", "do", "if", "private", "this", "break",
	"double", "implements", "protected", "throw", "byte", "else", "import", "public",
	"throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends",
	"int", "short", "try", "char", "final", "interface", "static", "void", "class",
	"finally", "long", "strictfp", "volatile", "const", "float", "native", "super",
	"while"
};

int match(char *text, char *search, int index){
	int i = index;
	int j = 0;
	for (j=0; (search[j]>0)&(text[i]>0); j++ & i++) {
		if (search[j] != text[i]) return 0;
	}
	return 1;
}


int main(int argc, char *argv[]){

	if (argc > 1) {
		infile = fopen(argv[1], "r");
	} else {
		infile = stdin;
	}

	char * l = line;
//	char * out = (char *)malloc(sizeof(char) * LEN);
	int j = 0;
loop:
	while (getline(&l, &LEN, infile) >= 0) {
		j=0;
//		out = realloc(outl, LEN);
		while (l[j]!='\n') {
			if (l[j]) {

if (match(l,"import ",j)) {
	break;
}

if (match(l,"public ",j)) {
	j+=7;
}

if (match(l,"private ",j)) {
	j+=8;
}

if (match(l,"static ",j)) {
	j+=7;
}

if (match(l,"String ",j)) {
	j+=6;
	printf("var");
}

if (match(l,"void ",j)) {
	printf("function");
	j+=4;
}

if (match(l,"int ",j)) {
	printf("var");
	j+=3;
}

/*if (	(l[j+0]=='(') ){
	int k = 0;
	while (l[j+0]!=' ') {
		j--;
	}
	j--;
	while (l[j+0]!=' ') {
		j--;
		k++;
	}
	if(match(l,"public ", j)){
		l[j]=' ';j++;	l[j]=' ';j++;	l[j]=' ';j++;
		l[j]=' ';j++;	l[j]=' ';j++;	l[j]=' ';j++;
		l[j]=' ';j++;
	}
}*/

printf("%c", l[j]);
j++;

			}
		}
		printf("\n");
//		printf("%s", out);
	}

	return 0;
}
