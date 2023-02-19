# [Bronze IV] Tri-du - 13597 

[문제 링크](https://www.acmicpc.net/problem/13597) 

### 성능 요약

메모리: 11500 KB, 시간: 80 ms

### 분류

구현(implementation)

### 문제 설명

<p>Tri-du는 Truco의 인기 게임에서 파생된 카드 게임입니다. 이 게임은 각 무늬가 13장씩 있는 표준 52장 덱을 사용하지만 무늬는 무시됩니다. 1에서 13까지의 정수로 간주되는 카드의 값만 사용됩니다.</p>

<p>게임에서 각 플레이어는 세 장의 카드를 받습니다. 규칙은 간단합니다.</p>

<ul>
	<li>쓰리 오브 어 카인드(같은 랭크의 세 장의 카드)는 더블(같은 랭크의 두 장의 카드)을 이깁니다.</li>
	<li>높은 가치의 카드로 구성된 트리오는 낮은 가치의 카드로 구성된 트리오를 이깁니다.</li>
	<li>더 높은 가치의 카드로 구성된 쌍은 더 낮은 가치의 카드로 구성된 쌍을 이깁니다.</li>
</ul>

<p>많은 상황에서 게임이 승리하지 못할 수 있습니다. 이 경우 처리된 카드는 덱으로 반환되고 셔플되고 새 게임이 시작됩니다.</p>

<p>플레이어는 이미 두 장의 카드를 받았고 그 값을 알고 있습니다. 당신의 임무는 세 번째 카드의 어떤 값이 이 플레이어가 게임에서 이길 확률을 최대화하는지 결정하는 프로그램을 작성하는 것입니다.</p>

<details>
	<summary>원문</summary>

<p>Tri-du é um jogo de cartas derivado do popular jogo de Truco. O jogo utiliza um baralho normal de 52 cartas, com treze cartas de cada naipe, mas os naipes são ignorados. Apenas o valor das cartas,considerados como inteiros de 1 a 13, são utilizados.</p>

<p>No jogo, cada jogador recebe três cartas. As regras são simples:</p>

<ul>
	<li>Um trio (três cartas de mesmo valor) ganha de uma dupla (duas cartas de mesmo valor).</li>
	<li>Um trio formado por cartas de maior valor ganha de um trio formado por cartas de menor valor.</li>
	<li>Uma dupla formada por cartas de maior valor ganha de uma dupla formada por cartas de menor valor.</li>
</ul>

<p>Note que o jogo pode não ter ganhador em muitas situações; nesses casos, as cartas distribuídas são devolvidas ao baralho, que é embaralhado e uma nova partida é iniciada</p>

<p>Um jogador já recebeu duas das cartas que deve receber, e conhece seus valores. Sua tarefa é escrever um programa para determinar qual o valor da terceira carta que maximiza a probabilidade de esse jogador ganhar o jogo.</p>

</details>

### 입력 

 <p>입력은 처리된 처음 두 카드의 값을 나타내는 A(1≤A≤13) 및 B(1≤B≤13)의 두 정수를 포함하는 단일 라인으로 구성됩니다.</p>
 
 <details>
 	<summary>원문</summary>

 <p>A entrada consiste de uma ´unica linha que contém dois inteiros, A (1 ≤ A ≤ 13) e B (1 ≤ B ≤ 13) indicando os valores das duas primeiras cartas recebidas.</p>
 
 </details>

### 출력 

 <p>프로그램은 플레이어의 게임 승리 확률을 최대화하는 카드의 값을 나타내는 정수로 한 줄을 생성해야 합니다.</p>
 
 <details>
 	<summary>원문</summary>

 <p>Seu programa deve produzir uma única linha com um inteiro representando o valor da carta que maximiza a probabilidade de o jogador ganhar a partida.</p>
 
 </details>

