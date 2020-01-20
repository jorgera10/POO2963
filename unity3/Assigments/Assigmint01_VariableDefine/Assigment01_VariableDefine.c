
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

double a=0.0; double suma=0.0;

void entraDatos(); void calculo();

int main() {
    entraDatos();
    calculo();
    printf("El valor del sumatorio es: %lf\n\n ", suma);
    return 0;
    //Ejemplo aprenderaprogramar.com
}

void entraDatos() {
    while (a <= 0 || a > 100) {
        printf("Por favor introduzca un numero entero comprendido entre 1 y 100: ");
        scanf("%lf", &a);
        a = floor(a);
    }
    printf("El dato base es: %.0lf\n\n", a); return;
}

void calculo() {
    int i=0; // Ejemplo aprenderaprogramar.com
    do {
        suma = suma + 1/a; a = a-1; i = i+1;
    } while ( a != 0);
    printf("Contabilizados %d terminos \n\n", i); return;
}
