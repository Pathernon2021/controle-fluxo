public class ResultadoEscolar {
    public static void main(String[] args) {
      int nota =3;
      String resultado = nota >=7 ? "Aprovado" : nota >=5 ? "Recuperação" : "Reprovado" ;
      System.out.println(resultado);
    }
}
