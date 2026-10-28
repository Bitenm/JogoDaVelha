# Jogo da Velha — regras e comportamento

## Participantes e objetivo

O jogo é disputado por dois jogadores em um tabuleiro de 3 linhas por 3 colunas. Cada jogador usa um símbolo próprio: `X` ou `O`.

O objetivo é formar uma sequência de três símbolos iguais.

## Início e turnos

A partida começa com todas as casas vazias. Os jogadores se alternam nos turnos. Em cada turno, o jogador atual escolhe uma casa vazia para marcar com o seu símbolo.

## Jogadas válidas e inválidas

- Uma casa vazia pode receber o símbolo do jogador atual.
- Uma casa que já possui um símbolo não pode ser marcada novamente.
- Não é permitido trocar ou remover uma marcação já feita.
- O jogador utiliza apenas o símbolo que lhe pertence.

## Vitória

Há vitória quando um jogador forma três símbolos iguais em qualquer uma das oito combinações possíveis:

- três linhas horizontais;
- três linhas verticais;
- duas diagonais.

O tabuleiro deve identificar qual símbolo venceu. A partida usa esse resultado para identificar o jogador vencedor.

## Empate

Há empate quando as nove casas estão preenchidas e nenhum símbolo formou uma sequência vencedora.

## Reinício

Ao reiniciar, todas as casas voltam ao estado vazio. A decisão de reiniciar deve ser feita por quem controla a partida ou pela interface, e não automaticamente pelo tabuleiro.
