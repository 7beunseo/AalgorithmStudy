## DIVDE & CONQUER
* 분할 > 정복 > 통합 
* `재귀적` 방법으로 분할하고 정복하여 해결함 
* `top-down` 접근 방식 

#### top-down
```text
기능, 구조 위주 = 모듈 단위
여러개의 작은 부분으로 문제를 나누어 구체화하여 해결책을 찾음
```

#### Button-up
```text
데이터 위주 = 객체 단위
구체적인 데이터 간의 상호 관계를 정의하여 상향식으로 해결책을 찾음 
```

#### DIVIDE & CONQUER 기본 방식
```text
if(SMALL(p, q)) then return G(p, q)

m = DIVIDE(p, q)
return COMBINE(D&C(p, m), D&C(m + 1, q))
```
```text
T(n) = { g(n) (if n is small enough)
       { f(n) + 2T(n/2) (otherwise)
       
g(n) = 충분히 작을 때 수행 횟수
f(n) = divide, combine 하는데 수행하는 횟수 
T(n) = 입력이 n일 때 전체 수행 횟수
```

#### 이분 검색 v재귀
```text
T(1) = 1
T(n) = 1 + T(n/2)
...
T(n) = k + T(n/2^k)
n = 2^k, k = logn
T(n) = logn + T(1) = logn + 1

=> O(n)
```
```text
결과가 없으면 p>q 호출이 한번 더 일어난다는 것 조심하기!!
```

#### 합병 정렬
```text
1. S[1...n/2], S[n/2 + 1 ... n] 2개의 set로 split
2. each set is individually sorted
3. signe sorted sequence로 merge
```
```text
merge하는데 걸리는 시간 = h + m - 1 = n - 1 (h비교 끝, m - 1까지 비교하는 경우)
T(n) = T(h) + T(m) + h + m - 1
     = 2(T(n/2)) + n - 1

T(n) = { 1 (n = 1)
       { n - 1 + 2T(n/2) (n > 1)
       
T(1) = 1
T(n) = 2T(n/2) + an (a는 상수)
2(T(n/2)) = 4T(n/2) + an
...
T(n) = 2T(n/2^k) + kan
n = 2^k, k = logn
T(n) = 2T(1) + anlogn

=> O(nlong)
```
```text
제자리정렬 = 입력 값을 저장하는 것 외에 저장공간을 사용하지 않음
=> 병합 정렬은 제자리정렬이 아니다.

n(n/2 + n/2) + n/2 + n/4 + ... 대락 2n정도의 저장공간이 추가로 필요하다.
```

#### 퀵정렬
```text
partition exchange sort = 분할 교환 정렬

choose element x,
A = A(A1, x, A2) (partition or splitting 이라 부름)
A1 < x, A2 > x 
x를 pivote, partition point라고 부름 
```

```text
* worst case
n + 1, n, n, ..., 2 => O(n^2)

* average case 
divide 하는데 걸리는 시간 = n + 1 (0 ~ n + 1)
partition 하여 k위치에 있을 확률 = 1/n
T(n) = n + 1 + 1/n * Σ (T(k - 1) + T(n - k))
     = n + 1 + 1/n * 2(T(0) + ... + T(n - 1))
     
전체에 n을 곱하면
nT(n) = n(n + 1) + 2(T(0) + ... + T(n - 1)) ... 식1

n에 n -1 을 대입하면 
(n - 1)T(n - 1) = (n - 1)n + 2(T(0) + ... + T(n - 2)) ... 식2

식1 - 식2
nT(n) - (n - 1)T(n - 1) = n(n + 1 - n + 1) + 2(T(n - 1))
nT(n) = 2n + T(n - 1)(n + 1)

전체를 n(n + 1)로 나눔
T(n)/(n + 1) = 2/(n + 1) + T(n - 1)/n

... 계산 생략
=> O(nlogn)

* best case
// 교안에 없어 추측한 내용
p 값이 중앙 값인 경우 n/2만큼 분할됨
T(n) = n + 1 + 2T(n/2)

=> O(nlogn)
```

#### selection
```text
* worst csae
O(n^2)

* best case
O(n)
```