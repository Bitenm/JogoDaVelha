package Classes;

public class Tabuleiro {
    Simbolo[][] tabuleiro = new Simbolo[3][3];

    public Tabuleiro() {
        preenchendoVazio();
    }

    private void preenchendoVazio(){
        for (int i = 0; i < tabuleiro.length ; i++) {
            for (int j = 0; j < tabuleiro[i].length ; j++) {
                tabuleiro[i][j] = Simbolo.VAZIO;
            }
        }
    }

    public boolean marcar(int linhas, int colunas, Simbolo simbolo){
        if(tabuleiro[linhas][colunas] == Simbolo.VAZIO){
            tabuleiro[linhas][colunas] = simbolo;
            return true;
        } else{
            return false;
        }
    }

    // passa os campos para validacao
    public Simbolo verificarVitoria(){
        // linhas horizontal
        for (int i = 0; i < tabuleiro.length ; i++) {
            Simbolo simbolo = tabuleiro[i][0];
            if(temSequenciaVencedor(simbolo, tabuleiro[i][1], tabuleiro[i][2])){
                return simbolo;
            }
        }

        // colunas verticais
        for (int i = 0; i < tabuleiro.length ; i++) {
            Simbolo simbolo = tabuleiro[0][i];
            if(temSequenciaVencedor(simbolo, tabuleiro[1][i], tabuleiro[2][i])){
                return simbolo;
            }
        }

        // diagonais
        if(temSequenciaVencedor(tabuleiro[0][0], tabuleiro[1][1] ,tabuleiro[2][2])){
            return tabuleiro[0][0];
        } else if(temSequenciaVencedor(tabuleiro[0][2], tabuleiro[1][1] ,tabuleiro[2][0])){
            return tabuleiro[0][2];
        }

        return Simbolo.VAZIO;

    }

    // verifica se todos simbolos sao iguais
    private boolean temSequenciaVencedor(Simbolo simbolo1, Simbolo simbolo2, Simbolo simbolo3){
        if(simbolo1 != Simbolo.VAZIO && simbolo1 == simbolo2 && simbolo1==simbolo3){
            return true;
        } else{
            return false;
        }
    }

    // verificar Empate
    public boolean verificarEmpate(){
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if(tabuleiro[i][j] == Simbolo.VAZIO){
                    return false;
                }

            }
        }

        return true;
    }

    // reiniciar campos
    public void reiniciar(){
        for (int i = 0; i < tabuleiro.length ; i++) {
            for (int j = 0; j < tabuleiro[i].length ; j++) {
                tabuleiro[i][j] = Simbolo.VAZIO;
            }
        }
    }


}
