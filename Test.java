package edu.mx.uttt.ejercicios;
public class Test {
    public static void main(String[] args) {
        System.out.println("hola mundo");
        int Tam=3;
        vectoresEnteros v= new vectoresEnteros(Tam);

        int[] v1={5,6,7};
        int[] v2={1,2,3};

        v.setV1(v1);
        v.setV2(v2);
        System.out.println("suma de 2 vectores:{");
        System.out.println("vector 1: ");
        v.VectorSuma(v.getV1());
        System.out.println("vector 2: ");
        v.VectorSuma(v.getV2());
        System.out.println("vector 3: ");
        int[] sumav = v.sumar();
        v.VectorSuma(sumav);
        System.out.println("}");


        System.out.println("Ejercicio Escalar {");
        int Escalar=v.Escalar();
        System.out.println("Escalar de los vectores v1 y v2: " + Escalar+"}");


        System.out.println("Ejercicio invertir vectores");
        int[] v1Invertido= v.invertir(v.getV1());
        System.out.println("v1 Invertido");
        v.VectorSuma(v1Invertido);

        int[] v2Invertido= v.invertir(v.getV2());
        System.out.println("v2 Invertido");
        v.VectorSuma(v2Invertido);

        System.out.println("Ejercicio multiplicar escalar");
        int escalar =3;
        int[]v1multi= v.multiplicarEscalar(v.getV1(),escalar);
        System.out.println("v1 *"+ escalar + "=");
        v.VectorSuma(v1multi);

        int[]v2multi=v.multiplicarEscalar(v.getV2(),escalar);
        System.out.println("v2 *"+ escalar+"=");
        v.VectorSuma(v2multi);

    }
}
