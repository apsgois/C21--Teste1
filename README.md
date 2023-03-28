# C214---TESTE
Exercico para praticar sobre teste: 

Alunos: Ana Paula Serafim de Góis, Pedro Henrique Ribeiro

Questão 1)
Teste uma classe responsável por popular uma página WEB com informações referentes ao horário de atendimento dos professores do Inatel. O horário de
atendimento é retornado por um servidor remoto em um JSON em formato String.
Não é necessário demonstrar o funcionamento da página WEB, somente o teste.


Observações:
• Crie pelo menos 10 testes para cenários de sucesso e 10 para falha.
• Caso a sala seja (1-5) o prédio escolhido no array "predio"deve ser 1. Caso seja
(6 - 10) o prédio é o 2 e assim por diante.
• Utilize a linguagem da sua escolha para realizar os testes.
• Caso seja necessário, os objetos mock podem ser criados manualmente ou utilizando alguma biblioteca.
• O último código feito em aula pode ser encontrado em: https://github.com/
chrislima-inatel/C214/tree/main/aula-07-mock
• O uso correto de versionamento e gerência de dependências será avaliado. Levar
em consideração o gitignore.
1
• Considere que o JSON retornado pelo servidor remoto possui, no mínimo, a
seguinte estrutura:

{
  "nomeDoProfessor": "<nome_do_professor",
  "horarioDeAtendimento": "<horario_de_atendimento>",
  "periodo": "<integral_ou_noturno>",
  "sala": "<sala_de_atendimento>",
  "predio": [
    "1",
    "2",
    "3",
    "4",
    "6"
  ]
}
