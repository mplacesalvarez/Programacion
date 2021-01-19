
package boletin9_3;

public class Area {
    float area;
    float base;
    float altura;

    public Area(float base, float altura) {
        this.base = base;
        this.altura = altura;


    }

    ;

    public void calcular_area() {
        area = base * altura;
        if ((base > 0) && (altura > 0)) {
            System.out.println("El área es: " + area);
        } else {
            System.out.println("Los números negativos no son válidos");
        }


    }


}
