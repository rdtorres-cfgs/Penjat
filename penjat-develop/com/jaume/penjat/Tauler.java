public class Tauler {
    char[] paraulaSecreta;
    int intents;
    String[] paraulaEndevinada;

    public Tauler(){

    }
    public void inicialitzarPartida(String paraula, int num){
        paraulaSecreta = paraula.toCharArray();
        paraulaEndevinada = new String[getParaulaSecreta().length];
        intents = num;
    }

    public char[] getParaulaSecreta(){
        return paraulaSecreta;
    }
    public int getIntents(){
        return intents;
    }
    public String verificar(String lletra){

        if(lletra.length() != 1){
            return "Lletra incorrecte";
        }
        else {
            boolean trobada = false;
            for (int i = 0; i < paraulaSecreta.length; i++){
                if (paraulaSecreta[i] == lletra.charAt(0)) {
                    paraulaEndevinada[i] = lletra;
                    trobada = true;
                }
            }
            if (!trobada) {
                intents--;
            }
            //Falta pasar paraulaEndevinada a String y hacer return
        }


    }
    public String[] getPalabraEndevinada(){
        return paraulaEndevinada;
    }
}