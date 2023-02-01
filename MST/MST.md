# MST (Minimum Spanning Tree)
### 정의
가장 적은 비용으로 모든 노드를 연결하는 알고리즘
### 충족 조건
- 모든 노드를 포함할것
- 싸이클이 발생하지 않을 것
- 최소한의 간선만을 포함할것
### 해결방안
프림 알고리즘
크루스칼 알고리즘

## 프림 알고리즘
1. 시작 단계는 시작 노드만이 MST 집합에 속한다.
2. 트리 집합에 속한 정점들과 인접한 정점들 중 가장 낮은 가중치의 간선과 연결된 정점에 대해 간선과 정점을 MST 트리 집합에 넣는다. (사이클을 막기 위해 연결된 정점이 이미 트리가 속한다면 그 다음 순서를 넣는다.)
3. 2번 과정을 MST 집합의 원소개수가 그래프의 정점의 개수가 될때까지 반복한다.
### 시간복잡도
시작 노드에 연결된 노드와 간선길이를 priority queue 에 입력
사이클을 만들지 않고 길이가 작은 노드 선택 


### 해결방안
- priority queue 사용
- 싸이클 생성여부는?
  - 해당 노드를 방문한적이 없으면 된다. -> isVisited[] 
  - bfs / greedy 와 비슷한 구조

## 크루스칼 알고리즘
- 간선의 크기를 기준으로 정렬된 순서에 맞게 그래프에 포함
- 포함시키기 전에는 사이클 테이블 확인
- 사이클을 형성하는 경우 간선을 포함하지 않음

### 해결방안
union-find 사용
### 시간복잡도
- 정렬 알고리즘 + union-find 알고리즘 = 정렬 알고리즘 + 상수 = 정렬알고리즘의 시간복잡도
- c++ sort()를 이용하면,quick sort를 이용하기 때문에 Nlog(N)

## Prim vs Kruskal