import javax.management.modelmbean.ModelMBeanConstructorInfo;

public class Main
{
    public static void main(String[] args) {
        suma(2, 5, 7);

        Coche miCoche = new Coche();
        miCoche.SumarPuerta();
        System.out.println(miCoche.puertas);        
    }
    
    public static void suma(int n1,  int n2, int n3) {
        int resultado = n1 + n2 +n3;
        System.out.println(resultado);

    }
}

class Coche {
    int puertas = 0;

    public void SumarPuerta() {
        this.puertas += 1;
    }
}