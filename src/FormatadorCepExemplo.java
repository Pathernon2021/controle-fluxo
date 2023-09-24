public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepinvalidoException e) {
            System.out.println("O cep corresponde com as regras de negócio");
        }
    }
    static String formatarCep(String cep) throws CepinvalidoException{
        if(cep.length() != 8)
         throw new CepinvalidoException();


          return "23.765-064";


    }
    }

