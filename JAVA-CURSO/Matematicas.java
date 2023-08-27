public class Matematicas {
    public static void main(String[] args) {
        int radio =(int) (Math.random()*10+1);//radio es un aleatorio entre 1 y 10
        int n=5, m=5;
        double resultado = Math.pow(n, m);
        double raiz =Math.sqrt(resultado);
        double area= Math.PI*radio*radio;
        System.out.println("\n"+n +" elevado a " +m+ " = "+(int)resultado);
        System.out.println("La raiz cuadrada de "+(int)resultado+ " es "+raiz);
        System.out.println("El area de un circulo de radio "+radio+" es "+area);
        System.out.println("El area redondeada es: "+Math.round(area));
        System.out.println("El area por arriba es: "+Math.ceil(area));
        System.out.println("El area por debajo es: "+Math.floor(area));
        System.out.println("la raizcuadra de -2 es un NaN: "+Double.isNaN(Math.sqrt(-2)));
        System.out.println("1.0/0.0 = Infinity:"+(Double.isInfinite(1.0/0.0))+"\n");
        
    
    }
}
