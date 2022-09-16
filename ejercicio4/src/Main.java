public class Main {
    public static void main(String[] args) {
        int numeroIf = 0;
        if (numeroIf>0){
            System.out.println("El número es positivo");
        } else if (numeroIf<0) {
            System.out.println("El número es negativo");

        }else {
            System.out.println("El número es 0");
        }
        int numeroWhile = 0;
        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        do{
            System.out.println("Estoy en la ejecucion de do while");
            System.out.println(numeroWhile);
        }while(numeroWhile<3);
        for (int numeroFor=0;numeroFor<=3;numeroFor++ ){
            System.out.println(numeroFor);
        }
        String estacion = "primavera";
        switch (estacion){
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no es una estacion");
        }
    }
}