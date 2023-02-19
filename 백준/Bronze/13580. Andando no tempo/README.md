# [Bronze IV] Andando no tempo - 13580 

[문제 링크](https://www.acmicpc.net/problem/13580) 

### 성능 요약

메모리: 11564 KB, 시간: 80 ms

### 분류

구현(implementation), 수학(math)

### 문제 설명

<p style="text-align:justify">최대 3번까지 사용할 수 있는 타임머신이 있고, 타임머신을 사용할 때마다 과거로 돌아갈 것인지 미래로 갈 것인지 선택할 수 있다고 상상해 보십시오. 기계에는 세 개의 고정 크레딧이 있습니다. 각 크레딧은 특정 연도를 나타내며 해당 연도를 과거 또는 미래로 이동하는 데 사용할 수 있습니다. 한 번, 두 번 또는 세 번의 여행을 할 수 있으며 이 세 크레딧은 각각 한 번만 사용할 수 있습니다. 예를 들어 크레딧이 5, 12, 9인 경우 두 번의 여행을 하기로 결정할 수 있습니다. 5년 후 미래로 이동한 다음 과거 9년 전으로 돌아갑니다. 그렇게 하면 4년 전인 2012년에 끝납니다. 또한 세 번의 여행을 할 수 있습니다. 모든 여행은 미래로 가고 순서에 관계없이 크레딧을 사용하여 2042년에 끝납니다.</p>  

<p style="text-align:justify">이 문제에서 기계의 세 가지 크레딧 값이 주어지면 프로그램은 시간을 여행하고 현재로 돌아가는 것이 가능한지 여부를 말해야 합니다. 적어도 한 번은 여행하고 최대 세 번은 여행을 해야 합니다. 항상 최대 한 번 세 크레딧을 각각 사용합니다.</p>

<details>
    <summary>원문</summary>

<p style="text-align:justify">Imagine que você tenha uma máquina do tempo que pode ser usada no máximo três vezes, e a cada uso da máquina você pode escolher voltar para o passado ou ir para o futuro. A máquina possui três créditos fixos; cada crédito representa uma certa quantidade de anos, e pode ser usado para ir essa quantidade de anos para o passado ou para o futuro. Você pode fazer uma, duas ou três viagens, e cada um desses três créditos pode ser usado uma vez apenas. Por exemplo, se os créditos forem 5, 12 e 9, você poderia decidir fazer duas viagens: ir 5 anos para o futuro e, depois, voltar 9 anos para o passado. Dessa forma, você terminaria quatro anos no passado, em 2012. Também poderia fazer três viagens, todas indo para o futuro, usando os créditos em qualquer ordem, terminando em 2042.</p>

<p style="text-align:justify">Neste problema, dados os valores dos três créditos da máquina, seu programa deve dizer se é ou não possível viajar no tempo e voltar para o presente, fazendo pelo menos uma viagem e, no máximo, três viagens; sempre usando cada um dos três créditos no máximo uma vez.</p>

</details>

### 입력 

 <p>입력은 세 개의 크레딧 A, B 및 C 값을 포함하는 라인으로 구성됩니다.</p>

<p>제한</p>

<ul>
	<li>1  ≤ A, B, C ≤ 1000</li>
</ul>

<details>
	<summary>원문</summary>

 <p>A entrada consiste de uma linha contendo os valores dos três créditos A, B e C.</p>

<p>Restrições</p>

<ul>
	<li>1  ≤ A, B, C ≤ 1000</li>
</ul>

</details>

### 출력 

 <p>당신의 프로그램은 여행과 현재로의 귀환이 가능하다면 문자 "S"를 포함하는 줄을 인쇄해야 하고 그렇지 않으면 "N"을 인쇄해야 합니다.</p>
 
 <details>
 	<summary>원문</summary>

 <p>Seu programa deve imprimir uma linha contendo o caracter “S” se é possível viajar e voltar para o presente, ou “N” caso contrário.</p>
 
</details>

<p> </p>

