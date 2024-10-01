package edu.mx.uttt.ejercicios;

public class vectoresEnteros {

    private int [] v1;
    private int [] v2;
    private int Tam;

    public vectoresEnteros(int Tam){

        if (Tam>0){
            v1=new int[Tam];
            v2=new int[Tam];
            this.Tam=Tam;
        }else{
            v1=new int[1];
            v2=new int[1];
            this.Tam=1;
        }
    }

    public int[] getV1() {
        return this.v1;
    }

    public void setV1(int[] v1) {

        if (v1.length==this.v1.length){
            int i=0;
            while (i< v1.length){
                this.v1[i]=v1[i];
                i++;
            }
        }
//        if (v1.length==Tam){
//            for (int i=0; i<v1.length; i++){
//                this.v1[i]=v1[i];
//            }
//        }
    }


    public int[] getV2() {
        return this.v2;
    }

    public void setV2(int[] v2) {
        if (v2.length==this.v2.length){
            int i=0;
            while (i< v2.length){
                this.v2[i]=v2[i];
                i++;
            }
        }
    }

    public int[] sumar(){
        int[] resultado=new int[v1.length];
        for (int i=0; i<this.v1.length; i++){
            resultado[i] =v1[i]+v2[i];
        }
        return resultado;

    }

    public void VectorSuma(int[] vector){
        for (int i=0; i<vector.length; i++){
            System.out.print(vector [i]+"");
        }
            System.out.println();
    }

    //// ejercicio escalar

    public int Escalar(){
        int producto=0;
        for (int i=0; i< v1.length; i++){
            producto= producto+ v1[i]*v2[i];
        }
        return producto;
    }

    //// ejercicio invertir vector

    public int [] invertir(int[] vector){
        int[] invertido= new int[vector.length];
        for (int i=0; i< vector.length; i++){
            invertido[i]=vector[vector.length-1-i];
        }
        return invertido;
    }

    // ejercicio multiplicar escalar
    public int [] multiplicarEscalar(int[]vector, int escalar){
        int[] resultado = new int [vector.length];
        for (int i=0; i< vector.length; i++){
            resultado[i] = vector[i]*escalar;
        }
        return resultado;
    }

}


////
